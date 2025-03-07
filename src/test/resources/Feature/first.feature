Feature: Add to card product

Scenario: To enter the valid user id and password

Given Application url is launched
Then  Enter the valid username
Then  Enter the valid password
Then  Click on the sumbit button
When  User clicks on PIM menu
And  User clicks on Add button
And  Creates and user with valid details
When User clicks in Admin menu
And Click on Add button on user management  page
When User selects role as ESS
And Enters name as Employe name
Then Populated list must contain newly created user   
