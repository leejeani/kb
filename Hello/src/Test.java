import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception {
		int a = 10;
		String result;
		
		if(a > 0) {
			result = "정상";
		}else{
			result = "비정상";	
		}
		
		System.out.println(result);
		
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);
		String service = props.getProperty("ServiceNo");
		System.out.println(service);
		int port = Integer.parseInt(service);
	}

}
