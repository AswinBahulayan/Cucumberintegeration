Feature: to login
Scenario: to validate login

Given the user is in the home page
When the user enter username
And the user enter password
Then click the login button
Given check user is able to create an account