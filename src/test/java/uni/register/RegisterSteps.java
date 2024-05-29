package uni.register;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.register.model.RegisterScreenModel;

public class RegisterSteps {

	private RegisterScreenModel registerModel;

	@Given("^User open register page$")
	public void openRegisterPage() throws Throwable {		
    registerModel = new RegisterScreenModel();
	}

	@When("^Inser username: \"([^\"]*)\"$")
	public void setUsername(String username) throws Throwable {
		registerModel.setUsername(username);
	 
	}

	@When("^Inser password: \"([^\"]*)\"$")
	public void setPassword(String password) throws Throwable {
	   registerModel.setPassword(password);
	}

	@When("^Inser second password: \"([^\"]*)\"$")
	public void setPasswordSec(String pass) throws Throwable {
    registerModel.setPasswordSec(pass);
	}

	@When("^Inser email: \"([^\"]*)\"$")
	public void setEmail(String email) throws Throwable {
    registerModel.setEmail(email);
	}


	@When("^Click the register button$")
	public void clickRegisterButton() throws Throwable {
		registerModel.clickRegisterButton();
	}

	@Then("^See mssage: \"([^\"]*)\"$")
	public void checkMessage(String messagge) throws Throwable {
		assertEquals(messagge, registerModel.getMessage());
	}

}
