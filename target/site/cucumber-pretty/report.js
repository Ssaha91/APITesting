$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login",
  "description": "This feature deals with the login functionality",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Login with valid credentials using outline",
  "description": "",
  "id": "facebook-login;login-with-valid-credentials-using-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Web1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on facebook homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I logged into facebook",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "facebook-login;login-with-valid-credentials-using-outline;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "facebook-login;login-with-valid-credentials-using-outline;;1"
    },
    {
      "cells": [
        "abcd134@gmail.com",
        "abcd1234"
      ],
      "line": 12,
      "id": "facebook-login;login-with-valid-credentials-using-outline;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3684996331,
  "error_message": "org.openqa.selenium.WebDriverException: disconnected: unable to connect to renderer\n  (Session info: chrome\u003d65.0.3325.181)\n  (Driver info: chromedriver\u003d2.32.498537 (cb2f855cbc7b82e20387eaf9a43f6b99b6105061),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027Ibrahims-MacBook-Air.local\u0027, ip: \u00272604:2000:a088:d600:cdf4:cef3:a5b8:9094%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_152\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dMAC, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.32.498537 (cb2f855cbc7b82e20387eaf9a43f6b99b6105061), userDataDir\u003d/var/folders/gg/rfwdh2352vb6rspct9vgsd3h0000gn/T/.org.chromium.Chromium.nlm4Eu}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d65.0.3325.181, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 5ddd802d24cec2a11ad3eaaf0df25190\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:703)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:934)\n\tat steps.Hook.startChrome(Hook.java:78)\n\tat steps.Hook.InitializeTest(Hook.java:49)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:643)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:820)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1128)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:782)\n\tat org.testng.TestRunner.run(TestRunner.java:632)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\n\tat org.testng.TestNG.run(TestNG.java:1064)\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:72)\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 12,
  "name": "Login with valid credentials using outline",
  "description": "",
  "id": "facebook-login;login-with-valid-credentials-using-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Web1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on facebook homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"abcd134@gmail.com\" and \"abcd1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I logged into facebook",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.iAmOnFacebookHomepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd134@gmail.com",
      "offset": 15
    },
    {
      "val": "abcd1234",
      "offset": 39
    }
  ],
  "location": "StepDefinition.iEnterValidAnd(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.iLoggedIntoFacebook()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 73858826,
  "status": "passed"
});
});