import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytestream {
	public static void main(String[] args) {
	FileInputStream input;
	FileOutputStream output;
	try {
		input=new FileInputStream("C:/Users/juiku/Desktop/jayesh.jpg");
		output=new FileOutputStream("C:/Users/juiku/Desktop/msi.jpg");
		int c;
		while((c=input.read())!=-1)
			output.write(c);
		}
	catch (IOException e) {
		e.printStackTrace();
	}
}	
}