# JGivenSelenium
This repository contains a small project which includes Selenium and JGiven.

The following tools used:
Selenium
JGiven
Maven

Included the following webdrivers in the package:
chromedriver
geckodriver
iedriver
edgedriver
safaridriver

Using the default JGiven reporting. After therun the report can be found in target/jgiben-reports/html folder.

To run the tests use the following command
(its needed because if a test fail, and there is a constant failing test, the report wont be created):

mvn verify -Dmaven.test.failure.ignore=true
