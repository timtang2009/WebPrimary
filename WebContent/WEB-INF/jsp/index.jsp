<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style type="text/css">
html{   
    width: 100%;   
    height: 100%;   
    overflow: hidden;   
    font-style: sans-serif;   
}   
body{   
    width: 100%;   
    height: 100%;   
    font-family: 'Open Sans',sans-serif;   
    margin: 0;   
    background-color:#D3D3D3;   
}   
#login{   
    position: absolute;   
    top: 50%;   
    left:50%;   
    margin: -150px 0 0 -150px;   
    width: 300px;   
    height: 300px;   
}   
#login h1{   
    color: #fff;   
    text-shadow:0 0 10px;   
    letter-spacing: 1px;   
    text-align: center;   
}   
h1{   
    font-size: 2em;   
    margin: 0.67em 0;   
}   
input{   
    width: 278px;   
    height: 18px;   
    margin-bottom: 10px;   
    outline: none;   
    padding: 10px;   
    font-size: 13px;   
    color: #000000;   
    text-shadow:1px 1px 1px;   
    border-top: 1px solid #312E3D;   
    border-left: 1px solid #312E3D;   
    border-right: 1px solid #312E3D;   
    border-bottom: 1px solid #56536A;   
    border-radius: 4px;   
    background-color: #F5F5F5;   
}   
.but{   
    width: 300px;   
    min-height: 20px;   
    display: block;   
    background-color: #4a77d4;   
    border: 1px solid #3762bc;   
    color: #fff;   
    padding: 9px 14px;   
    font-size: 15px;   
    line-height: normal;
    border-radius: 5px;   
    margin: 0;   
}
</style>
</head>
<body>
	<div id="login">  
        <h1>LogIn</h1>  
        <form method="post" action="">  
            <input type="text" required="required" placeholder="username" name="u"></input>  
            <input type="password" required="required" placeholder="password" name="p"></input>  
            <button class="but" type="submit" id="loginButton">login</button>
            <tr><a class="h1" href="http://www.baidu.com" target="_blank">register</a></tr>
        </form>
    </div>
    <script language="javascript">
        function login() {
        	alert("abc");
        }
    </script>
</body>
</html>