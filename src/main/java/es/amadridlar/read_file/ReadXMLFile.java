package es.amadridlar.read_file;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadXMLFile {

	// PROPERTIES

	// CONSTRUCTORS
	public ReadXMLFile() {
	}

	// METHODS
	/**
	 * Read an xml file alocated in the pc. Returns a String with the text in the xml file
	 * 
	 * @param xmlPath
	 *            where the xml file is alocated
	 * @return String with the xml text. Every line of the file finish with \n\r
	 */
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
