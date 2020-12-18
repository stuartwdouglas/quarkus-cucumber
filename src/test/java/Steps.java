import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class Steps {

  private final MockMvc mvc;

  private ResultActions result;

  public Steps(MockMvc mvc) {
    this.mvc = mvc;
  }

  @Given("I call the endpoint")
  public void i_call_endpoint() throws Exception {
    result=  mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON));
  }

  @Then("the response is ok")
  public void response_is_ok() throws Exception {
    result.andExpect(status().isOk());
  }


}
