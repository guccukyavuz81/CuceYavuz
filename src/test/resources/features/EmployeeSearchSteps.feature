
 Feature: Employee Search
@smoke
@Bu
Scenario: Search employee by id
Given user is logged with valid admin credentials
And user navigate to employee list page
When user enters valid employee id
And click on search button
Then user see employee information is displayed