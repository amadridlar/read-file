package es.amadridlar.read_file;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class ReadXMLFileTest {
	

	@Test
	public void test() {
		String fileString = ReadXMLFile.xmlToString("src/test/test.xml");
		
		Assert.assertEquals("<node1>\r\n" + 
			"	<node2>\r\n" + 
			"		<node3>test example body</node3>\r\n" + 
			"	</node2>\r\n" + 
			"</node1>\r\n", fileString);
	}

}
