/**
 * 用户列表
 */
var pageCurr;
$(function() {
    layui.use('table', function(){
        var table = layui.table
            ,form = layui.form;

        tableIns=table.render({
            elem: '#uesrList'
            ,url:'/findAll'
            ,method: 'post' //默认：get请求
            ,page: true
            ,cols: [
                [
                {type:'numbers'}
                ,{field:'id', title:'ID'}
                ,{field:'name', title:'用户名'}
                ,{field:'password', title: '密码',}
                ,{fixed:'right', title:'操作', width:140,align:'center', toolbar:'#optBar'}
                ]
                    ]
            ,  done: function(res, curr, count){
                pageCurr=curr;
            }
        });
    });
});