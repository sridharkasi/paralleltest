package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Threadlocal2 {
@Test
	    public void testMethod1() throws InterruptedException {
	        invokeBrowser("http://newtours.demoaut.com/");
	        
	       // LocalDriverManager.getDriver().get("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	 
	    @Test
	    public void testMethod2() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod3() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod4() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod5() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod6() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod7() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod8() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod9() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod10() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod11() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod12() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	  /*  @Test
	    public void testMethod13() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod14() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod15() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod16() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod17() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod18() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod19() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod20() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod21() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod22() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod23() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod24() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     
			
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }
	    
	    @Test
	    public void testMethod25() throws InterruptedException {
	    	 invokeBrowser("http://newtours.demoaut.com/");
	     	
	        LocalDriverManager.getDriver().findElement(By.name("userName")).sendKeys("admin");
	        LocalDriverManager.getDriver().findElement(By.name("password")).sendKeys("mercury");
	        LocalDriverManager.getDriver().findElement(By.name("login")).click();
				
			
	        LocalDriverManager.getDriver().findElement(By.name("findFlights")).click();
	        LocalDriverManager.getDriver().findElement(By.name("reserveFlights")).click();
			
	        LocalDriverManager.getDriver().findElement(By.name("passFirst0")).sendKeys("rock");
	        LocalDriverManager.getDriver().findElement(By.name("passLast0")).sendKeys("block");
			
			Select mq = new Select(LocalDriverManager.getDriver().findElement(By.name("pass.0.meal")));
			mq.selectByVisibleText("Vegetarian");
			
			LocalDriverManager.getDriver().findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			LocalDriverManager.getDriver().findElement(By.name("buyFlights")).click();	
			Thread.sleep(100);
			LocalDriverManager.getDriver().close();
	    }*/
	    
	   
	    private void invokeBrowser(String url) {
	        System.out.println("Thread id = " + Thread.currentThread().getId());
	        System.out.println("Hashcode of webDriver instance = " + LocalDriverManager.getDriver().hashCode());
	        LocalDriverManager.getDriver().get(url);
	 
	    }
	    
	    

}
