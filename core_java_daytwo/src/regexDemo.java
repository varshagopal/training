
public class regexDemo {

	public static void main(String[] args) {
		String name = "Zubair";
		String regexName = "[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(regexName));
		
		String mobile = "9011962921";
		String regexMobile = "[7-9][0-9]{9}";
		System.out.println(mobile.matches(regexMobile));
		
		String email = "varsha34@gmail.com";
		String regexEmail  = "[a-zA-Z0-9+_.]+@+[a-z0-9.]+[a-z]{2,}$";
		System.out.println(email.matches(regexEmail));

	}

}
