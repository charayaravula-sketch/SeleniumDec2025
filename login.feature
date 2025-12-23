
Feature: Cyclose Login Functionality
@smoke
Scenario Outline:
Verify user is able to login cyclose 
    Given If user is on home page
    When click on login link
    And Enter the username "<username>" and password "<password>"
    And click on submit button
    Then check the logout link
    
    
 Examples:
|username|password|
|demo    |1234    |
|demo5   |1235    |
@sanity
Scenario: Verify user is able to login cyclose 
    Given If user is on home page
    When click on login link
    And Enter the username "" and password "1234"
    And click on submit button
    But check error message
    Then check the logout link
    
@Regression @Excel
Scenario: verify the user is able to generate QR code
  Given If user is on home page
  When click on login link
  And Enter the username "demo" and password "1234"
  And click on submit button
  And Click on Banking link and received QR code
  And Enter the amount "20"
  And Click on Generate QRcode
  Then Check QR code title
  
  
  