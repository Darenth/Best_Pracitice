package utility;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;


import static config.WebDriverSingleton.getInstance;

public class Screenshot {

    @Attachment(value="Screenshot", type="image/png")
    public static byte[] captureScreenshot() {
        System.out.println("Screenshot is created");
        System.out.println("Screenshot is created2");
        return ((TakesScreenshot) getInstance()).getScreenshotAs(OutputType.BYTES);
    }
}
