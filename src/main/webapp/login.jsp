<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
        body {
            background-color: #e7e0e0;
            font-family: Arial, sans-serif;
        }
        .container {
            width: 30%;
            margin: 100px auto;
            background-color: #ffffff;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .container h2 {
            text-align: center;
        }
        .container input {
            width: calc(100% - 20px);
            margin: 10px 0;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .container button {
            width: 100%;
            padding: 10px;
            background-color: #5553e8;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .container button:hover {
            background-color: #a5a4da;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Login</h2>
        <form action="login" method="post">
            <input type="email" name="email11" placeholder="Email" required>
            <input type="password" name="password11" placeholder="Password" required>
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>
