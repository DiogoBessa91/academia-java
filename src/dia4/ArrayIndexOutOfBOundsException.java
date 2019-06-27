package dia4;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexOutOfBOundsException {

	public static void main(String[] args) {

		List<String> meuArray = new ArrayList<String>();
		meuArray.add("Valor 001");
		meuArray.add("Valor 002");
		meuArray.add("Valor 003");
		meuArray.add("Valor 004");
		meuArray.add("Valor 005");

		meuArray.get(-1);

		List<String> meuArray1 = new ArrayList<String>();
		meuArray1.add("Valor 001");
		meuArray1.add("Valor 002");
		meuArray1.add("Valor 003");
		meuArray1.add("Valor 004");
		meuArray1.add("Valor 005");

		meuArray1.get(6);
	}

}
