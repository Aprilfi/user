function addformValidator() {
    $("#addForm").bootstrapValidator({
        live: 'enabled',//验证时机，enabled是内容有变化就验证（默认），disabled和submitted是提交再验证
        excluded: [':disabled', ':hidden', ':not(:visible)'],//排除无需验证的控件，比如被禁用的或者被隐藏的
        submitButtons: '#addRecord',//指定提交按钮，如果验证失败则变成disabled，但我没试成功，反而加了这句话非submit按钮也会提交到action指定页面
        feedbackIcons: {//根据验证结果显示的各种图标
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            username: {
                message: '用户名不符合要求',
                validators: {
                    notEmpty: {
                        message: '用户名不能为空'
                    },
                    stringLength: {//检测长度
                        min: 2,
                        max: 15,
                        message: '长度必须在4-12之间'
                    }
                }
            },
            description: {
                message: '描述不符合要求',
                validators: {
                    notEmpty: {
                        message: '描述不能为空'
                    },
                    stringLength: {//检测长度
                        min: 6,
                        max: 100,
                        message: '长度必须在6~100之间'
                    }
                }
            },
        }
    });
}

function updateformValidator(){
        $("#updateForm").bootstrapValidator({
            live: 'enabled',//验证时机，enabled是内容有变化就验证（默认），disabled和submitted是提交再验证
            excluded: [':disabled', ':hidden', ':not(:visible)'],//排除无需验证的控件，比如被禁用的或者被隐藏的
            submitButtons: '#updateRecord',//指定提交按钮，如果验证失败则变成disabled，但我没试成功，反而加了这句话非submit按钮也会提交到action指定页面
            feedbackIcons: {//根据验证结果显示的各种图标
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                username: {
                    message: '用户名不符合要求',
                    validators: {
                        notEmpty: {
                            message: '用户名不能为空'
                        },
                        stringLength: {//检测长度
                            min: 2,
                            max: 15,
                            message: '长度必须在4-12之间'
                        }
                    }
                },
                phonenumber: {
                    message: '号码不符合要求',
                    validators: {
                        notEmpty: {
                            message: '号码不能为空'
                        },
                        stringLength: {//检测长度
                            min: 4,
                            max: 11,
                            message: '可以为座机号码和手机号码'
                        }
                    }
                },
                description: {
                    message: '描述不符合要求',
                    validators: {
                        notEmpty: {
                            message: '描述不能为空'
                        },
                        stringLength: {//检测长度
                            min: 6,
                            max: 100,
                            message: '长度必须在6~100之间'
                        }
                    }
                },
            }
        });
}

var initToastr = function(){
    toastr.options= {
        closeButton: false,  //是否显示关闭按钮
        debug: false,   //是否为调试
        progressBar: true,  //是否显示进度条
        positionClass: "toast-bottom-right",  //在页面中显示的位置
        onclick: null,  //点击事件
        showDuration: "3000",  //显示动作时间
        hideDuration: "3000",  //隐藏动作时间
        timeOut: "3000",  //自动关闭超时时间
        extendedTimeOut: "1000",   //加长展现时间
        showEasing: "swing",
        hideEasing: "linear",
        preventDuplicates: true ,
        preventOpenDuplicates: true, //重复内容的提示框在开启时只出现一个
        showMethod: "fadeIn",  //显示的方式
        hideMethod: "fadeOut" //隐藏的方式
    };
};