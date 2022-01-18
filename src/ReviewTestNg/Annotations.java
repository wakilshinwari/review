package ReviewTestNg;

import org.testng.annotations.*;

//it is a precodintiojn and it prints every time a test is executed
public class Annotations {
    @BeforeTest
    public void beforetestAnnotaion(){
        System.out.println("I am a before test annotation");
    }
    @BeforeClass
    public void classAnnotation (){
        System.out.println(" I am a before class annotaion");
    }
    @AfterClass
    public void AfterClassAnnotation(){
        System.out.println(" I am a after class annotation");
    }
    @BeforeMethod
    public void before(){
        System.out.println("I am a before method");
    }
    @AfterMethod
    public void after (){
        System.out.println(" I am after method");
    }
    @Test
    public void test(){
        System.out.println("I am a test case no 1");
    }
    @Test
    public void stest(){
        System.out.println("I am a test case no 2");
    }
}
