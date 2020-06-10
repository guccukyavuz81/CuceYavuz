Feature: Add multiple employees
Background:
  Given user logins with valid admin credentials
  And user navigates to AddEmployeePage
 @regression
  Scenario Outline: Adding multiple employees
  When user enters employees "<FirstName>" and "<LastName>"
  And user click on save button
  Then "<FirstName>"  "<LastName>" is added successfully
  
  Examples:
  |FirstName   |LastName   |
  |Nectxzijif  |Koppyxul   |
  |Abuzxsbyjer |Kkirnklmgrk|
  |Gazmawnzsc  |Gazskzwcuik|
 
@regression
@inProgress
  Scenario: Adding multiple employees using datatable
  When user enters firstname and lastname and clicks on save button then employee is added
  
  |FirstName   |LastName    |
  |Necgguucbijf|Koszitqqbb  |
  |Abxuzfqqaghh|Kkutmqqkrssk|
  |dkdkdkdkdkfk|djfjfjfjfjfj|