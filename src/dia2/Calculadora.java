package dia2;

public class Calculadora {

	public static void main(String[] args) {
		
		//aritmeticos
		int result = 1+2;
		System.out.println(result);
		
		result = result - 1;
		System.out.println(result);
		
		
		result = result * 2;
		System.out.println(result);
		
		
		result = result / 2;
		System.out.println(result);
		
		
		result = result + 8;
		System.out.println(result);
		
		
		result = result % 7;
		System.out.println(result);
		
		//unários
		int result2 = +1;
		System.out.println(result2);
		
		result2--;
		System.out.println(result2);
		
		
		result2++;
		System.out.println(result2);
		
		
		result2 = -result2;
		System.out.println(result2);
		boolean success = false;
		
		System.out.println(success);
		System.out.println(!success);
		
		//Relacionais ou de Igualdade 
		int value1 =1;
		int value2 =2;
		
		if (value1 == value2)
			System.out.println(false);
		
		if (value1 != value2)
			System.out.println(true);
		
		if (value1 > value2)
			System.out.println(false);
		
		if (value1 < value2)
			System.out.println(true);
		
		if (value1 <= value2)
			System.out.println(true);
		
		
	}

	public interface Interface{
		
	}
	
	public class Pai{
		
	}
	
	public class Filho extends Pai implements Interface{
		
	}
	
	public class Comparacao{
		
		public void main(String[] agrs) {
			
			Pai obj1= new Pai();
			Filho obj2 = new Filho();
			
			System.out.println("obj1 instanceof Pai: " + (obj1 instanceof Pai));
			System.out.println("obj1 instanceof Filho: " + (obj1 instanceof Filho));
			System.out.println("obj1 instanceof Interface: " + (obj1 instanceof Interface));
			System.out.println("obj2 instanceof Pai: " + (obj2 instanceof Pai));
			System.out.println("obj2 instanceof Pai: " + (obj2 instanceof Pai));
			System.out.println("obj2 instanceof Pai: " + (obj2 instanceof Pai));
		}
	}
}
