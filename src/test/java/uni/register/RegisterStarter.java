package uni.register;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty", "html:target/register-feature"})
//@CucumberOptions(monochrome = true, plugin = {"pretty", "json:target/register-feature.json"})
public class RegisterStarter {

}
