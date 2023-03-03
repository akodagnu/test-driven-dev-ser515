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
		File file = new File(System.getProperty("user.dir")+"rule.txt");
		assertEquals(true, file.exists());
	}
	
	@Test
	void checkUrinalCount()
	{
		int answer = urinals.countUrinals("10001");
		assertEquals(1,answer);
	}
}
