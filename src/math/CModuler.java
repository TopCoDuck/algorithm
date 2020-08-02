package math;

public class CModuler {
	
	static int MOD = 10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10001, b  = 10002;
		//µ¡¼À
		System.out.println((a%MOD+b%MOD)%MOD);
		//»¬¼À
		System.out.println((a%MOD-b%MOD+MOD)%MOD);
		//°ö¼À
		System.out.println((a%MOD)*(b%MOD)%MOD);
		//³ª´°¼À
	}
	
	int modInv(int  a, int M) {
	  if (M == 1)
	    return a;
	  if (M == 0)
	    return 1;

	  int  tmp = modInv(a, M / 2);

	  if (M % 2==0)
	    return (int)(((tmp*tmp) % MOD)*a) % MOD;
	  else
	    return (int)(tmp*tmp) % MOD;

	}
}
