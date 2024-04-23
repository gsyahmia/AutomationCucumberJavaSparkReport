
Feature: Login Tokopedia
    
  Scenario Outline: Successfully login to tokopedia
    Given Navigate to tokopedia login page
    When user login into web with <name> and password <pwd>
    And click login button
    Then user home page is displayed
  Examples:
  |name               | pwd 			|
  |yayaya@yahoo.com   | 987654321 |
  |hello@gmail.com    | 111111111	|
  
  Scenario: Login to tokopedia Metode Lain
    Given Navigate to tokopedia login page
    When user click Metode lain button
 	
 	Scenario: Successfully verify email the unregistered email
    Given Navigate to tokopedia login page
    When user login into web with "isjeiw@gmail.com"
    And click next button
    Then unregistered pop-up information is displayed
   
  