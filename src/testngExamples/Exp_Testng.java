package testngExamples;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_Testng {
	@BeforeClass
	public void login() {
		
		System.out.println("Login Completed");
	}
	@AfterClass
	public void logout() {
		System.out.println("Logout Completd");
			}
	@Test 
	public void addEmp() {
		System.out.println("add new emp");
	}
	@Test 
	public void delEmp() {
		System.out.println("del Emp");
	}
	}

