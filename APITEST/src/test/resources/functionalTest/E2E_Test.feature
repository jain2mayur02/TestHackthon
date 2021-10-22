Feature: Test Back Office Modules

  Background: User generates token for Authorisation
	Given I am an authorized user

  @WEBAPITEST
  Scenario: Create PromoCode on Market basis
    Given A list of books are available
		When I add a book to my reading list
		Then The book is added
		When I remove a book from my reading list
		Then The book is removed