<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Welcome Page</title>
    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
      }
      .container {
        text-align: center;
        background-color: #ffffff;
        padding: 40px;
        border-radius: 10px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        max-width: 600px;
        width: 90%;
      }
      h1 {
        color: #555;
      }
      p {
        color: #777;
        font-size: 18px;
        line-height: 1.6;
        margin-top: 20px;
      }
      .button {
        display: inline-block;
        padding: 10px 20px;
        background-color: #5553e8;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        transition: background-color 0.3s ease;
      }
      .button:hover {
        background-color: #a5a4da;
      }
      .container {
        h1 span {
          color: #e853e1;
        }
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h1>Weclome<span> ${session_name} </span> to Our Website!</h1>
      <p>This is the basic Register and login page</p>
      <p id="heart">❤️</p>
    
    </div>
  </body>
</html>
