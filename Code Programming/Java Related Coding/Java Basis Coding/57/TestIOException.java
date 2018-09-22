import java.io.*;

public class TestIOException {
	public static void main(String[] args){
		File file = new File("E:\\Javabymyself\\ibeifeng\\54");
		try{
			file.createNewFile();
			throw new Exception();
		} catch(IOException ex) {
			System.out.println("IO´íÎó");
		} finally {
			System.out.println("finally");
		}	
	}
}