import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.TouchAction;
import java.time.Duration;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.net.URL;
import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class captainStaging {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "RapidoStaging";
    protected AndroidDriver<AndroidElement> driver = null;
    File file=new File("src");
    File fs=new File(file,"captainStaging.apk" );

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
    	dc.setCapability("automationName", "UiAutomator2");
    	
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        dc.setCapability("autoGrantPermissions",true);
//        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.rapido.rider.splash.SplashScreen");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
        System.out.println("Finally something is happening......");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testRapidoStaging() {
//        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
//        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
//        driver.findElement(By.xpath("//*[@text='ALLOW ONLY WHILE USING THE APP']")).click();
//        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
        driver.findElement(By.xpath("//*[@text='Get Started']")).click();
//        driver.findElement(By.xpath("//*[@text='Get Started']")).click();
//        driver.findElement(By.xpath("//*[@text='Get Started']")).click();
        driver.findElement(By.xpath("//*[@id='iv_proceed']")).click();
      //  new TouchAction(driver).press(547, 1310).waitAction(Duration.ofMillis(1004)).moveTo(342, 1536).release().perform();
        driver.findElement(By.xpath("//*[@text='USE 7358681725']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='reg_phoneNumber']")));
        driver.findElement(By.xpath("//*[@id='reg_phoneNumber']")).click();
        driver.findElement(By.xpath("//*[@id='reg_phoneNumber']")).sendKeys("7358681725");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='keyboard_view']")));
        driver.findElement(By.xpath("//*[@id='keyboard_view']")).click();
        driver.findElement(By.xpath("//*[@id='keyboard_view']")).click();
        driver.findElement(By.xpath("//*[@text='Proceed']")).click();
        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
        driver.findElement(By.xpath("//*[@id='true_caller_missed_call_view']")).sendKeys("340990");
        new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='SUBMIT']")));
        driver.findElement(By.xpath("//*[@text='SUBMIT']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='ALLOW']")));
        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
        driver.findElement(By.xpath("//*[@text='Later']")).click();
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}