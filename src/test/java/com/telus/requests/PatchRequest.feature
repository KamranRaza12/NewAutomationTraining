Feature: To partial update job details of an employee

  Background: 
    Given url 'http://localhost:9191'

  Scenario: partially update the details of employee
    Given path '/normal/webapi/update/details'
    And params {id:'10',jobTitle:'CS',jobDescription:'CS Application'}
    And header Accept = 'application/json'
    When method patch
    Then status 200
    And print response
