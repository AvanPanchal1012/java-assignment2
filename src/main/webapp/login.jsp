<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
        }
        .form-container {
            width: 600px;
            margin: 50px auto;
            background-color: #fff;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        .line {
       border-top: 1px solid #000000;
        }
        h1 {
            text-align: center;
            color: #3D52A0;
            margin-bottom: 20px;
        }
        form {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }
        form div {
            width: 48%;
            margin-bottom: 15px;
        }
        form div.full-width {
            width: 100%;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"], input[type="password"]{
            width: calc(100% - 10px);
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
        }
        input[type="submit"] {
            background-color:#3D52A0;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        
        .form-actions {
            display: flex;
            justify-content: space-between;
        }
        .form-actions input[type="submit"] {
            width: 100%;
        }
    </style>
</head>
<body>
	<div class="form-container">
    <h1>Login</h1>
    <form action="login" method="post">
    <div class="full-width">
        <label for="userName">User Name:</label>
        <input type="text" name="userName" id="userName" required>
        </div>
        <div class="full-width">
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required>
        </div>
        <div class="form-actions full-width">
           <input type="submit" value="Login">
        </div>
    </form>
    <a href="signup.jsp">New User? Sign up here</a>
    </div>
</body>
</html>
