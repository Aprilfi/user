
$(function(){
    $(function () { $('#collapseOne').collapse('hide')});

    $('#table').bootstrapTable({
        url: "/admin/findByPage.do",//这个接口需要处理bootstrap table传递的固定参数
        method: 'post',
        toolbar: '#toolbar',    //工具按钮用哪个容器
        cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,     //是否显示分页
        dataType: "json",
        //search: true,
        sortable: true,
        sortOrder: "asc",
        disabled: false,        //排序方式
        contentType:"application/x-www-form-urlencoded",
        pageNumber: 1,      //初始化加载第一页，默认第一页
        pageSize: 5,      //每页的记录行数
        pageList: [5, 10, 25, 50, 100],  //可供选择的每页的行数
        sidePagination: "server",   //分页方式：client客户端分页，server服务端分页
        showRefresh: false,     //是否显示刷新按钮
        //showColumns: true,      //是否显示所有的列
        clickToSelect: true,    //是否启用点击选中行
        buttonsAlign:"right",  //按钮位置
        detailView: true,       //父子表
        showExport: true,       //显示导出
        striped: true,          //隔行变色
        exportDataType: "basic",
        //showToggle:true,       //是否显示详细视图和列表视图的切换按钮
        sortName : "baseDocumentId",
        locale: 'zh-CN',//中文支持,
        queryParamsType:'',
        queryParams: function queryParams(params) {
            var param = {
                pageNumber: params.pageNumber,
                pageSize: params.pageSize,

                username: $('#search_username').val(),
                organizationid: $('#search_organizatiname').val(),
                phonenumber: $('#search_phonenumber').val(),
                useabe: $('#search_useabe').val(),
                gender: $('#search_gender').val()
            };
            return param;
        },
        columns: [{
            title: "全选", field: "select", checkbox: true, width: 20,align: "center",valign: "middle"//垂直
        }, {
            field: 'userid',
            visible: false,
        }, {
            field: 'username',
            title: '用户名',
            align: "center",

        }, {
            field: 'organizationid',
            visible:false,
        }, {
            field: 'organizatinname',
            title: '组织结构名称',
            align: "center",

        }, {
            field: 'phonenumber',
            title: '联系电话',
            align: "center",

        }, {
            field: 'useabe',
            title: '是否可用',
            align: "center",
            editable: {
                type: 'select',
                title: '是否可用',
                source: [{ value: "Y", text: "可用" }, { value: "N", text: "不可用" }],
            },
        }, {
            field: 'birthdate',
            title: '出生日期',
            align: "center",
            // formatter: function (value, row, index) {
            //     return new Date(parseInt(("/Date("+row.birthdate+")/").substr(6, 13))).toLocaleDateString();
            // },

        }, {
            field: 'gender',
            title: '性别',
            align: "center",

        },{
            field: 'description',
            title: '用户描述',
            align: "center",
            editable: {
                type: 'text',
                title: '用户描述',
                validate: function (v) {
                    if (!v) return '用户描述不能为空';
                }
            },
        },{
            field: "operation",
            title: "操作",
            formatter: function (value, row, index) {
                var edit =
                    '<button type="button" class="btn btn-default" onclick="javascript:showUpdateModal(\'' +
                    row.userid + '\',\'' + row.username
                    + '\',\'' + row.organizationid + '\',\'' + row.organizatinname +
                    '\',\'' +row.phonenumber + '\',\''
                    + row.useabe + '\',\'' + row.birthdate
                    + '\',\'' + row.gender + '\',\'' + row.description + '\')"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>更新</button>';
                var del = '<button type="button" class="btn btn-default" onclick="javascript:dels(\'' +
                    row.userid +
                    '\')"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除</button>';
                return edit + del;
            },
            align: "center",
            height:'100px'
        }],
        //注册加载子表的事件。注意下这里的三个参数！
        onExpandRow: onExpandRow,
        paginationPreText: "上一页",
        paginationNextText: "下一页",
    });

    //父子表
    function onExpandRow(index, row, $detail){
        InitSubTable(index, row, $detail);
    }
    //初始化子表格(无线循环)
    InitSubTable = function (index, row, $detail) {
        var parentid = row.organizationid;
        var cur_table = $detail.html('<table></table>').find('table');
        $(cur_table).bootstrapTable({
            url: '/admin/findByOrganizationId.do',
            method: 'post',
            dataType: "json",
            contentType:"application/x-www-form-urlencoded",
            pagination: false,
            cache: false,
            rowStyle: function (row, index) {
                return {classes: 'warning'};
            },
            queryParamsType:'',
            queryParams: function queryParams(params) {
                var param = {
                    parentid: parentid,
                };
                return param;
            },
            uniqueId: "organizationid",
            columns: [ {
                field: 'organizationid',
                visible:false,
            }, {
                field: 'organizatinname',
                title: '组织结构名称',
                align:"center",
            }, {
                field: 'parentid',
                visible:false,
            }, {
                field: 'parentname',
                title: '上级组织结构名称',
                align:"center",
            },{
                field: 'description',
                title: '描述',
                align:"center",

            },{
                field: 'address',
                title: '地址',
                align:"center",
            },{
                field: 'connectphone',
                title: '联系电话',
                align:"center",
            },{
                field: 'managerid',
                visible:false,
            },{
                field: 'managername',
                title: '负责人',
                align:"center",
            },{
                field: 'organizationtype',
                title: '档案类型',
                align:"center",
            }, ],
        });
    };
    //更新数据
    $("#updateRecord").click(function(){
        $("#organizationid").val($("#update_organizatinname").val().split(",")[0]);
        $("#organizatinname").val($("#update_organizatinname").val().split(",")[1]);

        var data = $("#updateForm").serialize();
        $.ajax({
            url: "/admin/updateById.do",
            dataType: "json",
            type: "post",
            data: data,
            success: function (req){
                if (req) {
                    $('#updateModal').modal('hide');
                    $('#table').bootstrapTable('refresh');
                    toastr.success('更新成功!');
                } else {
                    toastr.error('更新失败!');
                }
            },
            error: function(req){}
        });
    });

    $('#btn_add').on("click", function () {
        $.ajax({
            url : "/admin/findOrganizationItem.do", //所需要的列表接口地址
            type : "post",
            dataType : "json",
            success : function(result) {
                var h = "";
                $.each(result, function(key, value) {

                    h += "<option value='" + value.organizationid + "," + value.organizatinname + "'>" + value.organizatinname //下拉框序言的循环数据
                        + "</option>";
                });
                $("#joke_organizatinName").append(h);//append 添加进去并展示
            }
        });
    // .on('hidden.bs.modal', function () {})
        $("#myModal").modal().on("shown.bs.modal", function () {
        });

    });

    //添加数据
    $("#addRecord").click(function(){
        $("#addForm").data('bootstrapValidator').validate();
        if(!$("#addForm").data('bootstrapValidator').isValid()){
            toastr.success('提交失败!');
            return ;
        };
        $("#txt_organizationId").val($("#joke_organizatinName").val().split(",")[0]);
        $("#txt_organizatinname").val($("#joke_organizatinName").val().split(",")[1]);

        var data = $("#addForm").serializeArray();
        $.ajax({
            url: "/admin/addUser.do",
            dataType: "json",
            type: "post",
            data: data,
            success: function (req){
                if (req) {
                    $('#addModal').modal('hide');
                    $('#table').bootstrapTable('refresh');
                    $('#txt_username').val("");
                    $('#txt_description').val("");
                    toastr.success('添加成功!');
                    return;
                }
                //捕获页
                toastr.error('添加失败!');
            },
            error: function(req){}
        });
    });



    //获取选择ID
    function getIdSelections() {
        return $.map($('#table').bootstrapTable('getSelections'), function(row) {
            return row.orderid
        });
    }



});
//显示更新模态框
function showUpdateModal(userid, username, organizationid, organizatinname
    , phonenumber, useabe, birthdate, gender, description){
    $.ajax({
        url : "/admin/findOrganizationItem.do", //所需要的列表接口地址
        type : "post",
        dataType : "json",
        success : function(result) {
            var h = "";
            $.each(result, function(key, value) {
                h += "<option value='" + value.organizationid + "," + value.organizatinname + "'>" + value.organizatinname //下拉框序言的循环数据
                    + "</option>";
            });
            $("#update_organizatinname").append(h);//append 添加进去并展示
        }
    });
    $("#userid").val(userid);
    $("#username").val(username);
    $("#update_organizatinname").find("option[value='" + organizationid+',' + organizatinname + "']").attr("selected",true);
    $("#phonenumber").val(phonenumber);
    $("#useabe").val(useabe);
    $("#birthdate").val(birthdate);
    $("#gender").val(gender);
    $("#description").val(description);
    $('#updateModal').modal('show');
}

//删除记录
function dels(ids) {
    if(confirm("确定删除选中记录吗?")){
        if(undefined == ids){
            ids = getIdSelections();
            //捕获页
            toastr.warning('请选择一行及以上的数据');
        }

        $.ajax({
            url : "/admin/deleteById.do",
            type : "post",
            dataType : "text",
            data:{ids:ids},
            success : function(req) {
                if (req) {
                    $('#table').bootstrapTable('refresh');
                    toastr.success('删除成功');
                    return;
                }
                toastr.error('删除失败');

            },
            error : function(req) {}
        });
    }
};

// 13位时间戳转换
function dateFormatter(date) {
    var list = new Date(parseInt(("/Date("+date+")/").substr(6, 13))).toLocaleDateString().split("/");
    if (list[1] < 10) {
        list[1] = "0" + list[1];
    }
    if (list[2] < 10) {
        list[2] = "0" + list[2];
    }
    return list[0] + "-" + list[1] + "-" + list[2];
}