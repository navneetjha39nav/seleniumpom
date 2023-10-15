package TEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBaseClass {
    public static WebDriver driver;
    static Properties prop;

    public TestBaseClass() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\NAVNEET KUMAR JHA\\IdeaProjects\\SYSTEM_TEST\\src\\main\\java\\config_package\\property");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void Readfile() {
        String browser = prop.getProperty("Browser");
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Please select a proper browser name");
        }

        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }
}
