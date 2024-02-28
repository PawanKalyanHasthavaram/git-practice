import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
		Scanner scan=new Scanner();
		int n=scan.nextInt();
		System.out.println((n%2==0)?(n+" is an even number):(n+" is an odd number"));
	}
}