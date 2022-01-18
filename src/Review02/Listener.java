package Review02;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
    public void onTestFailure (ITestResult result){
        System.out.println("Failed the execution with test"+ result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("I have passed : "+ result.getName());
    }

}
