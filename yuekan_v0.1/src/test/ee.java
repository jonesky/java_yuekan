package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.python.core.PyArray;
import org.python.core.PyFunction;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class ee {
	public static void main(String[] args) {
		
		System.out.println("start python");  
        //需传入的参数  
        String a = "还可以，性能好，王者荣耀一点不卡";  
        //设置命令行传入参数  
        String[] arg = new String[] { "python", "G:/Javaweb/web_work/yuekan/src/feedback.py", a};  
        Process pr;
		try {
			pr = Runtime.getRuntime().exec(arg);
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
	}
}
