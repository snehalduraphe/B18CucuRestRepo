package com.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGoogle {
	
//	public static void main( String args[] ){
//		
//		Response res = RestAssured.given().get("https://google.com");
//		int stateCode = res.statusCode();
//		System.out.println("Status Code = " + stateCode);
//	}
	
	@Test
	public void testGoogle(){
		Response res = RestAssured.given().get("https://google.com");
		int stateCode = res.statusCode();
		System.out.println("Status Code = " + stateCode);
		Assert.assertEquals(stateCode, 200);
	}

}
