package baekjoon;
/**
 * �ִ� �����
 * @author us
 *
 */
public class ��Ŭ���_�˰��� {

	public static void main(String[] args) {
		System.out.println(gcd(6,15));
		
		
	}
	
	 static int gcd(int p, int q) {
		if(q == 0) return p;
		return gcd(q, p % q);
	}

}
