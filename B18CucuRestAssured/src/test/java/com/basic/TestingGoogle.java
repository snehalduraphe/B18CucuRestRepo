package com.basic;


import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGoogle {
		
	@Test
	public void testGoogle(){
		Response res = RestAssured.given().get("https://google.com");
		int stateCode = res.statusCode();
		System.out.println("Status Code = " + stateCode);
		Assert.assertEquals(stateCode, 200);
	}

}
