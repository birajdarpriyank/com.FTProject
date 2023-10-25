package com.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.POJO.Base;

public class SSutility extends Base{
	
	
	
	
	public static void Screenshot() throws IOException
	{
		File take = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(take, new File(".\\src\\test\\resources\\ScreenShots"));
	}
}
