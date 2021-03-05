package util;

import common.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Screenshot extends Base {

    private Base base;

    public Screenshot(Base base) {
        this.base = base;
    }

    public void capturarScreenshot(String etapaTeste) throws IOException {
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        File scrFile = ((TakesScreenshot) base.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("common/screenshots/evidencia_" + etapaTeste + ".jpg"));
    }
}