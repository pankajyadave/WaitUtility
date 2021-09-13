package WaitUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLibrary.BaseLibrary;

public class WaitUtility extends BaseLibrary
{
	static WebDriverWait wait;

// explicit wait ============================================
	public static void WaitAlertisPresent(int time)
	{
		try
		{
			wait=new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			System.out.println("Issue in WaitAlertisPresent "+e);
		}
	}
// explicit wait ============================================

// fluent wait ======================================================
	public static void fluentwait(int a)
	{
		Wait wait=new FluentWait(driver).withTimeout(7, TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS).ignoring(Exception.class);
		
		wait.until(ExpectedConditions.alertIsPresent());
	}
// fluent wait ======================================================

}
