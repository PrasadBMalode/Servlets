<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body style="background-color:black;">
<div style="margin:auto;
                text-align:center;
                width: 400px;
                border: 2px solid black;
                padding: 20px;
                border-radius: 10px;
                background-color:lightblue;">
    <h1>REGISTER FORM</h1>
    <form action="registerpage" method="post">


        <label for="username">User Name: </label>
        <input type="text" id="username" placeholder="User Name" name="username"/><br> <br>

        <label for="age">Enter Age: </label>
        <input type="number" id="age" placeholder="Age" name="age"/><br><br>

        <label for="mail"> E-mail</label>
        <input type="email" id="mail" placeholder="Email" name="useremail"/><br><br>

        <label for="password"> Password:</label>
        <input type="password" id="password" placeholder="Enter Password" name="password"/><br><br>

        <label for="ConfirmPassword">Confirm Password:</label>
        <input type="password" id="ConfirmPassword" placeholder="Confirm Password" name="ConfirmPassword"/><br><br>

        <button class="btn btn-outline-success" type="submit">Submit</button>
    </form>
</div>
</body>
</html>