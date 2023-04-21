package sec02.examp02.stream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) throws Exception{
		Writer writer =new FileWriter("C:/Temp/test8.txt");
		
		char[] array = { 'A', 'B', 'C'};
		
		writer.write(array);
		
		writer.flush();
		writer.close();

	}

}
