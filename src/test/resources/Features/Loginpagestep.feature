Feature: Verifying Adactinhotelapp Details
Scenario: Verifying Adactinhotelapp Login With Valid Credentials
Given User Is On The Adactinhotelapp Page
When User Should Enter Username and Password
And User Should Click Login button
Then User Should Verify Sucess Message