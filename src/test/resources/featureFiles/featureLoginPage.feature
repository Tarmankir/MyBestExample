Feature: Testing login page functionality
# todo refactor methods: change theirs signature

  Scenario: Login page authorization check
    Given Open login page
      When Login in site
      And Click signup button
      Then Check user


    # Given I am on the login page
    # When I am logining in with login = <login> and password = <password>
    # Then I am checking that <user> is authorized