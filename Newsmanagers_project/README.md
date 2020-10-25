This framework is created to test main functionality of https://www.newsmanagers.com/ site:
1. Login form:
Tests test:
- translation of strings and error messages according to selected language;
- display of error messages for different cases;
- opportunity to login with correct user credentials;
2. Password recover form:
Tests test:
- translation of strings and error messages according to selected language;
- display of error messages for different cases;
- opportunity to recover password for login to site using correct user credentials;
3. Newsletter form:
Tests test:
- translation of strings(including error and confirmation messages) according to selected language;
- display of error messages for different cases;
- opportunity to subscribe to Newsletters mailing.

To run tests:
1. By Jenkins:
- link to GitHub https://github.com/skondratieva/Agefi-MWF
- in General settings of job add
  -String Parameter:
     -name: TestSuites
     -value: src/test/java/TestSuites/LoginFormElementsTest.xml,src/test/java/TestSuites/NewsletterFormElementsTest.xml,src/test/java/TestSuites/RecoverPasswordFormElementsTest.xml,src/test/java/TestSuites/LoginFormErrorsTest.xml,src/test/java/TestSuites/NewsletterFormErrorsTest.xml,src/test/java/TestSuites/RecoverPasswordFormErrorsTest.xml,src/test/java/TestSuites/LoginFormSubmitTest.xml,src/test/java/TestSuites/NewsletterFormSubmitTest.xml,src/test/java/TestSuites/RecoverPasswordFormSubmitTest.xml
  -Build:
     -	Goals and options = clean test -Dsurefire.suiteXmlFiles=${TestSuites}
2. By Intellij IDEA
- clone https://github.com/skondratieva/Agefi-MWF
- in terminal run command mvn clean test -Dsurefire.suiteXmlFiles=src/test/java/TestSuites/LoginFormElementsTest.xml,src/test/java/TestSuites/NewsletterFormElementsTest.xml,src/test/java/TestSuites/RecoverPasswordFormElementsTest.xml,src/test/java/TestSuites/LoginFormErrorsTest.xml,src/test/java/TestSuites/NewsletterFormErrorsTest.xml,src/test/java/TestSuites/RecoverPasswordFormErrorsTest.xml,src/test/java/TestSuites/LoginFormSubmitTest.xml,src/test/java/TestSuites/NewsletterFormSubmitTest.xml,src/test/java/TestSuites/RecoverPasswordFormSubmitTest.xml

