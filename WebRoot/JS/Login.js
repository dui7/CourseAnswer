// JavaScript Document


function check()
{
var username = document.userMsg.username.value;
var password = document.userMsg.password.value;
if(username=='' || username==null )
{
$("#username").css("border","1px solid #f00");
return false;
}
if(password=='' || password==null )
{
$("#result").html("请输入密码");
return false;
}
}



