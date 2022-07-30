import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( i==n-1 || (j==0 && i>=(n-1)/2)|| ((i-j>=(n-1)/2) || (i+j)>=n/2+(n-1) )) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}


}
