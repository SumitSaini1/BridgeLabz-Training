package com.example.junit_demo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class FileProcessorTest {
	FileProcessor processor = new FileProcessor();

    @Test
    void testWriteAndReadFile() throws IOException {
        String filename = "test.txt";
        String content = "Hello Capgemini";

        processor.writeToFile(filename, content);
        String result = processor.readFromFile(filename);

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        String filename = "input.txt";

        processor.writeToFile(filename, "Check file");

        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    void testReadFileNotFoundException() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }
	

}
