package baekjoon;
/**
 * 최대 공약수
 * @author us
 *
 */
public class 유클라드_알고리즘 {

	public static void main(String[] args) {
		System.out.println(gcd(6,15));
		
		
	}
	
	 static int gcd(int p, int q) {
		if(q == 0) return p;
		return gcd(q, p % q);
	}

}
