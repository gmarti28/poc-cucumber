package hellocucumber;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

class IsItFriday {
    static String isItFriday(String today) {
        if ((""+today).toLowerCase().equals("friday"))
            return "Si";
        else
        return "Nope";
    }


}

public class Stepdefs {
    private String today;
    private String actualAnswer;

    @Given("^hoy es viernes$")
    public void hoyEsViernes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.today="Friday";
    }

    @Given("^hoy es domingo")
    public void today_is_Sunday() {
        // Write code here that turns the phrase above into concrete actions
        this.today = "Sunday";
    }

    @When("^pregunto si es viernes$")
    public void preguntoSiEsViernes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^me dicen que \"([^\"]*)\"$")
    public void meDicenQue(String expectedAnswer) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Then("^me gritan que \"([^\"])*\"$")
    public void meGritanQue(String what) throws Throwable {
        throw new PendingException();
    }
}