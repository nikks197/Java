import org.testng.annotations.Test;

import commonmethods.GoogleOpenAndClose;

public class LaunchChrome {
	
	
  @Test
  public void launchandclosegoole() {
	  GoogleOpenAndClose obj = new GoogleOpenAndClose();
	  obj.setProperty();
	  obj.maxWindow();
	  obj.launchURL("https://www.google.com");
	  obj.closeBrowser();
	  
  }
}
