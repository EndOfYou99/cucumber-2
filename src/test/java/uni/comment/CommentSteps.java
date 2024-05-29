package uni.comment;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.HomeScreenModel;

public class CommentSteps {

	private HomeScreenModel postModel;
	private HomeScreenModel commentModel;

	public CommentSteps(final HomeScreenModel postModel, final HomeScreenModel commentModel) {
		this.postModel = postModel;
		this.commentModel = commentModel;
	}

	@Given("^User open post$")
	public void openPost() throws Throwable {
		
		
	}

	@When("^Open comment entry field$")
	public void openCommentField() throws Throwable {
		
	}

	@When("^User \"([^\"]*)\" write: \"([^\"]*)\"$")
	public void addComment(String user, String comment) throws Throwable {
		commentModel.setComment(user, comment);
	}

	@When("^Click add comment button$")
	public void clickAddCommentBtn() throws Throwable {
		commentModel.clickAddCommentBtn();

	}

	@Then("^See: \"([^\"]*)\"$")
	public void seeMsg(String message) throws Throwable {
		assertEquals(message, postModel.getMessage());
	}
}

