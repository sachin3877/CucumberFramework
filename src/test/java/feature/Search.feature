Feature: search and place a order for  product

  @Sanity
  Scenario Outline: seach experience for product search in both home and offers page
    Given User is on GreenCart Landing page
    When User searched with shortname '<name>' and extrated the actual name of product
    Then User searched for same shortname '<name>' in offer page to check if product exist with same name
    And validate product name in offers page matches with Landing page

    Examples: 
      | name |
      | tom  |
     # | car  |
    #  | sach |
