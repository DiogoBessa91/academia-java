package dia2;

public class PrimeiraClasse {

	public static void main(String[] args) {

		long x = 10000;
		int i = (int) x;

		System.out.println(i);
		System.out.println(" ");

		System.out.println("Nossa primiera classe");
		System.out.println(" ");

		Boolean boolean1 = new Boolean(true);

		System.out.println(boolean1);
		System.out.println(" ");

		int a = 10;
		Integer m = Integer.valueOf(a);// converter int para Integer
		Integer j = a;// autoboxing

		System.out.println(a + " " + m + " " + j);
		System.out.println(" ");

		Integer b = new Integer(5);
		int d = b.intValue();// converter integer para int
		int k = b;// unboxing

		System.out.println(b + " " + d + " " + k);
		System.out.println(" ");

		// converter int primitivo para Integer objeto
		int num = 20;
		Integer obj = Integer.valueOf(num);

		System.out.println(num + " " + obj);
		System.out.println(" ");

		// criar objeto classe wrapper
		Integer obj1 = new Integer(50);
		// converter objeto wrapper para primitivo
		int num1 = obj1.intValue();
		System.out.println(num1 + " " + obj1);

	}

};
