package TestNGFirstProgram;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstScriptWithTestNG {


    @Test()
    void secondTest() {
        int a = 0;
        int b = 0;
        Assert.assertTrue(a==b, "both valus should same");
    }


    @Test(groups = "smoke", dependsOnMethods = "secondTest")
    void firstTest() {
        System.out.println("First Test execution");
    }

    @Test(dependsOnMethods = "firstTest")
    void lastTest(){
        int a = 0;
        int b = 1;
        Assert.assertTrue(a==b, "both valus should same");
    }

    @Test(dependsOnMethods = "lastTest")
    void fourthTest(){
        System.out.println("Fourth Test");
    }

}
