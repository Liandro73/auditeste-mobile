package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    private static WebDriver driver;

    public Screenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void capturarScreenshot(String etapaTeste) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("resources/screenshots/evidencia_" + etapaTeste + ".jpg"));
    }
}