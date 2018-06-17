Feature: Login Test
Scenario: launch Page

Given launch "https://www.freecrm.com/index.html"
When Provide "akm123" at User Name Field "username1" and "Test@123" at Passwrord Field "password"
Then Click on Button "LoginButton"