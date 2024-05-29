package uni.role;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uni.HomeScreenModel;

public class RoleSteps {
	private HomeScreenModel postModel;

	public RoleSteps(final HomeScreenModel postModel) {
	this.postModel = postModel;
	}

	@Given("^User open posts$")
	public void openPost() throws Throwable {
		
	}

	@When("^Admin open: \"([^\"]*)\" click theme delete button$")
	public void userClickDeleteBtn(String role) throws Throwable {
		postModel.setRole(role);
		postModel.clickDeleteThemeBtn();
	}


}
