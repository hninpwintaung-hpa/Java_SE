package lecture9;

public class Exercise3 {
	public static void main(String[] args) {
       Exercise3 ex3= new Exercise3();
       ex3.stringToIntegerConverter("4");
	}

	public void stringToIntegerConverter(String a) {
		try {
			int result = Integer.parseInt(a);
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
