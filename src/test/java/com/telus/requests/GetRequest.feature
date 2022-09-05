Feature: To get job details of an employee

  Background: 
    Given url 'http://localhost:9191'

  Scenario: Get the job details of employee
    Given path '/normal/webapi/all'
    And header Accept = 'application/json'
    When method get # send the get request
    Then status 200 # response status code
    And print response
