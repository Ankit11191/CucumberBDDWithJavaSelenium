Feature: Login Test
Scenario: launch Page

Given launch "https://www.freecrm.com/index.html"
When Provide User Name and Passwrord
| akm123 | Test@123 | username1 | password |
Then Click on "LoginButton"
Then Move to Tab "contact" and click on "NewContact"