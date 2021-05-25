Feature: buy a product with the advantage app
  i as a user
  want to buy something in the shopping cart
  to proceed with the checkout

  Scenario: buy a product
    Given user logs in
    When user proceed buying without a valid payment method
      | product                    | quantity |
      | HP ELITEPAD 1000 G2 TABLET | 4        |
    Then he should see the alert message
