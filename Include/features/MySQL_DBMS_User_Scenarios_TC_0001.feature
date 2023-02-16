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
@DBMSScenarios
Feature: This feature file performs functiosn with reference to MySQL-DB's.
  

  @Positive
  Scenario Outline: This test-case is to Add User in MySql database - Positive
    Given to launch the Desktop-App MySQL and login using <password>
    When the user Navigates to Server[MenuItem] -> UsersandPrivileges
    Then enter details such auto-generated UserName <LoginPassword> to Add User Account
    And close all instances

    Examples: 
      | password | LoginPassword  | status  |
      | root@123 | Tree@1234      | success |
      | root@123 | Tree@1234      | success |      
