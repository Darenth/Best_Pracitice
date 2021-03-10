package pages;


import org.hamcrest.core.IsEqual;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;




public class Profile extends BasePage {

    public Profile() {
        super();
    }

    @FindBy(css = "#center_column > h1")
    private WebElement profilePageHeader;

    @Step
    public void userShouldBeSuccessfullyRegistered() {
        String profilePageHeaderText = profilePageHeader.getText();
        String expectedHeaderText = "MY ACCOUNT";

        assertEquals(expectedHeaderText,profilePageHeaderText);
    }
}
