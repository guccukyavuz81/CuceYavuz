Feature: Add employee using excel

Scenario: Add employee using excel values

Given user is logged with valid admin credentials
When user adds data from "Sheet1" then all employees are added

