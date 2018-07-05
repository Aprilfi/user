<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Bootstrap-Table</title>
    <link href="../../bootstrap/Content/bootstrap.min.css" rel="stylesheet" />
    <link href="../../bootstrap/Content/bootstrap-editable.css" />
    <link href="../../bootstrap/Content/bootstrap-table.min.css" rel="stylesheet" />
    <link href="../../bootstrap/Content/bootstrapValidator.min.css" rel="stylesheet"/>

    <style>
        #search{
            text-decoration: none;
            display: block;
        }
    </style>
</head>
<body>
</select>
        <div class="panel-body" style="padding-bottom:0px;"  id="accordion">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a id="search" class="glyphicon glyphicon-search" data-toggle="collapse" data-parent="#accordion"
                           href="#collapseOne">
                        </a>
                    </h4>
                </div>
                <div id="collapseOne" class="panel-collapse collapse in">
                    <div class="panel-body">
                        <form role="form" action="javascript:void(0)" id="searchForm">
                            <div class="form-group">
                                <label for="txt_username">用户姓名</label>
                                <input type="text" name="username" class="form-control"
                                       placeholder="用户姓名">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div id="toolbar" class="btn-group">
                <button id="btn_add" type="button" class="btn btn-default">
                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
                </button>
            </div>
            <table id="table"></table>

        </div>

        <%--弹出层-增加--%>
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel_add">添加用户</h4>
                    </div>
                    <div class="modal-body">
                        <form role="form" action="javascript:void(0)" id="addForm">
                        <div class="form-group">
                            <label for="txt_username">用户姓名</label>
                            <input type="text" name="username" data-bind="value:username" class="form-control"
                                   id="txt_username"
                                   placeholder="用户姓名">
                        </div>
                        <input type="text" hidden="hidden" name="organizationid" id="txt_organizationId">
                        <input type="text" hidden="hidden" name="organizatinname" id="txt_organizatinname">
                        <div class="form-group">
                            <label for="txt_organizatinName">组织结构名称</label>
                            <select class="form-control" id="joke_organizatinName">

                            </select>
                        </div>
                        <div class="form-group">
                            <label for="txt_gender">性别</label>
                            <select class="form-control" name="gender" id="txt_gender">
                                <option value="男">男</option>
                                <option value="女">女</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="txt_description">用户描述</label>
                            <textarea type="text" name="description" data-bind="value:description" class="form-control"
                                   id="txt_description"
                                      placeholder="用户描述"></textarea>
                        </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭</button>
                        <button type="button" id="addRecord" class="btn btn-primary" data-dismiss="modal"><span
                                class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>保存</button>
                    </div>
                </div>
            </div>
        </div>

        <%--弹出层-修改--%>
        <!-- 更新 -->
        <div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="myModalLabel_update">更新记录</h4>
                    </div>
                    <div class="modal-body">
                        <form role="form" action="javascript:void(0)" id="updateForm">
                            <input type="text" hidden="hidden" name="userid" id="userid">
                            <div class="form-group">
                                <input type="text" class="form-control" name="username" id="username">
                            </div>
                            <input type="text" hidden="hidden" name="organizationid" id="organizationid">
                            <input type="text" hidden="hidden" name="organizatinname" id="organizatinname">
                            <div class="form-group">
                                <select class="form-control" id="update_organizatinname">

                                </select>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="phonenumber" id="phonenumber">
                            </div>
                            <div class="form-group">
                                <select class="form-control" name="useabe" id="useabe">
                                    <option value="Y">可用</option>
                                    <option value="N">不可用</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <input type="date" class="form-control" name="birthdate" id="birthdate">
                            </div>
                            <div class="form-group">
                                <select class="form-control" name="gender" id="gender">
                                    <option value="男">男</option>
                                    <option value="女">女</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <textarea class="form-control" rows="3" name="description" id="description"></textarea>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="button" class="btn btn-primary" id="updateRecord">提交</button>
                    </div>
                </div>
            </div>
        </div>

<script src="../../bootstrap/Scripts/jquery-1.9.1.min.js"></script>
<script src="../../bootstrap/Scripts/bootstrap.min.js"></script>
<script src="../../bootstrap/Scripts/bootstrap-editable.js"></script>
<script src="../../bootstrap/Scripts/bootstrap-table/bootstrap-table.min.js"></script>
<script src="../../bootstrap/Scripts/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="../../bootstrap/Scripts/bootstrap-table-editable.js"></script>
<script src="../../bootstrap/Scripts/bootstrapValidator.js"></script>
<script src="../../layer-v3.1.1/layer/layer.js"></script>

<%--table-crud--%>
<script src="../../content/crud.js"></script>

<%--form validater--%>
<script src="../../content/validator.js"></script>

<script type="text/javascript">
    $(function() {
        $(function () {
            $('#collapseOne').collapse('hide')
        });
    });
</script>
</body>
</html>
