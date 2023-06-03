Feature: LoginPage
Background:
Given User Enters the URL 
 	@login
  Scenario: Login Page with Valid Credentials
    When User enters the username "daisyrubycatharine"
    And User enters the password "RP65IQ"
    And User clicks the login button    
        
    @login
  Scenario: Login Page with Invalid Credentials
    When User enters the username "daisyrubycatharin"
    And User enters the password "eedc"
    And User clicks the login button    
    
   

  