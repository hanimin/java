package sec02.examp02.stream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {
		public static void main(String[] args) throws Exception{
			Writer writer =new FileWriter("C:/Temp/test9.txt");
			
			String str ="ABC";
			
			writer.write(str);
			
			writer.flush();
			writer.close();

		}

}
