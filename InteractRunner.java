
import java.util.Scanner;

/*
 * Задание.
1. Поправить класс Калькулятор. сделать отдельный методы.
2. Добавить возможность запускать программу InteractRunner.
 */

/*
 * Все изменения делать с условием принципа Signle responsibility, Open/Close principle
 */

public class InteractRunner{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			
			//цикл работает до тех пор пока юзер нажмет да
			while (!exit.equals("yes") | !exit.equals("y")){
				System.out.print("First value: ");
				String first = scan.next();
				System.out.print("Second value: ");
				String second = scan.next();
				
				//сложение
				calc.add(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Add Result: " + calc.getResult());
				
				//вычитание
				calc.substract(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Substract Result: " + calc.getResult());
				
				//деление
				calc.div(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Div Result: " + calc.getResult());
				
				//умножение
				calc.multiply(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Multiply Result: " + calc.getResult());
				
				//очистка
				calc.clearResult();
				
				//выход Да/Нет
				System.out.print("Do you want to exit? yes/no: ");
				exit = scan.next();
			}
		}finally{
			scan.close(); //если да то консоль прекращает работу
		}
	}
	
}