package BatchTesting;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	
	public void loginByEmail(){
		System.out.println("This is login by email");
	}
	
	@Test
	public void loginByFacebook(){
		System.out.println("This is login by Facebook");
	}
	
	@Test
	public void loginByTwitter(){
		System.out.println("This is login by Twitter");
	}

}
