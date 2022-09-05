Feature: To add job details of an employee

  Background: 
    Given url 'http://localhost:9191'

  Scenario: add job details of employee
    Given path '/normal/webapi/add'
    And request {"jobId":'10',"jobTitle":"Telus Engg","jobDescription":"To develop Civil application","experience":["Telus","Apple","Mobile Iron"],"project":[{"projectName":"Telus App","technology":["Telus","SQL Lite","Gradle"]}]}
    And headers {Content-Type:'application/json', Accept:'application/json'}
    When method post
    Then status 201
    And print response
