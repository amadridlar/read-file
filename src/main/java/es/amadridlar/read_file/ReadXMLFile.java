package es.amadridlar.read_file;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadXMLFile {

	// PROPERTIES

	// CONSTRUCTORS
	public ReadXMLFile() {
	}

	// METHODS
	public static String xmlToString(String xmlPath) {
		String envelope = "";

		try {
			FileReader file = new FileReader(xmlPath);
			BufferedReader buffer = new BufferedReader(file);
			String line = "";
			while (line != null) {
				line = buffer.readLine();
				if (line == null) {
					break;
				}
				envelope = envelope + line + "\r\n";
			}
		} catch (Exception e) {
			System.out.println("Error reading file");
		}

		return envelope;
	}

}
