package Data_treatement;

import java.io.*;

public class Main {

 public static void collectData () throws IOException {
	 try {
		 Runtime r = Runtime.getRuntime();
		 Process p = r.exec("python /Main.py");
		 BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		 p.waitFor();
		 String line =" ";
		 while (br.ready()) {
			 System.out.println(br.readLine());
		 }
	 } 
	 
	 catch (Exception e )
	 {
		 String cause = e.getMessage();
		 System.out.println(cause);
	 }
 }
}
