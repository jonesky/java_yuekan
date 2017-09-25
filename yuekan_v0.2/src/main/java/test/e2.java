package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2 {
	public static void main(String[] args1) {
		System.out.println("start python");  
        //需传入的参数  
        String a = "aaa", b = "bbb", c = "ccc", d = "ddd";  
        //设置命令行传入参数  
        String[] args = new String[] { "python", "C:\\Users\\Desktop\\text.py", a, b, c, d };  
        Process pr;
		try {
			pr = Runtime.getRuntime().exec(args);
			BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));  
	        String line;  

	        while ((line = in.readLine()) != null) {  
//	            line = decodeUnicode(line);  
	            System.out.println(line);  
	        }  
	        in.close();  
	        pr.waitFor();  
	        System.out.println("end"); 
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        //TODO:该方法只能传递字符串  
//        Process pr = Runtime.getRuntime().exec("python C:\\Users\\Desktop\\test1.py C:\\Users\\hpp\\Desktop\\test1.mp4");  

         
		
	}
}
