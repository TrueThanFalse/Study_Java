package Day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_Exception05 {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String name;
		try {
			name = br.readLine();
			System.out.println(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
