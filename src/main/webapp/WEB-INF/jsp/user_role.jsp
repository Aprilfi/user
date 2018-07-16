<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bootstrap Tree View</title>
    <link href="../../bootstrap/Content/bootstrap.css" rel="stylesheet">
    <link href="../../bootstrap/Content/treeview/bootstrap-treeview.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>Bootstrap Tree View - DOM Tree</h1>
    <br/>
    <div class="row">
        <hr>
        <h2>Disabled Tree</h2>
        <div class="col-md-8">
            <h2>Tree</h2>
            <div id="treeview-disabled" class=""></div>
        </div>
    </div>
</div>
<script src="../../bootstrap/Scripts/jquery_3.2.1.min.js"></script>
<script src="../../bootstrap/Scripts/treeview/bootstrap-treeview.js"></script>
<script type="text/javascript">
    $(function () {
        var defaultData = [
            {
                text: 'Parent 1',
                href: '#parent1',
                tags: ['4'],
                nodes: [
                    {
                        text: 'Child 1',
                        href: '#child1',
                        tags: ['2'],
                        nodes: [
                            {
                                text: 'Grandchild 1',
                                href: '#grandchild1',
                                tags: ['0']
                            },
                            {
                                text: 'Grandchild 2',
                                href: '#grandchild2',
                                tags: ['0']
                            }
                        ]
                    },
                    {
                        text: 'Child 2',
                        href: '#child2',
                        tags: ['0']
                    }
                ]
            },
            {
                text: 'Parent 2',
                href: '#parent2',
                tags: ['0']
            },
            {
                text: 'Parent 3',
                href: '#parent3',
                tags: ['0']
            },
            {
                text: 'Parent 4',
                href: '#parent4',
                tags: ['0']
            },
            {
                text: 'Parent 5',
                href: '#parent5'  ,
                tags: ['0']
            }
        ];

        var $disabledTree = $('#treeview-disabled').treeview({
            data: defaultData,
            onNodeDisabled: function(event, node) {
                $('#disabled-output').prepend('<p>' + node.text + ' was disabled</p>');
            },
            onNodeEnabled: function (event, node) {
                $('#disabled-output').prepend('<p>' + node.text + ' was enabled</p>');
            },
            onNodeCollapsed: function(event, node) {
                $('#disabled-output').prepend('<p>' + node.text + ' was collapsed</p>');
            },
            onNodeUnchecked: function (event, node) {
                $('#disabled-output').prepend('<p>' + node.text + ' was unchecked</p>');
            },
            onNodeUnselected: function (event, node) {
                $('#disabled-output').prepend('<p>' + node.text + ' was unselected</p>');
            }
        });

    });
</script>
</body>
</html>
