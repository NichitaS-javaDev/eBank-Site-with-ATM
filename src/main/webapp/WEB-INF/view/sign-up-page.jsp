<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>

<script type="text/javascript">
	if (performance.navigation.type == 2) {
		location.reload(true);
	}
</script>

<style>
label, input {
	margin-top: 40px;
	font-size: 18px;
	font-weight: 600;
	background-color: transparent;
}

h1 {
	font-size: 20px;
	font-weight: 700;
	margin-left: 70px;
	margin-top: 25px;
}

#login_in {
	margin-left: 35px;
}

button {
	background-color: transparent;
	border-radius: 5px;
	height: 50px;
	width: 75px;
	margin-top: 50px;
	font-size: 15px;
	font-weight: 700;
	border-width: 3px;
	border-color: #000;
	margin-left: 90px;
}

input {
	border-width: 3px;
	border-color: #000;
}
</style>

</head>
<body bgcolor="#f9a427">
	<div align="center">
		<form action="new_account_info_page">
			<h1 align="center">*** Sign Up ***</h1>
			<label for="first_name_input">First Name : </label> <input
				type="text" name="first_name" id="first_name_input"> <br>
			<label for="last_name_input">Last Name : </label> <input type="text"
				name="last_name" id="last_name_input"> <br> <label
				for="login_input" id="login_in">Login : </label> <input type="text"
				name="login" id="login_input"><br> <label
				for="password_input">Password : </label> <input type="password"
				name="pass" id="password_input"><br>
			<button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>