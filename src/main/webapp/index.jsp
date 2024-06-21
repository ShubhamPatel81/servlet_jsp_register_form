<%@ page language="java" contentType="text/html; charset=UTF-8" 
 pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <style>
    body {
      background-color: #f0f0f0;
    }
    .container {
      width: 30%;
      margin: 40px auto;
      background-color: #e7e0e0;
      padding: 20px;
      border: 1px solid #ccc;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0);
      
    }
    .container button {
      width: 24%;
      height: 28px;
      background-color: #5553e8;
      align-items: center;
      border: none;
      border-radius: 5px;
    }
    .container button:hover {
      background-color: #a5a4da;
    }
    .form-container input {
      /* border: none; */
    }
    input:focus {
      outline: none;
      /* If needed, you can also add custom focus styling here */
      /* Example: background-color: #e0e0e0; */
    }
  </style>
  <body>
    <body>
      <div class="container">
        <h2>Register Form</h2>
        <form action="register" method="post" class="form-container">
          Name: <input type="text" name="name1" id="" /><br /><br />
          Email: <input type="email" name="email1" id="" /><br /><br />
          Password: <input type="password" name="password1" id="" />
          <br /><br />Gender:
          <!--   <input type="radio" name="gender" id="" />-->
          <!-- <label for="male">Male</label> -->
          <br /><br />
          Male <input type="radio" name="gender1" id="" value="Male" /><br />
          Female<input type="radio" name="gender1" id="" value="Female" /><br />
          Other
          <input type="radio" name="gender1" id="" value="Other" /><br /><br />

          City:
          <select name="city1">
            <option value="Select City:">Select City:</option>
            <option value="Delhi">Delhi</option>
            <option value="Hydrabad">Hydrabad</option>
            <option value="Mumbai">Mumbai</option>
            <option value="Banglore">Banglore</option>
          </select>
          <br /><br />
          <!-- <input type="submit" value="register" name="" id="" /> -->
          <button type="submit" value="register">Register</button>
        </form>
      </div>
    </body>
  </body>
</html>
