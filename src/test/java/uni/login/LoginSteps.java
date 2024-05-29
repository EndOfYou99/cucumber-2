package uni.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.login.model.LoginScreenModel;

public class LoginSteps {
 
	private LoginScreenModel loginModel;

	@Given("^User open enter page$")
	public void openLoginPage() throws Throwable {
		loginModel = new LoginScreenModel();
	}

	@When("^Insert username: \"([^\"]*)\"$")
	public void addUsername(final String username) throws Throwable {
		loginModel.setUsername(username);
	}

	@When("^Insert user password: \\(\"([^\"]*)\"\\)$")
	public void addPassword(final String password) throws Throwable {
	    loginModel.setPassword(password);
	}
	

	@When("^Click the login button$")
	public void clickLoginButton() throws Throwable {
		loginModel.clickLoginButton();
	}

	@Then("^See message: \"([^\"]*)\"$")
	public void checkMessage(String entrenceMessagge) throws Throwable {
		assertEquals(entrenceMessagge, loginModel.getMessage());
	}
	

}
