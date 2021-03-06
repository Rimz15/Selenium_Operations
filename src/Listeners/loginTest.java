package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest {
	
	@Test(enabled=false)
	void loginByEmail()
	{
		System.out.println("Login By Email");
		Assert.assertEquals("Pavan","Pavan");
	}
	
	@Test
	void loginByFacebook()
	{
		System.out.println("Login By Facebook");
		Assert.assertEquals("Pavan","Kumar");
	}

}
