# M&S Cucumber/Selenium/Webdriver Tech Test

##Java environment requirements
The Java Runtime Environment version I used was jre7, but I have tested that it also works on jre6.

## Importing the project
The project should be able to be run out-of-the-box. Import it into any IDE which can compile Java and run JUnit (e.g. Eclipse).

## Running the tests
The test runner I used was JUnit. Execute the tests from within your IDE by running stepDefinitions/RunTests.java as a JUnit Test.

I have included the Chrome driver in the repo. The tests currently point to that due to the property set in Hooks.java. It should work, but feel free to remove/change this and use FireFoxDriver instead, depending on how your system is set up.