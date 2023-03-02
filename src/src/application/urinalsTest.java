package application;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class urinalsTest {

	@Test
	void inputFileValidTest() throws IOException {
		// This test checks if the input file exists at the path entered.
		assertDoesNotThrow(()->{urinals.usingFile();});
	}
}
