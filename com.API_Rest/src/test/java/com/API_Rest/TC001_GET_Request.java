package com.API_Rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {

	@Test
	void getweatherDeatils() {


		//BaseURL
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city/";

		//Request object 
		RequestSpecification httpprerequest=RestAssured.given();

		//Response object
		Response respon = httpprerequest.request(Method.GET,"Hyderabad");


		//print response in console
		String responceBody=	respon.getBody().asString();
		System.out.println("responceBody:  "+responceBody);
 



	}

}
