Feature: To validate the login function using list 
Background: To launch the browser and maxmize
Scenario: To validate the login page
When User has to click the Sign in button
And USer has to pass the mobile number 
|mob1|9986543210|
|mob2|9638527410|
|mob3|9685471230|
@sanity
Scenario: To Validate login page using list
When User click the sign in button
And User pass the mobile number in to the mobile number field
|9876543210|6985471230|852147963| 

#Feature: To validate the login functionality of the RedBus webpage
Scenario Outline:  TO validate login with valid phone number
When To click the sign in button
And To pass the valid mobile number in to the"<mobilenumber>" mobile number field
Examples:
|mobilenumber|
|9688634074|
|9876543210|
|8521478520|

