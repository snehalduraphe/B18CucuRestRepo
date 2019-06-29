package com.basic.getRequestSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestTestingSD {

	Response resp;
	
@Given("^user start the rest asured test$")
public void user_start_the_rest_asured_test() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("starting of the get request");
}

@When("^user hit the get request$")
public void user_hit_the_get_request() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("starting of the get request2");
	
	resp = RestAssured.given().relaxedHTTPSValidation().when().get("https://ergast.com/api/f1/2017/circuits.json");
	
	// print response in string
	String respString = resp.asString();
	System.out.println(respString);
	// get all 
}

@Then("^user check the limit$")
public void user_check_the_limit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("starting of the get request3");
}

@Then("^user checks the count or size$")
public void user_checks_the_count_or_size() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("starting of the get request4");
	
	String limitValue = resp.getBody().jsonPath().getString("MRData.limit");
	
	Assert.assertEquals( limitValue, "30");
//	Assert.assertTrue( "30" OR "40" );
	
//	resp.then().
	
	
	
}


}
