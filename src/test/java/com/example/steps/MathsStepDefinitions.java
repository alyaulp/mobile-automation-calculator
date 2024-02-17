package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MathsStepDefinitions extends BaseTest {
    @Given("input first number {string}") //Bilangan pertama
    public void inputFirstNumber(String arg0) {
        calculatorPage.inputFirstNumber(arg0);
    }

    @And("input second number {string}") //Bilangan kedua
    public void inputSecondNumber(String arg0) {
        calculatorPage.inputSecondNumber(arg0);
    }

    @Then("the total should be {string}") //Hasil
    public void theTotalShouldBe(String arg0) {
        String result = calculatorPage.result();
        assertThat(result).isEqualTo(arg0);
    }

    //Subtract
    @When("i subtraction first and second number") //Kurang
    public void iSubtractionFirstAndSecondNumber() {
        calculatorPage.clickOperator();
        calculatorPage.chooseMin();
        calculatorPage.clickEquals();
    }

    //Sum
    @When("i summation first and second number")
    public void iSummationFirstAndSecondNumber() {
        calculatorPage.clickOperator();
        calculatorPage.chooseAdd();
        calculatorPage.clickEquals();
    }

    //Divide
    @When("i divide first and second number")
    public void iDivideFirstAndSecondNumber() {
        calculatorPage.clickOperator();
        calculatorPage.chooseDiv();
        calculatorPage.clickEquals();
    }

    //Multiply
    @When("i multiple first and second number")
    public void iMultipleFirstAndSecondNumber() {
        calculatorPage.clickOperator();
        calculatorPage.chooseMultiple();
        calculatorPage.clickEquals();
    }
}
