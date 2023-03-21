$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/RedBus.feature");
formatter.feature({
  "name": "To validate the login function using list",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "To launch the browser and maxmize",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has to click the Sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "login.userHasToClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "USer has to pass the mobile number",
  "rows": [
    {
      "cells": [
        "mob1",
        "9986543210"
      ]
    },
    {
      "cells": [
        "mob2",
        "9638527410"
      ]
    },
    {
      "cells": [
        "mob3",
        "9685471230"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "login.userHasToPassTheMobileNumber(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "To launch the browser and maxmize",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate login page using list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User click the sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "list.userClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the mobile number in to the mobile number field",
  "rows": [
    {
      "cells": [
        "9876543210",
        "6985471230",
        "852147963"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "list.userPassTheMobileNumberInToTheMobileNumberField(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TO validate login with valid phone number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To click the sign in button",
  "keyword": "When "
});
formatter.step({
  "name": "To pass the valid mobile number in to the\"\u003cmobilenumber\u003e\" mobile number field",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mobilenumber"
      ]
    },
    {
      "cells": [
        "9688634074"
      ]
    },
    {
      "cells": [
        "9876543210"
      ]
    },
    {
      "cells": [
        "8521478520"
      ]
    }
  ]
});
formatter.background({
  "name": "To launch the browser and maxmize",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "TO validate login with valid phone number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To click the sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "Redbus.toClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid mobile number in to the\"9688634074\" mobile number field",
  "keyword": "And "
});
formatter.match({
  "location": "Redbus.toPassTheValidMobileNumberInToTheMobileNumberField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "To launch the browser and maxmize",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "TO validate login with valid phone number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To click the sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "Redbus.toClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid mobile number in to the\"9876543210\" mobile number field",
  "keyword": "And "
});
formatter.match({
  "location": "Redbus.toPassTheValidMobileNumberInToTheMobileNumberField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "To launch the browser and maxmize",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "TO validate login with valid phone number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To click the sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "Redbus.toClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid mobile number in to the\"8521478520\" mobile number field",
  "keyword": "And "
});
formatter.match({
  "location": "Redbus.toPassTheValidMobileNumberInToTheMobileNumberField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});