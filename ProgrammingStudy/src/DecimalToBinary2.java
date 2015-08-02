import java.util.Scanner;

public class DecimalToBinary2 {
	static Scanner key=new Scanner(System.in);  
	public static void main(String[] args){
		int num=key.nextInt();key.nextLine();
		decimalToBinary(num);
	}
	public static void decimalToBinary(int num){
		if(num<2)
			System.out.print(num);
		else{
			decimalToBinary(num/2);
			System.out.print(num%2);
		}
	}
}
