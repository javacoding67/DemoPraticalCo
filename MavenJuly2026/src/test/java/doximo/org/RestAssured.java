package doximo.org;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class RestAssured {
	
	@Test(priority=1)
	public void getUser() {
		given()
		
		.when()
		  .get("https://jsonplaceholder.typicode.com/posts/1")
		
		.then()
		   .statusCode(200)
		   .body("userId",equalTo(1))
		   .log().all();

	}
	
	@Test(priority=2)
	public void creat() {
		HashMap d=new HashMap();
		d.put("name","Maruti");
		
		given()
		  .contentType("application/json")
		  .body(d)
		
		.when()
		   .post("https://jsonplaceholder.typicode.com/posts")
		
		.then()
		   .statusCode(201)
		   .log().all();

	}
	
	@Test(priority=3)
	public void updateUser() {
		HashMap d=new HashMap();
		d.put("name","Malathy");
		
		given()
		  .contentType("application/json")
		  .body(d)
		
		.when()
		   .put("https://jsonplaceholder.typicode.com/posts/1")
		
		.then()
		   .statusCode(200)
		   .log().all();

	}
	
	@Test(priority=4)
	public void delete() {
		given()
		
		.when()
		  .delete("https://jsonplaceholder.typicode.com/posts/1")
		
		.then()
		   .statusCode(200)
		   .log().all();

	}
	
	
	
	

}
