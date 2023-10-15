package test2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import TEST.TestBaseClass;
import get_title.Get_title;

public class GetTest {
    TestBaseClass testBase = new TestBaseClass();
    Get_title Get_tit = new Get_title();

    @BeforeClass
    public void performTest() {
        // Set up the WebDriver by reading configuration from a properties file
        TestBaseClass.Readfile();
    }
@Test
    public void performTest1() {
        // Perform the test action (e.g., getting the title of a web page)
        Get_tit.Get_title1();
    }
}
