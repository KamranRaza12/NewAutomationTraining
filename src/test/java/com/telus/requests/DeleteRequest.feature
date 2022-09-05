Feature: To delete job details of an employee

  Background: 
    Given url 'http://localhost:9191'

  Scenario: to delete a job details
    Given path '/normal/webapi/remove/'+ 10
    When method delete
    Then status 200
    And print response

  Scenario: checking status after deleting
    Given path '/normal/webapi/remove/'+ 10
    When method delete
    Then status 404
    And print response
