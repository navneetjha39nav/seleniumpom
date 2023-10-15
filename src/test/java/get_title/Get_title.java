package get_title;

import TEST.TestBaseClass;

import static TEST.TestBaseClass.driver;

public class Get_title {
    public void Get_title1()
    {
        String EgetTitle="#1 Free CRM Power Up your Entire Business Free Forever";
        System.out.println(driver.getTitle());
        if(EgetTitle.equals(driver.getTitle()))
        {
            System.out.println("TITLE IS CORRECT");
        }
        else
        {
            System.out.println("TITLE IS INCORRECT");
        }
    }
}
