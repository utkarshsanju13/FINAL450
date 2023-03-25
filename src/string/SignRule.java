package string;

public class SignRule {

	public static int signRule(int n) {
			int sum = 0;
			boolean sign = true;
		while(n>=0) {
			int digit = n%10;
			n = n/10;
			if(sign) {
				sum = sum + digit;
			}else{
				sum = sum - digit;
				sign = !sign;
			}
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		int n = 541;
		int result = signRule(n);
		System.out.println(result);
		
	}
}
