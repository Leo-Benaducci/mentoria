package br.com.soften;

public class Main1 {
	public static void main(String[] args) {
		// variaveis
		short s = 50;
		int i = 0;
		long l = 50L;
		float f = 50.5f;
		double d = 50.5;
		char c = 'a';
		boolean b = true;

		String str = "Hello World";
		i = -20;

		//estrutura decisao
		if(i > 10) {
			System.out.println("i > 10");
		} else {
			System.out.println("i <= 10");
		}

		if(l > 10) {
			System.out.println("l > 10");
		}

		if(f > 10) {
			System.out.println("f > 10");
		} else if(f > 5) {
			System.out.println("f > 5");
		} else {
			System.out.println("f <= 5");
		}

		switch(c) {
			case 'a' -> System.out.println("a");
			case 'b' -> System.out.println("b");
			case 'c' -> System.out.println("c");
			default -> System.out.println("default");
		}

		// estrutura repetitiva

		for(int j = 0; j < 10; j++) {
			System.out.println(j);
		}

		while(b) {
			System.out.println(i);
			i++;
			if(i > 10) {
				b = false;
			}
		}

		do {
			System.out.println(i);
			i++;
			if(i > 10) {
				b = false;
			}
		} while(b);
	}
}
