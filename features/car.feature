Feature: form fields to sell car
Scenario Outline:  User wants to fill the form fields to sell car
Given user is in sell used car in India page
When user enter the data in form from given sheetname "<SheetName>" and <RowNumber> for car and click on post ad button
Then Ad for car should be posted into the application

Examples:
|SheetName|RowNumber|
|car|0|