$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/BudgetCalculator.feature");
formatter.feature({
  "name": "BudgetCalculator",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@VerifyBudgetCalculator"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is at the  asian Paints home page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaintAndTexture.user_is_at_the_asian_Paints_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Paints \u0026 textures icon",
  "keyword": "And "
});
formatter.match({
  "location": "PaintAndTexture.user_click_on_Paints_textures_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Quick Interior budget calculator",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VerifyBudgetCalculator"
    }
  ]
});
formatter.step({
  "name": "click on PaintBudgetCalculator",
  "keyword": "And "
});
formatter.match({
  "location": "BudgetCalculator.click_on_PaintBudgetCalculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on quick calculator and enters the required fields",
  "keyword": "When "
});
formatter.match({
  "location": "BudgetCalculator.click_on_quick_calculator_and_enters_the_required_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to get calculated budget",
  "keyword": "Then "
});
formatter.match({
  "location": "BudgetCalculator.user_should_able_to_get_calculated_budget()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/ContractorFinder.feature");
formatter.feature({
  "name": "ContractorFinder",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@VerifyContractorFinder"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is at the  asian Paints home page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaintAndTexture.user_is_at_the_asian_Paints_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "successful in finding the contractor in our locality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VerifyContractorFinder"
    }
  ]
});
formatter.step({
  "name": "user click on Contractor Finder icon",
  "keyword": "And "
});
formatter.match({
  "location": "ContractorFinder.user_click_on_Contractor_Finder_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid city name",
  "keyword": "And "
});
formatter.match({
  "location": "ContractorFinder.enter_valid_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see the list of contractor",
  "keyword": "Then "
});
formatter.match({
  "location": "ContractorFinder.user_should_able_to_see_the_list_of_contractor()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h3[normalize-space()\u003d\u0027Mushtaque Isa Sahikh\u0027]\"}\n  (Session info: chrome\u003d91.0.4472.106)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027DESKTOP-IO3KT7F\u0027, ip: \u0027192.168.1.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002716.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.106, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\VANDANA\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:61270}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 41e4874b22585143391fb4e7195aa8f0\n*** Element info: {Using\u003dxpath, value\u003d//h3[normalize-space()\u003d\u0027Mushtaque Isa Sahikh\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdefs.ContractorFinder.user_should_able_to_see_the_list_of_contractor(ContractorFinder.java:58)\r\n\tat ✽.user should able to see the list of contractor(file:src/test/resources/Feature/ContractorFinder.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/Paint\u0026Texture.feature");
formatter.feature({
  "name": "Paints\u0026Textures",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@VerifyPaints\u0026Textures"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is at the  asian Paints home page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaintAndTexture.user_is_at_the_asian_Paints_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Paints \u0026 textures icon",
  "keyword": "And "
});
formatter.match({
  "location": "PaintAndTexture.user_click_on_Paints_textures_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying interior paints",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VerifyPaints\u0026Textures"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.step({
  "name": "user click on interiors wall paints",
  "keyword": "When "
});
formatter.match({
  "location": "PaintAndTexture.user_click_on_interiors_wall_paints()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see all the different types of paints in interior Category",
  "keyword": "Then "
});
formatter.match({
  "location": "PaintAndTexture.user_should_able_to_see_all_the_different_types_of_paints_in_interior_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is at the  asian Paints home page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaintAndTexture.user_is_at_the_asian_Paints_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Paints \u0026 textures icon",
  "keyword": "And "
});
formatter.match({
  "location": "PaintAndTexture.user_click_on_Paints_textures_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying exterior paints",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VerifyPaints\u0026Textures"
    },
    {
      "name": "@second"
    }
  ]
});
formatter.step({
  "name": "click on exteriors wall paints",
  "keyword": "When "
});
formatter.match({
  "location": "PaintAndTexture.click_on_exteriors_wall_paints()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d91.0.4472.106)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027DESKTOP-IO3KT7F\u0027, ip: \u0027192.168.1.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002716.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.106, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\VANDANA\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:50587}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9aa0193771511d1ce42968ec23ed97cb\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat jdk.internal.reflect.GeneratedMethodAccessor1.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy22.click(Unknown Source)\r\n\tat pageFactory.ColourAndTexture.cookies(ColourAndTexture.java:179)\r\n\tat stepdefs.PaintAndTexture.click_on_exteriors_wall_paints(PaintAndTexture.java:79)\r\n\tat ✽.click on exteriors wall paints(file:src/test/resources/Feature/Paint\u0026Texture.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should able to see all the different types of paints in exterior Category",
  "keyword": "Then "
});
formatter.match({
  "location": "PaintAndTexture.user_should_able_to_see_all_the_different_types_of_paints_in_exterior_Category()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is at the  asian Paints home page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaintAndTexture.user_is_at_the_asian_Paints_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Paints \u0026 textures icon",
  "keyword": "And "
});
formatter.match({
  "location": "PaintAndTexture.user_click_on_Paints_textures_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying Wood \u0026 Metals paints",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VerifyPaints\u0026Textures"
    },
    {
      "name": "@Third"
    }
  ]
});
formatter.step({
  "name": "click on wood and metal wall paints",
  "keyword": "When "
});
formatter.match({
  "location": "PaintAndTexture.click_on_wood_and_metal_wall_paints()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see all the different types of paints in wood and metal Category",
  "keyword": "Then "
});
formatter.match({
  "location": "PaintAndTexture.user_should_able_to_see_all_the_different_types_of_paints_in_wood_and_metal_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});