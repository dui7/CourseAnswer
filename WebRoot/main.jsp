<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>课程答疑系统后台管理</title>
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="easyui/demo/demo.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script src="easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	$(function() {
		$("#tree").tree({
			lines : true,
			url : "authaction.action",
			onLoadSuccess : function() {//当加载完成时候调用
				$("#tree").tree("expandAll");//展开所有树
			},
			onClick : function(node) {
				if (node.text == "安全退出") {
					logout();
				} else if (node.text == "修改密码") {
					openPasswordModifyDialog();
				} else if (node.attributes.authPath)
					openTab(node);
			}

		});
		function logout() {
			$.messager.confirm("系统提示", "确定退出吗", function(r) {
				if (r)
					window.location.href = 'logout.action';
			});
		}
		function openTab(node) {
			if ($("#tabs").tabs("exists", node.text)) {//表明指定的面板是否存在，'node.text'参数可以是选项卡面板的标题或索引。
				$("#tabs").tabs("select", node.text);//选择一个选项卡面板，'node.text'参数可以是选项卡面板的标题或者索引
			} else {

				var contents = "<iframe frameborder=0 scrolling='auto' style='width:100%;height:100%' src="
						+ node.attributes.authPath + "></iframe>";
		
				$('#tabs').tabs('add', {
					title : node.text,
					iconCls : node.iconCls,
					closable : true,//在设置为true的时候，选项卡面板将显示一个关闭按钮，在点击的时候会关闭选项卡面板。
					content : contents
				//选项卡面板的内容。
				});

			}
		}

	});
	function openPasswordModifyDialog() {

		$("#dialog").dialog("open").dialog("setTitle", "修改密码");
	}
	function modifyPassword() {
		$("#form").form({
			url : '',
			onSubmit : function() {
				if(!$(this).form("validate"))
				return false
				if(oldPassword!='${currentUser.password}'){
					$.messager.alert('系统提示','用户名密码输入错误！');
					return false;
				}
				if(newPassword!=newPassword2){
					$.messager.alert('系统提示','确认密码输入错误！');
					return false;
				}
				return true;
			},
			success : function(data) {
				alert(data);

			}
		}

		);
	}
	function closePasswordModifyDialog(){
		$("#dialog").dialog("close");
		$("#oldPassword").val("");
		$("#newPassword").val("");
		$("#newPassword2").val("");
	}
</script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height: 30px; padding: 5px;"><h2 style="color="#f">课程答疑系统</h2><p>Welcome
		${adminUser.userName}</p></div>
	<div data-options="region:'west',title:'导航菜单'" style="width: 200px">
		<ul id="tree" class="easyui-tree"></ul>

	</div>
	<!-- west -->

	<div data-options="region:'center'">
		<div class="easyui-tabs" data-options="border:false,fit:true"
			id="tabs">
			<div title="首页" data-options="iconCls:'icon-home'">首页</div>
		</div>

	</div>
	<div data-options="region:'south',border:false" style="height: 15px;">this
		is footer</div>
	<div id="dialog" class="easyui-dialog" title="修改密码"
		style="width: 400px; height: 200px;"
		data-options="iconCls:'modifyPassword',resizable:false,modal:true"
		closed="true" buttons="#button">
		<form id="form" method="post">
			<table cellspacing="4px;">
				<tr>
					<td>用户名：</td>
					<td><input type="hidden" name="userId" id="userId"
						value="${currentUser.userId }"><input type="text"
						name="userName" id="userName" readonly="readonly"
						value="${currentUser.userName }" style="width: 200px;" /></td>
				</tr>
				<tr>
					<td>原密码：</td>
					<td><input type="password" class="easyui-validatebox"
						name="oldPassword" id="oldPassword" style="width: 200px;"
						required="true" /></td>
				</tr>
				<tr>
					<td>新密码：</td>
					<td><input type="password" class="easyui-validatebox"
						name="newPassword" id="newPassword" style="width: 200px;"
						required="true" /></td>
				</tr>
				<tr>
					<td>确认新密码：</td>
					<td><input type="password" class="easyui-validatebox"
						name="newPassword2" id="newPassword2" style="width: 200px;"
						required="true" /></td>
				</tr>
			</table>
		</form>

	</div>
	<div id="button">
		<a href="javascript:modifyPassword()" class="easyui-linkbutton" iconCls="icon-ok">保存</a> 
		<a
			href="javascript:closePasswordModifyDialog()"
			class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>
</body>
</html>