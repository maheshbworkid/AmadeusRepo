package com.qa.stepDefinations;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.driverFactory.DriverFactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private static String title;
	
private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());



@Given("user is on welcome page")
public void user_is_on_welcome_page() {
	DriverFactory.getDriver().get("https://www.amazon.in");
}

@When("user gets the title of the page")
public void user_gets_the_title_of_the_page() {
	 title=loginpage.getPageTitle();
	System.out.println("The login page title is" +  title);
}

@Then("the page title should be {string}")
public void the_page_title_should_be(String expectedTitleName) {
	
	//Assert.assertTrue(title.contains(expectedTitleName))
	Assert.assertTrue(title.contains(expectedTitleName) );
}


@Then("user click on Sign in dropdown button")
public void user_click_on_sign_in_dropdown_button() {
	loginpage.clickonSignIn();
	
}

@Then("user is on login page with page title {string}")
public void user_is_on_login_page_with_page_title(String expectedTitle) {
	String signInTitle=loginpage.getPageTitle();
	System.out.println("sign in title of the page is" + signInTitle);
	
}



@Then("User enters valid username and password")
public void user_enters_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	
	List<List<String>> creds=dataTable.asLists(String.class);
	for(List<String> e:creds) {
		loginpage.enterCredentials(e.toString(), e.toString());
	}
	
	loginpage.continueSignIn();
}

@Then("user verifies the signed in user name")
public void user_verifies_the_signed_in_user_name() {
   
}
}
