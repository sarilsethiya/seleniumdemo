$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/mwp/abbmi/resources/features/adminFunctionality.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Adming functionality",
  "description": "",
  "id": "validate-adming-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login as an abbvie employee",
  "description": "",
  "id": "validate-adming-functionality;login-as-an-abbvie-employee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to Home Page website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User selects user as abbvie employee",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Enter button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter Username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should see message HEALTHCARE PROFESSIONALS, GET THE ANSWERS YOU ARE SEARCHING FOR HERE",
  "keyword": "Then "
});
formatter.match({
  "location": "AbbEmpLoginPageSteps.user_navigates_to_Home_Page_website()"
});
formatter.result({
  "duration": 7535515602,
  "status": "passed"
});
formatter.match({
  "location": "AbbEmpLoginPageSteps.user_selects_user_as_abbvie_employee()"
});
formatter.result({
  "duration": 210583554,
  "status": "passed"
});
formatter.match({
  "location": "AbbEmpLoginPageSteps.user_clicks_on_Enter_button()"
});
formatter.result({
  "duration": 7533342028,
  "status": "passed"
});
formatter.match({
  "location": "AbbEmpLoginPageSteps.user_enter_Username_as()"
});
formatter.result({
  "duration": 288740084,
  "status": "passed"
});
formatter.match({
  "location": "AbbEmpLoginPageSteps.user_enter_Password_as()"
});
formatter.result({
  "duration": 233158077,
  "status": "passed"
});
formatter.match({
  "location": "AbbEmpLoginPageSteps.user_clicks_on_SignIn_button()"
});
formatter.result({
  "duration": 8657742878,
  "status": "passed"
});
formatter.match({
  "location": "AbbEmpLoginPageSteps.user_should_see_message_HEALTHCARE_PROFESSIONALS_GET_THE_ANSWERS_YOU_ARE_SEARCHING_FOR_HERE()"
});
formatter.result({
  "duration": 212150097,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Admin Panel",
  "description": "",
  "id": "validate-adming-functionality;admin-panel",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User clicks on admin panel",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User clicks on manage products and peform all the actions based on \"\u003cCountry\u003e\" and \"\u003cLocal Product value\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on manage indications and peform all the actions based on \"\u003cAffiliate Value\u003e\" and \"\u003cProduct Value\u003e\" and \"\u003cIndication Value\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks on manage search AD groups and peform all the actions based on \"\u003cAD Group\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks on Add products and peform all the actions based on \"\u003cAffiliate Value\u003e\" and \"\u003cProduct ID\u003e\" and \"\u003cProduct Name\u003e\" and \"\u003cProduct Code\u003e\" and \"\u003cVeeva Product Code\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "validate-adming-functionality;admin-panel;",
  "rows": [
    {
      "cells": [
        "Country",
        "Local Product value",
        "Affiliate Value",
        "Product Value",
        "Indication Value",
        "AD Group",
        "Product ID",
        "Product Name",
        "Product Code",
        "Veeva Product Code"
      ],
      "line": 20,
      "id": "validate-adming-functionality;admin-panel;;1"
    },
    {
      "cells": [
        "India",
        "XYZ",
        "India",
        "ABBV-181",
        "Angina",
        "AD_Dummy_Group",
        "123",
        "MadeInIndia",
        "M123",
        "V123"
      ],
      "line": 21,
      "id": "validate-adming-functionality;admin-panel;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Admin Panel",
  "description": "",
  "id": "validate-adming-functionality;admin-panel;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User clicks on admin panel",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User clicks on manage products and peform all the actions based on \"India\" and \"XYZ\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on manage indications and peform all the actions based on \"India\" and \"ABBV-181\" and \"Angina\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks on manage search AD groups and peform all the actions based on \"AD_Dummy_Group\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks on Add products and peform all the actions based on \"India\" and \"123\" and \"MadeInIndia\" and \"M123\" and \"V123\"",
  "matchedColumns": [
    2,
    6,
    7,
    8,
    9
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdminPageSteps.User_clicks_on_admin_panel()"
});
formatter.result({
  "duration": 209927069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 68
    },
    {
      "val": "XYZ",
      "offset": 80
    }
  ],
  "location": "AdminPageSteps.User_clicks_on_manage_products_and_peform_all_the_actions(String,String)"
});
formatter.result({
  "duration": 8123370547,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 71
    },
    {
      "val": "ABBV-181",
      "offset": 83
    },
    {
      "val": "Angina",
      "offset": 98
    }
  ],
  "location": "AdminPageSteps.User_clicks_on_manage_indications_and_peform_all_the_actions(String,String,String)"
});
formatter.result({
  "duration": 8928708433,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AD_Dummy_Group",
      "offset": 76
    }
  ],
  "location": "AdminPageSteps.User_clicks_on_manage_search_AD_groups_and_peform_all_the_actions(String)"
});
formatter.result({
  "duration": 2130539510,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 65
    },
    {
      "val": "123",
      "offset": 77
    },
    {
      "val": "MadeInIndia",
      "offset": 87
    },
    {
      "val": "M123",
      "offset": 105
    },
    {
      "val": "V123",
      "offset": 116
    }
  ],
  "location": "AdminPageSteps.User_clicks_on_Add_products_and_peform_all_the_actions(String,String,String,String,String)"
});
formatter.result({
  "duration": 7762415260,
  "status": "passed"
});
});