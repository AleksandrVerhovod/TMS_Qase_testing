package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Radiobutton {
    private WebDriver driver;

    public Radiobutton(WebDriver driver,String labelText) {
        this.driver = driver;
    }

    private static final String CLICK_BUTTON_XPATH = "//div[@class='suite']//p[text()='%s']";

    public void selectOptionRadiobutton(String option) {
        String listFinalXpath = String.format(CLICK_BUTTON_XPATH,option);
        driver.findElement(By.xpath(listFinalXpath)).click();
    }


    private static final String ROLE_BUTTON_XPATH = "//label[@class='form-check-label' and @for='role-%s']";
    private static final String INDUSTRY_BUTTONS_XPATH = "//label[@class='form-check-label' and @for='industry-%s']";
    private static final String DESCRIBE_BUTTONS_XPATH = "//label[@class='form-check-label' and @for='company-type-%s']";

    public void selectRoleRadiobutton(String option) {
        String listFinalXpath = String.format(ROLE_BUTTON_XPATH,option);
        driver.findElement(By.xpath(listFinalXpath)).click();
    }

    public void selectIndustryRadiobutton(String option) {
        String listFinalXpath = String.format(INDUSTRY_BUTTONS_XPATH,option);
        driver.findElement(By.xpath(listFinalXpath)).click();
    }

    public void selectDescribesRadiobutton(String option) {
        String listFinalXpath = String.format(DESCRIBE_BUTTONS_XPATH,option);
        driver.findElement(By.xpath(listFinalXpath)).click();
    }

}
