import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter The Number: ");
		int n = scan.nextInt();
		scan.close();
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(+i +" Is Even Number" );
			}
			else
				System.out.println(+i +" Is an Odd Number");
			
		}

	}

}
