Feature: Testing login page functionality

  Scenario: Login page authorization check
    Given I am open login page
      When I am use login page functionality to signup in site
      And I am click signup button
      Then I am check user


    # Given I am on the login page
    # When I am logining in with login = <login> and password = <password>
    # Then I am checking that <user> is authorized