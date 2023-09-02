package lecture9;

public class Exercise4 {
	public static void main(String[] args) {
		Exercise4 ex4 = new Exercise4();
		ex4.caculator(0, 4);
	}

	public void caculator(int a, int b) {
		try {
			System.out.println(a / b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
