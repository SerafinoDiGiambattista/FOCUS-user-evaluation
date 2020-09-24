package jsoup_example.jsoup_example;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest
{    
    App app;
		
	@Test
	public void getCalciomercatoNewsTest() throws IOException {
		assertEquals(4, App.getCalciomercatoNews());
	}
	@Test
	public void getWinningAwayTeamsTest() throws IOException {
		assertEquals(184, App.getWinningAwayTeams().size());
	}
	
	@Test
	public void getDayWithBiggerTemperatureDifference() throws IOException {
		assertEquals("Martedì 29",App.getDayWithBiggerTemperatureDifference());
	}
}



	