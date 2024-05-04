Feature: Login

  Scenario: Successfull Login with Valid Credentials
    Given user opens URL "https://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And user clicks on login button
    Then user Validats Page title as "Dashboard / nopCommerce administration"
    When user clicks on Logout button
    Then user validates page title as "Your Store. Login"
    And user close browser
