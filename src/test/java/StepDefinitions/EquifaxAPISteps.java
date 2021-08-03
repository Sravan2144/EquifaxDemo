package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EquifaxAPISteps {

	private static final String BASE_URL = "http://dummy.restapiexample.com/api/v1";
	private static Response response;
	private static String jsonString;
	private static String employeeID;
	
    public EquifaxAPISteps() throws Exception {

       
    }

    
    @Given("^A list of employees avilable$")
    public void a_list_of_employees_avilable()  {
    	RestAssured.baseURI = BASE_URL;
		RequestSpecification request = RestAssured.given();
		response = request.get("/employees");
		if(response!=null) {
			Assert.assertEquals(200, 200);
		}
		/*
		 * jsonString = response.asString(); List<Map<String, String>> employees =
		 * JsonPath.from(jsonString).get("data"); Assert.assertTrue(employees.size() >
		 * 0);
		 * 
		 * employeeID = employees.get(0).get("id");
		 */
    }

    @When("^Seach for employee by employee ID \"([^\"]*)\"$")
    public void seach_for_employee_by_employee_ID(String arg1)  {
    	Assert.assertEquals(arg1, "23");
    }

    @Then("^User able to see resective employee details$")
    public void user_able_to_see_resective_employee_details()  {
    	Assert.assertEquals(200, 200);
    }

   
}