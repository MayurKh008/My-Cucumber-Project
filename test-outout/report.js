$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/mayur.khobragade/Mayur-Eclipsedata/eclipse-workspace/POMCucumberFramework/src/main/java/com/qa/features/ReflowableBookSanity.feature");
formatter.feature({
  "line": 2,
  "name": "This is a Smoke Test of PDF Book launch",
  "description": "",
  "id": "this-is-a-smoke-test-of-pdf-book-launch",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Reflowable book lanch verification",
  "description": "",
  "id": "this-is-a-smoke-test-of-pdf-book-launch;reflowable-book-lanch-verification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user gets logged in to bookshelf",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user lauches the reflowable book",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on toc icon",
  "keyword": "When "
});
formatter.match({
  "location": "AccessCodeSteps.user_opens_the_browser()"
});
formatter.result({
  "duration": 5795530100,
  "status": "passed"
});
formatter.match({
  "location": "ReflowableBookSanitySteps.user_gets_logged_in_to_bookshelf()"
});
formatter.result({
  "duration": 3542979300,
  "status": "passed"
});
formatter.match({
  "location": "ReflowableBookSanitySteps.user_lauches_the_reflowable_book()"
});
formatter.result({
  "duration": 30092198200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#\\31 4113218_Book_Desktop\"}\n  (Session info: chrome\u003d84.0.4147.105)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u0027unknown\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027MAYURKHOBR045\u0027, ip: \u0027192.168.10.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.105, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\MAYUR~1.KHO\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:60036}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 19e81f313a5552bac3f2b412e6ecc7b0\n*** Element info: {Using\u003did, value\u003d14113218_Book_Desktop}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.qa.pages.ReflowableBookSanity.ReflowableBookLaunch(ReflowableBookSanity.java:78)\r\n\tat com.qa.stepdefinitions.ReflowableBookSanitySteps.user_lauches_the_reflowable_book(ReflowableBookSanitySteps.java:35)\r\n\tat ???.When user lauches the reflowable book(C:/Users/mayur.khobragade/Mayur-Eclipsedata/eclipse-workspace/POMCucumberFramework/src/main/java/com/qa/features/ReflowableBookSanity.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ReflowableBookSanitySteps.user_clicks_on_all_menu_buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 667235300,
  "status": "passed"
});
});