package uni.theme;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import uni.HomeScreenModel;

public class ThemeSteps {

	private HomeScreenModel openAppModel;

	public ThemeSteps(final HomeScreenModel openAppModel) {
		
		this.openAppModel = openAppModel;

	}

	@Given("^User open app$")
	public void openApp() throws Throwable {
		
	}

	@Given("^Open theme field$")
	public void openThemeField() throws Throwable {
		
	}

	@When("^User: \"([^\"]*)\" add theme title: \"([^\"]*)\" to new theme$")
	public void addThemeTitle(String role, String title) throws Throwable {
		openAppModel.setRole(role);
		openAppModel.setTitle(title);
	}

	@And("^Add desciption: \"([^\"]*)\"$")
	public void addThemeDescription(String description) throws Throwable {
		openAppModel.setDescription(description);
	}

	@And("^Click add new theme button$")
	public void clickAddNewThemeBtn() throws Throwable {
		openAppModel.addNewThemeButton();
	}
	
	@Then("^Message: \"([^\"]*)\"$")
	public void seeMsg(String message) throws Throwable {
		assertEquals(message, openAppModel.getMessage());
	}

}

