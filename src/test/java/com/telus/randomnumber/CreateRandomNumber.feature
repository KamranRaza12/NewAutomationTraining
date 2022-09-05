Feature: To generate randome number

  Scenario: to print random number
    Given def getRandomValue = function(){return Math.floor((Math.random()*(100)))}
    And def id = getRandomValue()
    And print id
