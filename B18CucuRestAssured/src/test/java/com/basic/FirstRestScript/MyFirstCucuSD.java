package com.basic.FirstRestScript;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyFirstCucuSD {

	Response res;
	
	@Given("^User hit the get request$")
	public void User_hit_the_get_request(){
		res = RestAssured.given().get("https://google.com");
	}
	
	@Then("^User checks the \"([^\"]*)\" status code$")
	public void User_checks_the_status_code(String stCode){
		int stateCode = res.statusCode();
		System.out.println("Status Code = " + stateCode);
		Assert.assertEquals(stCode, Integer.toString(stateCode));
	}
}
