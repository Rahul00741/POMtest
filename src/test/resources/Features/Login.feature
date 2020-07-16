Feature: Validate the OrangeHRM application

Scenario Outline: To validate the login functionality of Orange HRM application

Given To launch the browser and navigate to url
When Verify the title of page
Then Enter "<username>" and "<password>"
Then Click submit button
Then Close browser and take screenshot

Examples:

|username|password|
|admin|admin123|
|rudrika|rudrika1234|

