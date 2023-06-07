package pack;

import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		Excel e=new Excel();
		String username=e.readData(0,0);
		System.out.println("Username is:"+username);
		String password=e.readData(0,1);
		System.out.println("Password is:"+password);
	}

}