import java.util.Scanner;
public class Demo {
	static int add(int x, int y){
		int c = 0 ;
		while(y!=0){
			c = x & y;
			x = x ^ y;
			y = c << 1;
			
		}
		return x;
			
	}
	public static void main(String args[]){
		int a=0;
		int b=0;
		
		Scanner enter = new Scanner(System.in);
		System.out.println("Enter the First No:");
		a = enter.nextInt();
		System.out.println("Enter the Second No:");
		b = enter.nextInt();
		System.out.println("The sum =" + add(a,b));
		
	}

}
