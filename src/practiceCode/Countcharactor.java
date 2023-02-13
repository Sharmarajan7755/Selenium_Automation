package practiceCode;


public class Countcharactor {

	public static void main(String[] args) {
		
		String s ="Rajan" ;
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) +"=" + count++);
		}

	}

}
