package com.API_Rest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import files.payLoad;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

public class sumofCalcualtion {
	@Test
	public void sumofCourse()

	{
		int sum=0;
		JsonPath js = new JsonPath(payLoad.CoursePrice());
		int count = js.getInt("courses.size()");
		for(int i =0; i<count;i++)
		{
			int price =js.get("courses["+i+"].price");
			int copies =js.get("courses["+i+"].copies");
			int amount = price*copies;
			System.out.println(amount);
			sum=sum+amount;
		}


		System.out.println("sum:   "+sum);
		int DPA=js.getInt("dashboard.purchaseAmount");
		Assert.	assertEquals(DPA, sum);

	}
}
