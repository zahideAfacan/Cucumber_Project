@google_search
Feature: first feature file
  Background: user_goes_to_google_page
    Given user is on the google home page

  @iphone_search
  Scenario: TC_01_iPhone_search
    Given user is on the google home page
      When user search for iPhone
        Then verify page title contain iPhone
          Then close the application
  @teapot_search
  Scenario:TC_02_teapot_search
    Given user is on the google home page
     When user search for TeaPot
      Then verify page title contain TeaPot
       Then close the application




  #  All feature files must begin with "Feature:" keyword
  #  Feature : To declare the file as a cucumber feature file. Mandatory. There can be ONLY one Feature: keyword
  #  Scenario : To create test case. In a feature file there may be more than one Scenario:
  #  Runner : To run the feature files.
  #What is cucumber?
  #Cucumber is a testing framework. It is a BDD(Behaviour Driven Development) framework.
  #BDD means we describe the behavior(functionality) in the feature file first, then write the code
  #What is feature file?
  #It is used to write test cases in Gherkin language. It has keywords like given, when , then,…This is plane English.
  #What is Background?
  #It is used for repeated PRE CONDITIONS. This runs before each Scenario keyword.
  #What is Scenario:
  #It is used to create test cases in feature files. I can use more than 1 scenario keyword in a future file.
  #What is Feature:
  #This is used to create a feature file. Each feature file must begin with a Feature keyword. They cannot be more than 1 Feature keyword in a feature file
  #How do you run specific test cases in cucumber?
  #We use runner class to run the test cases. We can run specific test scenarios or feature files using tags.
  #What is dryRun in cucumber?
  #To generate missing/unimplemented step definitions, we use dryRun=true. When I want to run test cases, I do dryRun=false.
  #What is step definition in cucumber?
  #Technical codes goes to step definition classes. We write the java code in these classes.
  #How do you parametrize the feature files?How do you get the data from the feature file? How do you make the test cases more reusable in cucumber.What is your strategy?
  #String “” makes the data dynamic. We can use Scenario Outline, data tables as well
  #Collapse