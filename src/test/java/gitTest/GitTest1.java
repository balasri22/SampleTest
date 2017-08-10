package gitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest1 {

	@Test
    public void logintest() throws IOException{
        WebDriver wd = new FirefoxDriver();
        //wd.get("https://www.google.co.com"); // error created for git diff
        wd.get("https://www.google.co.in");
        File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("E:\\VMETRY PROJECTS\\GitTest\\Screenshot\\google.jpg"));
        wd.quit();
    }
}
