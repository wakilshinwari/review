package ReviewTestNg;

import org.testng.annotations.Test;

public class dependsOnMethod {
    @Test(enabled = true)
    public void login() {
        System.out.println("I am login");
    }

    @Test(dependsOnMethods = "login")
    public void deleteEmployee() {
        System.out.println(" I am delete employee");
    }
}

