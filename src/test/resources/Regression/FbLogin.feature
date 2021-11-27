@tag
Feature: Login Functionality in Facebook Login Page	
Login Template

  @tag1
  Scenario:As a User, I should not be able to login if Username is Invalid and Password Valid
    Given Launch the Chrome Browser	
    And Enter the URL of Facebook	
    When Check Login Page Loaded Properly
    And Enter the Invalid Username	
    And Enter the Valid Password
    And Click Login Button
    Then Validate error message in User Interface	
 7479M4YBZ7