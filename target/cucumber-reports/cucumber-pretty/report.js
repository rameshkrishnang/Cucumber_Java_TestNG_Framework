$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/CreateNewCustomer.feature");
formatter.feature({
  "line": 1,
  "name": "New Customer Creation",
  "description": "",
  "id": "new-customer-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create a New Customer",
  "description": "",
  "id": "new-customer-creation;create-a-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open the Crater web application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I validate the Login Page is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I login as admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I validate the Crater Admin Dashboard is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Login_StepDefs.i_open_the_crater_web_application()"
});
formatter.result({
  "duration": 13045514900,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefs.i_validate_the_login_page_is_displayed()"
});
formatter.result({
  "duration": 95424600,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefs.i_login_as_admin_user()"
});
formatter.result({
  "duration": 1158135100,
  "status": "passed"
});
formatter.match({
  "location": "AdminDashboard_StepDefs.i_validate_the_crater_admin_dasnboard_is_displayed()"
});
formatter.result({
  "duration": 1499158700,
  "status": "passed"
});
});