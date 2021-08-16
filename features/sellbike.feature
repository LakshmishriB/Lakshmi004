Feature: form fields to sell bike
@test1
Scenario Outline:  User wants to fill the form fields to sell bike
Given user is in sell used bike in India page
When user enter the data in "<brand>","<model>","<year>","<km>","<city>","<locality>","<price>","<name>","<mob>","<email>" and click on post ad button
Then Ad should be posted into the application

Examples:
|brand|model|year|km|city|locality|price|name|mob|email|
|Honda|Activa|2020|5050|Kochi|Aluva|8000|Lakshmi|9988998899|lakshmi@gmail.com|


@test2
Scenario Outline: User fills the invalid data in brand field  
Given user is in sell used bike in India page to fill form fields 
When user enter the invalid  data in brand field "<brand>","<model>","<year>","<km>","<city>","<locality>","<price>","<name>","<mob>","<email>" and click on post ad button
Then error message should be displayed for brand field.


Examples:
|brand|model|year|km|city|locality|price|name|mob|email|
|Hondaaa|Activa|2020|5050|Kochi|Aluva|8000|Lakshmi|9988998899|lakshmi@gmail.com|


@test3
Scenario Outline: User fills the invalid data in model field  
Given to fill form fields user is in sell used bike in India page 
When user enter the invalid  data in model field "<brand>","<model>","<year>","<km>","<city>","<locality>","<price>","<name>","<mob>","<email>" and click on post ad button
Then error message should be displayed for model field


Examples:
|brand|model|year|km|city|locality|price|name|mob|email|
|Honda|Activaaa|2020|5050|Kochi|Aluva|8000|Lakshmi|9988998899|lakshmi@gmail.com|


@test4
Scenario Outline: User fills the invalid data in year field  
Given to fill form fields user is in sell used bike page 
When user enter the invalid  data in year field "<brand>","<model>","<year>","<km>","<city>","<locality>","<price>","<name>","<mob>","<email>" and click on post ad button
Then error message should be displayed for year


Examples:
|brand|model|year|km|city|locality|price|name|mob|email|
|Honda|Activa||5050|Kochi|Aluva|8000|Lakshmi|9988998899|lakshmi@gmail.com|


@test5
Scenario Outline: User fills the invalid data in km field  
Given to fill the fields of form user is in sell used bike page
When user enter the invalid  data in km field "<brand>","<model>","<year>","<km>","<city>","<locality>","<price>","<name>","<mob>","<email>" and click on post ad button
Then error message should be displayed for km field

Examples:
|brand|model|year|km|city|locality|price|name|mob|email|
|Honda|Activa|2020|abcd|Kochi|Aluva|8000|Lakshmi|9988998899|lakshmi@gmail.com|


@test6
Scenario Outline: User fills the invalid data in city field  
Given to fill the fields of form with an invalid input user is in sell used bike page
When user enter the invalid  data in city field "<brand>","<model>","<year>","<km>","<city>","<locality>","<price>","<name>","<mob>","<email>" and click on post ad button
Then error message should be displayed for city field

Examples:
|brand|model|year|km|city|locality|price|name|mob|email|
|Honda|Activa|2020|5000|lakshmi|Aluva|8000|Lakshmi|9988998899|lakshmi@gmail.com|



@test7
Scenario Outline: User fills the invalid data in locality field  
Given to fill the fields of form with an invalid input for locality user is in sell used bike page
When user enter the invalid  data in locality field "<brand>","<model>","<year>","<km>","<city>","<locality>","<price>","<name>","<mob>","<email>" and click on post ad button
Then error message should be displayed for locality field

Examples:
|brand|model|year|km|city|locality|price|name|mob|email|
|Honda|Activa|2020|5000|Kochi|Aluva|8000|Lakshmi|9988998899|lakshmi@gmail.com|


@test8
Scenario Outline: User fills the invalid data in mob field  
Given to fill the fields of form with an invalid input for mob user is in sell used bike page
When user enter the invalid  data in mob field "<brand>","<model>","<year>","<km>","<city>","<locality>","<price>","<name>","<mob>","<email>" and click on post ad button
Then error message should be displayed for mob field

Examples:
|brand|model|year|km|city|locality|price|name|mob|email|
|Honda|Activa|2020|5000|Kochi|Aluva|8000|Lakshmi|99889988|lakshmi@gmail.com|


@test9
Scenario Outline: User fills the invalid data in email field  
Given to fill the fields of form with an invalid input for email user is in sell used bike page
When user enter the invalid  data in email field "<brand>","<model>","<year>","<km>","<city>","<locality>","<price>","<name>","<mob>","<email>" and click on post ad button
Then error message should be displayed for email field

Examples:
|brand|model|year|km|city|locality|price|name|mob|email|
|Honda|Activa|2020|5000|Kochi|Aluva|8000|Lakshmi|9988998899|lakshmi@gmail.com1234|

@test10
Scenario Outline: User fills the invalid data in name field  
Given to fill the fields of form with an invalid input for name user is in sell used bike page
When user enter the invalid  data in name field "<brand>","<model>","<year>","<km>","<city>","<locality>","<price>","<name>","<mob>","<email>" and click on post ad button
Then error message should be displayed for name field

Examples:
|brand|model|year|km|city|locality|price|name|mob|email|
|Honda|Activa|2020|5000|Kochi|Aluva|8000|@@@@|9988998899|lakshmi@gmail.com|
