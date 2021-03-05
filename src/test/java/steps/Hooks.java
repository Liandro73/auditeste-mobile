package steps;

import common.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks extends Base {

    DesiredCapabilities capabilities = new DesiredCapabilities();
    private Base base;

    public Hooks(Base base) {
        this.base = base;
    }

    @Before
    public void inicializar() throws MalformedURLException {
        capabilities.setCapability("deviceName", "Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(CapabilityType.VERSION, "10.0");
        base.driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        base.driver.get(base.baseURL);
        base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @After
    public void finalizar() {
        base.driver.quit();
    }

}
