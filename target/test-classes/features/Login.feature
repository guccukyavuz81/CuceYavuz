
Feature: Login
@smoke @regression
Scenario: Login
Given ValidLogin
Then invalidPasswordLogin
Then emptyUsernameLogin


 
Scenario: Login with invalid credentials
  When I enter invalid username and password and see error message
   | UserName | Password  | ErrorMessage    |
   | Admin  | Admin123  | Invalid credentials |
   | Hello  | Syntax123! | Invalid credentials |
   |niaber  |fjfjfjffjkjgj|Invalid credentials|
   

 Scenario Outline: Login with invalid credentials with outline
 
 When I enter invalid "<UserName>" and "<Password>" 
 Then I see error "<ErrorMessage>" 
 
 Examples:
   | UserName | Password  | ErrorMessage    |
   | Admin  | Admin123  | Invalid credentials |
   | Hello  | Syntax123! | Invalid credentials |
   |niaber  |fjfjfjffjkjgj|Invalid credentials| 