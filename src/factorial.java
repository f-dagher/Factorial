import java.util.*;

public class factorial {

	public static void main(String[] args) {
	
		System.out.println("Enter a number for facotorial");
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		System.out.println(iterativeFact(in));
	
	}
	
	public static int fact(int num) {
		
		if(num == 1)
			return 1;
		else
			return fact(num -1) * num;
	}
	
	public static int iterativeFact(int num) {
		int result = num;
		
		while(num != 1)
		{
			result = result * (num -1);
			num = num - 1;
		}
		
		
		return result;
	}

}
