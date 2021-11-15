//Internationalization or Localization

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	public static void main(String[] args) {
		
		Locale desi = new Locale("hi"); //creating new Locale for HINDI as it is not present in Locale.(LANGUAGE)
		ResourceBundle msgs = ResourceBundle.getBundle("msgs", desi);
		
		System.out.println(msgs.getString("greeting"));
		System.out.println(msgs.getString("message"));
	}
}
