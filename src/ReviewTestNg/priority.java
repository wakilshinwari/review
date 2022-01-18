package ReviewTestNg;

import org.testng.annotations.Test;

public class priority{
    @Test (priority = 3, groups = "regression")

    public void firstTest(){

        System.out.println(" I am first");
    }
    @Test (priority = 2,enabled = true, groups = "smoke")
    public void secondTest(){
        System.out.println(" I am second");

    }
    @Test (priority = 1, groups = "regression")
    public void thirdTest(){
        System.out.println(" I am the third");
    }
        }
