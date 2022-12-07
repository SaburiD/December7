Feature: Addcompany

Scenario: Add new company

 Given User Launch the Browser
   When user opens url "https://classic.freecrm.com/index.html?e=1"
   And user enters username as "Saburi" and password as "test@123"
   And click on Login buton
    When user clicks on comapnay menu
    And click on New Company
    When user enter customer info
    And click on Save button
    And close browser