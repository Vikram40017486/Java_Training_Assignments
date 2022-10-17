<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here </title>
<style>
     {box-sizing: border-box}


.container {
  padding: 16px;
}


input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}


hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}


.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity:1;
}


a {
  color: dodgerblue;
}

.signin {
  background-color: #f1f1f1;
  text-align: center;
}

</style>
</head>
<body>
<!-- <form action="insertplayer" method="post">
   Name : <input type="text" name="pname"/><br/>
   Age  : <input type="text" name="page"/><br/>
   Team :  <input type="text" name="pteam"/><br/>
    <input type="submit" />
    </form> -->
    <form action="insertplayer" method="post">
        <div class="container">
          <h1>Register</h1>
          <p>Please fill in this form to create an account.</p>
          <hr>
      
          <label for="email"><b>Name</b></label>
          <input type="text" placeholder="Enter Name" name="pname" id="email" required>

          <label for="psw-repeat"><b>Email</b></label>
          <input type="text" placeholder="Enter Email" name="pemail" id="psw-repeat" required>
          <hr>
      
          <label for="psw"><b>Country</b></label>
          <input type="text" placeholder="Enter Team" name="pteam" id="psw" required>
      
          <label for="psw-repeat"><b>Enter Password</b></label>
          <input type="Password" placeholder="Enter Password" name="password" id="psw-repeat" required>
          <hr>
      
          <button type="submit" class="registerbtn">Register</button>
        </div>
      
      </form>
</body>
</html>