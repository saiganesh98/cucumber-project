package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sampleStepDefs {
   

    @Given("open browser")
    public void openBrowser(){
        System.out.println("Open browser scenario step");
    }

    @When("land on login page")
    public void land_on_login_page() {
        System.out.println("Land on login page");
    }

    @Then("url should contain {string}")
    public void url_should_contain(String s) {
        System.out.println("verify the URL contains -"+s);
    }

}
