package sec02.examp01.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception{
InputStream is =new FileInputStream("C:/Temp/test3.db");
		
		byte[] buffer = new byte[5];
	
			int readByteNum = is.read(buffer, 2, 3);
			if(readByteNum != -1){
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();

	}

}
