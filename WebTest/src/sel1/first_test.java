package sel1;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class first_test {
	
	public static void main(String[] args){
		
	Selenium objSelenium= new DefaultSelenium ("localhos",5555,"firefox","http://www.ebay.com");
	
	objSelenium.start();
		//koment
	}
	
	

}
