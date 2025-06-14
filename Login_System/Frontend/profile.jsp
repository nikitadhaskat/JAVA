<%@ page session="true" %>
<html>
<head>
    <title>Candidate Profile</title>
    <style>
        body {
            font-family: Arial;
            background-color: #f4f4f4;
        }
        .profile-box {
            width: 400px;
            margin: 100px auto;
            background: #fff;
            padding: 25px;
            box-shadow: 0px 0px 10px gray;
            border-radius: 8px;
        }
        .profile-box h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .profile-box p {
            font-size: 16px;
            margin: 10px 0;
        }
    </style>
</head>
<body>
    <div class="profile-box">
        <h2>Your Profile</h2>
        <p><b>Full Name:</b> ${fullname}</p>
        <p><b>Username:</b> ${username}</p>
        <p><b>Email:</b> ${email}</p>
        <p><b>Gender:</b> ${gender}</p>
        <a href="login.html">Logout</a>
    </div>
</body>
</html>
