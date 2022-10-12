Feature: Validation of Clicbrics Login Functionality

Scenario: TC_01 Validation of Clicbrics Login Functionality With Valid Mobile Number and Password

Given User Launch Clicbrics Web Application
When User Clicks Sign In button
And User Enters Valid Mobile Number
When User Clicks Privacy policy and Continue button
When User Enters Valid Password
And User Clicks Continue button
Then User Verify Successfully Login Into Application