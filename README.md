# BookShop - Project created using NetBeans
LoginApp project - Ojbect Oriented Software Engineer

This is a Login application with a mini connection to a local database with GUI and JUnit test. The application has a Login, Register and Forget password forms which stores user information into a local database and validates every time a user attempts a login, register or change password. 

Into the folder "src" you will find 2 other folders (main and test)

main/java/com/bookshop/loginapp contains:
- DataConnection.java (used to make the connection between the local database and the application)
- ForgotPassword.form (form which is displayed when user clicks "forgot password" on the login screen)
- ForgotPassword.java (gives usability to the form "ForgotPassword")
- Login.java (main app used to test the application)
- LoginForm.form (main form used to collect login and password from the user)
- LoginForm.java (gives usability to the LoginForm)
- RegisterForm.form (form used to register new user to the mini database)
- RegisterForm.java (gives usability to the RegisterForm)

test/java/com/bookshop/loginapp:
- LoginTest.java (JUnit test made on the "Login.java")
