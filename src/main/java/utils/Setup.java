package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Setup {
    private WebDriver controller;
    public WebDriver configDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Constants.PLATFORM_NAME);
        capabilities.setCapability("platformVersion", Constants.PLATFORM_VERSION);
        capabilities.setCapability("deviceName", Constants.DEVICE_NAME);
        capabilities.setCapability("appPackage", Constants.APP_PACKAGE);
        capabilities.setCapability("appActivity", Constants.APP_ACTIVITY);
        try {
            controller = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }catch (MalformedURLException e){
        }
        return controller;
    }
    public static Setup getDriver(){
        return new Setup();
    }
}