package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.widget.TextView[@text=\"Calculator\"]"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

public void inputFirstNumber(String number) {
    type(MobileBy.id("et_1"), number);
}

  public void inputSecondNumber(String number) {
    type(MobileBy.id("et_2"), number);
  }

  public void clickOperator() {
    click(MobileBy.id("spinner_1"));
  }

  public void clickEquals() {
    click(MobileBy.id("acb_calculate"));
  }

  public void chooseAdd() {
    click(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"+\"]"));
  }

  public void chooseMin() {
    click(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"-\"]"));
  }

  public void chooseDiv() {
    click(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"/\"]"));
  }

  public void chooseMultiple() {
    click(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"*\"]"));
  }

  public String result() {
    String result = "";
    String resultFromMobile =getText(MobileBy.id("tv_result"));
    result = resultFromMobile.substring(8, 9);
    return result;
  }
}
