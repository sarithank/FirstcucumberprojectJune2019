$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Ganaparthi/Documents/Saritha/eclipseProject/FirstCucumberProjectJune2019/src/main/java/Feature/AutoPractice.feature");
formatter.feature({
  "line": 2,
  "name": "Automationpractice Test",
  "description": "",
  "id": "automationpractice-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Mouseover first item in popular list",
  "description": "",
  "id": "automationpractice-test;mouseover-first-item-in-popular-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user suould be on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on Add to Cart button that appears on mouseover",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "transfer control to popup that appears",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify product added message",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on Continue Shopping button in popup",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "transfer control to main page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "close window",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationPracticeTest.user_is_on_homepage()"
});
formatter.result({
  "duration": 5319652370,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeTest.click_on_add_to_cart()"
});
formatter.result({
  "duration": 8127290843,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeTest.transfer_control_to_pop_up_window()"
});
formatter.result({
  "duration": 1641489491,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeTest.veryfy_product_added_message()"
});
formatter.result({
  "duration": 18459967,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeTest.click_on_continue_shopping()"
});
formatter.result({
  "duration": 30401736,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeTest.switch_to_main_page()"
});
formatter.result({
  "duration": 11524250,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeTest.close_window()"
});
formatter.result({
  "duration": 93441715,
  "status": "passed"
});
});