package test2;

import TEST.TestBaseClass;

import static TEST.TestBaseClass.driver;

public class GetTest {
    public static void main(String[] args) {
        TestBaseClass testBase = new TestBaseClass();
        testBase.Readfile();

        System.out.println(driver.getTitle());

    }
}
