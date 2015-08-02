import java.util.Scanner;

public class DecimalToBinary {
	static Scanner key=new Scanner(System.in);  
	public static void main(String[] args){
		int num=key.nextInt();
		System.out.println(Integer.toBinaryString(num));
	}
}
