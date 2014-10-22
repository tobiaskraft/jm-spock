/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

waiting {
  timeout = 2
}

environments {
  chrome {
    driver = { new ChromeDriver() }
  }

  firefox {
    driver = { new FirefoxDriver() }
  }

  phantomJs {
    driver = { new PhantomJSDriver() }
  }
}
