Feature: To update job details of an employee

  Background: 
    Given url 'http://localhost:9191'

  Scenario: update all the details of employee
    Given path '/normal/webapi/update'
    And request {"jobId":'10',"jobTitle":"ME","jobDescription":"To develop ME application","experience":["ME","Apple","Mobile Iron"],"project":[{"projectName":"Telus App","technology":["ME","SQL Lite","Gradle"]}]}
    And headers {Content-Type:'application/json', Accept:'application/json'}
    When method put
    Then status 200
    And print response
