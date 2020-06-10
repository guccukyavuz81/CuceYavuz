Feature:
@smoke
Scenario Outline:
When user enters valid "<username>" and "<password>"
And user clicks on login button
Then "<FirstName>" is successfully logged in

Examples:
|username|password   |FirstName|
|Admin   |Hum@nhrm123|Admin    |
|abd77   |Syntax123! |Abdullah | 
  