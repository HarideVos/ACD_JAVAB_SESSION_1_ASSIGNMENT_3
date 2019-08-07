
import java.util.Scanner;

public class BitwiseLogical {

	public static void main(String[] args) {
		Byte a, b;
		System.out.println("Enter two numbers either 0 or 1 ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextByte();
		b=sc.nextByte();
		byte Bitwise=(byte)(a & b);
		boolean Logical= (a==0 || b==0) ? false :true; 

		System.out.println("The Value of Bitwise AND of two numbers "+a+" and "+b+" is "+Bitwise);
		System.out.println("The Value of Logical AND of two numbers "+a+" and "+b+" is "+Logical);
		sc.close();
	}

}
