package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class NavigationMenuSteps extends BaseTest {
  @When("user go to list menu")
  public void userGoToListMenu() {
    navigationMenu.clickHamburgerBtn();
    navigationMenu.clickListMenu();
  }

    @And("user long press nav menu")
    public void userLongPressNavMenu() {
        navigationMenu.holdClickHamburgerBtn();
    }

  @And("user multiple press nav menu")
  public void userMultiplePressNavMenu() {
    navigationMenu.doubleClickHamburgerBtn();
  }
}
