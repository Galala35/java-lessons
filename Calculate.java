public class Calculate {

	public static void main (String[] arg) {
		System.out.println("Calculate...");
		int first, second, sum;	
		first = Integer.valueOf(arg[0]);
		second = Integer.valueOf(arg[1]);
		sum = first + second;
		System.out.println("Sum="+sum);
}

}