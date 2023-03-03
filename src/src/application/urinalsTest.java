package application;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class urinalsTest {

	@Test
	void inputFileValidTest() throws IOException {
		// This test checks if the input file exists at the path entered.
		assertDoesNotThrow(()->{urinals.usingFile();});
	}
	
	@Test
	void outputFileCreationTest() {
		// This checks that the output file exists after execution of usingFile method
		assertDoesNotThrow(()->{urinals.usingFile();});
		File file = new File(System.getProperty("user.dir")+"\\rule.txt");
		assertEquals(true, file.exists());
	}
	
	@Test
	void checkUrinalCount()
	{
		int answer = urinals.countUrinals("10001");
		assertEquals(1,answer);
		answer = urinals.countUrinals("1001");
		assertEquals(0, answer);
		answer = urinals.countUrinals("00000");
		assertEquals(3, answer);
		answer = urinals.countUrinals("0000");
		assertEquals(2, answer);
		answer = urinals.countUrinals("01000");
		assertEquals(1, answer);
		answer = urinals.countUrinals("011");
		assertEquals(-1, answer);
	}
	
	@Test
	void invalidStringInput()
	{
		int answer = urinals.countUrinals("1000100010001000100001");
		assertEquals(-1,answer);
		answer = urinals.countUrinals("");
		assertEquals(-1,answer);
		answer = urinals.countUrinals("123");
		assertEquals(-1,answer);
	}
}
