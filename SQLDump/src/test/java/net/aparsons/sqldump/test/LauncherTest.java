package net.aparsons.sqldump.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.Test;

import net.aparsons.sqldump.Launcher;

/**
 * Unit test for simple App.
 */
public class LauncherTest
{    
   
		
	@Test
	public void getOptionTest() throws IOException {
		Options options = Launcher.getOptions();
		assertEquals(6,options.getOptions().size());
		
			
	}
	@Test
	public void parseOKTest() throws IOException, ParseException {
		String[] arguments = new String[]{"-url", "a", 
				"-pass", "pass",
				"-user", "user",
				"-sql", "sql"};
		assertEquals(4,Launcher.parse(arguments).size());
	}
	
	@Test(expected = ParseException.class)
	public void parseKOTest() throws IOException, ParseException {
		assertEquals(1,Launcher.parse(new String[]{"-u4rl a"}));
	}
	
	@Test
	public void getHottestDay() throws IOException {
		System.out.println(Launcher.printUsage());
	}
}



	