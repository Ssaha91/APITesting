$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 2,
  "name": "API Testing",
  "description": "",
  "id": "api-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Web3"
    }
  ]
});
formatter.before({
  "duration": 558183255,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validation status code of Google API",
  "description": "",
  "id": "api-testing;validation-status-code-of-google-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigate to google distance matrix api",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "then user should be able to validate the statuscode",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.userNavigateToGoogleDistanceMatrixApi()"
});
formatter.result({
  "duration": 3721166676,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.thenUserShouldBeAbleToValidateTheStatuscode()"
});
formatter.result({
  "duration": 1521352791,
  "status": "passed"
});
formatter.after({
  "duration": 466571,
  "status": "passed"
});
});