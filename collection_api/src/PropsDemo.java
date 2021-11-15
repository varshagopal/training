import java.io.FileReader;
import java.util.Properties;

public class PropsDemo {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("src/about.txt");
		
		Properties p = new Properties();
		p.load(reader);
		
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("Age"));
		System.out.println(p.getProperty("City"));
	}
}
