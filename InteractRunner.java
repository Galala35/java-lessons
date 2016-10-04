
import java.util.Scanner;

/*
 * �������.
1. ��������� ����� �����������. ������� ��������� ������.
2. �������� ����������� ��������� ��������� InteractRunner.
 */

/*
 * ��� ��������� ������ � �������� �������� Signle responsibility, Open/Close principle
 */

public class InteractRunner{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			
			//���� �������� �� ��� ��� ���� ���� ������ ��
			while (!exit.equals("yes") | !exit.equals("y")){
				System.out.print("First value: ");
				String first = scan.next();
				System.out.print("Second value: ");
				String second = scan.next();
				
				//��������
				calc.add(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Add Result: " + calc.getResult());
				
				//���������
				calc.substract(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Substract Result: " + calc.getResult());
				
				//�������
				calc.div(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Div Result: " + calc.getResult());
				
				//���������
				calc.multiply(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Multiply Result: " + calc.getResult());
				
				//�������
				calc.clearResult();
				
				//����� ��/���
				System.out.print("Do you want to exit? yes/no: ");
				exit = scan.next();
			}
		}finally{
			scan.close(); //���� �� �� ������� ���������� ������
		}
	}
	
}