package ReviewTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
    @DataProvider (name = "Credentials")
    public Object [][] data (){
        Object [][] login ={
                {"Admin", "abc", "invalid credentials"},
                {"Admin", "xyz", "invalid credentials"},
                {"admi", " ", "password can not be empty"},
                {" ", "hum", "username can not be empty"}
        };
        return login;

    }
    @Test (dataProvider = "Credentials")
    public void dataTest(String username, String paswrd, String errorMsg){
        System.out.println("the username is : "+ username);
        System.out.println("the password is : " + paswrd);
        System.out.println("the error is : "+ errorMsg);

    }
}
