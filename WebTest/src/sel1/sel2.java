package sel1;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class sel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium objSelenium= new DefaultSelenium ("localhos",5555,"firefox","http://www.ebay.com");
		objSelenium.start();
		
	}

}
