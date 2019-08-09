package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {

			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			int a = Integer.parseInt(tokens[0]);
			char c=tokens[1].charAt(0);
			int b = Integer.parseInt(tokens[2]);
			switch(c){
			case '+':
				Add add =new Add();
				add.setValue(a, b);
				System.out.println(">> "+add.calculate());
				break;
			case '-':
				Sub sub =new Sub();
				sub.setValue(a, b);
				System.out.println(">> "+sub.calculate());
				break;
			case '*':
				Mul mul =new Mul();
				mul.setValue(a, b);
				System.out.println(">> "+mul.calculate());
				break;
			case '/':
				Div div =new Div();
				div.setValue(a, b);
				System.out.println(">> "+div.calculate());
				break;
			default:
				System.out.println("잘못된 사칙연산 입니다");
			}
		}
		
		scanner.close();

	}

}
