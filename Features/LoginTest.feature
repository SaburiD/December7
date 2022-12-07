Feature: CRMLogin

Scenario: successful Login with valid credentials
 Given User Launch the Browser
   When user opens url "https://classic.freecrm.com/index.html?e=1"
   And user enters username as "Saburi" and password as "test@123"
   And click on Login buton
   Then title page should be "CRMPRO"
   When user click on Logout button
   Then title page should be "Free CRM - CRM software for customer relationship management, sales, and support."
   And close browser
   
   Scenario Outline:successful Login with valid credentials with DDT
 	Given User Launch the Browser
   When user opens url "https://classic.freecrm.com/index.html?e=1"
   And user enters username as "<username>" and password as "<password>"
   And click on Login buton
   Then title page should be "CRMPRO"
   When user click on Logout button
   Then title page should be "Free CRM - CRM software for customer relationship management, sales, and support."
   And close browser
   
   Examples:
   |username|password|
   |Saburi|test@123|
   |test|admin|
