import java.io.*;

public class TestIOException {
	public static void main(String[] args){
		File file = new File("E:\\Javabymyself\\ibeifeng\\54");
		try{
			file.createNewFile();
			throw new IOException();
		} catch(Exception ex) {
			System.out.println("IO����2");
		}  
		finally {
			System.out.println("�����������ǻ�ִ�е�Ŷ��");
		}
	}
}