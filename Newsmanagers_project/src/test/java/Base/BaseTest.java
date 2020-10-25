package Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/kondratievas/Загрузки/chromedriver");
        Configuration.headless = true;
        Configuration.baseUrl = "https://www.newsmanagers.com/";
//        System.setProperty("chromeoptions.args", "--disable-gpu");
//        System.setProperty("chromeoptions.args", "--no-sandbox");
//        Configuration.startMaximized = false;
//        Configuration.holdBrowserOpen = false;
        Selenide.clearBrowserCookies();
    }

//    @AfterMethod
//            public void logOff(){
//        Selenide.clearBrowserCookies();
//        Selenide.clearBrowserLocalStorage();

    @BeforeMethod
    public void logOff() {
        Selenide.clearBrowserCookies();
    }
}