import java.util.Scanner;

public class BinaryToDecimal2 {
	static Scanner key=new Scanner(System.in);  
	public static void main(String[] args){
		int num=key.nextInt();key.nextLine();
		tenToTwo(num);
	}
	public static void tenToTwo(int num){
		if(num<2)
			System.out.print(num);
		else{
			tenToTwo(num/2);
			System.out.print(num%2);
		}
	}
}
