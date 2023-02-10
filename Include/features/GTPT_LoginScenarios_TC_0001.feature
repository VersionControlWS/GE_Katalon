#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LoginScenarios
Feature: This feature file performs Login test-cases both positive and negative for GP-app.
  

  @Positive
  Scenario Outline: This test-case is to check successful login of user and verify "Dashboard" Keyword - Positive
    Given to launch the browser with <url>
    When I enter the user details such as <username> <password> in given textField
    Then I verify the <keyword> in step

    Examples: 
      | url                   | username              | password     | status  | keyword   |
      | staging.peppertree.ai | ajay@uth-uk.com       | Tree@2023    | success | Dashboard |      

  @Negative
  Scenario Outline: These test-case are to check error keyword - Negative
    Given to launch the browser with <url>
    When I enter the user details such as <username> <password> in given textField
    Then I verify the <keyword> in step

    Examples: 
      | url                   | username           | password  | status  | keyword                              |
      | staging.peppertree.ai |                    |           | success | Please Enter A Valid Email Address   |
      | staging.peppertree.ai | uthukpnt@gmail.com |           | success | Please Fill All The Fields           |      
      | staging.peppertree.ai |                    | Tree@2023 | success | Please Enter A Valid Email Address   |

      
  @Negative
  Scenario Outline: These test-case are to check error keyword - Negative
    Given to launch the browser with <url>
    When I enter the user details such as <username> <password> in given textField
    Then error <keyword> is verified in this step

    Examples: 
      | url                   | username           | password   | status  | keyword        |      
      | staging.peppertree.ai | ajay@uth-uk.com    | value      | success | wrong password |
      | staging.peppertree.ai | uthukpnt@gmail.com | value      | success | user not found |

  @Negative
  Scenario Outline: These test-case are to check error keyword with phone number - Negative
    Given to launch the browser with <url>
    When phone number is entered as <username> in given textField
    Then error <keyword> is verified in this step

    Examples: 
      | url                   | username   | status  | keyword                           |      
      | staging.peppertree.ai | 123456789  | success | Please Enter A Valid Phone Number |