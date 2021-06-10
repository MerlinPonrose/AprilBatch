@Facebook
Feature: Facebook Functionality

Background: Given User launches the browser and open demosite URL "http://demo.automationtesting.in/SignIn.html"



@Smoke
Scenario: Login the Facebook application
When User enter emailid "merlin" in username textbox
And User enter password "password" in password textbox

@Regression
Scenario Outline: Login demo site with multiple data
Given User launches the browser and open demosite URL "<URL>"
When User enter emailid "<Username>" in username textbox
And User enter password "<Password>" in password textbox

Examples:
| URL | Username | Password |
| http://demo.automationtesting.in/SignIn.html | merlin | password1 |
| http://demo.automationtesting.in/SignIn.html | Jai | password2|
| http://demo.automationtesting.in/SignIn.html | Baskar | password3 |
| http://demo.automationtesting.in/SignIn.html | mano | password4 |
| http://demo.automationtesting.in/SignIn.html | dhina | password5 |



