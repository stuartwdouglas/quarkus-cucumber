import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Steps {

  private ValidatableResponse result;

  @ConfigProperty(defaultValue = "test")
  String property;


  @Given("I call the endpoint")
  public void i_call_endpoint() throws Exception {
    result = given()
        .when().get("/")
        .then();
  }

  @Then("the response is ok")
  public void response_is_ok() throws Exception {
    result.statusCode(200);
  }

}
