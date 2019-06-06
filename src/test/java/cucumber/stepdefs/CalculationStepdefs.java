package cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.config.CucumberConfig;
import org.junit.Assert;
import org.springframework.http.ResponseEntity;

public class CalculationStepdefs extends CucumberConfig {

    private ResponseEntity<String> responseEntity;

    private String result_add = "Addition of 5 and 4 = 9";

    

    public String getCompleteEndPoint(String URI){
        System.out.println("Complete URL--->" + (staticURL + port + URI));
        return staticURL + port + URI;
    }


    @Given ("^Create two numbers for addition$")
    public void createTwoNumbersAddition() throws Throwable{
        String URI = "/";
        getCompleteEndPoint(URI);
    }


}

