package com.API_Rest;

import files.payLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJson {
	public static void main(String[] args)
	{
		JsonPath js =new JsonPath(payLoad.CoursePrice());
		//No of Course
		
		int count=js.getInt("courses.size()");
		System.out.println(count);
		//print purchase
		int totalAmt=js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmt);
		//pring title
		String title=js.get("courses[0].title");
		System.out.println(title);
		//print all course and title
		for(int i =0; i<count;i++)
		{
			
			String courseTitle=js.get("courses["+i+"].title");
			
			System.out.println(courseTitle);
			System.out.println(js.get("courses["+i+"].price").toString());
			
		}
		//No of Copies Sold
		System.out.println("print no of copies: ");
		for(int i =0; i<count;i++)
		{
		String courseTitle=js.get("courses["+i+"].title");
		
		if(courseTitle.equalsIgnoreCase("Cypress"))
		{
			int copies=js.get("courses["+i+"].copies");
			System.out.println(copies);
			break;
		}
		}
	}
	
	}
