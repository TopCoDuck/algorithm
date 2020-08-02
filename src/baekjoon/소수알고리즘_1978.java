package math;

import java.util.Scanner;

public class 소수알고리즘_1978 {
	 
	public static void main(String args[]){
		boolean[] isPrimer = new boolean[101];
		//초기화
		for(int i=2; i<=100; i++) {isPrimer[i] = true;}
		//에라토스테네스의 체
		for(int i=2; (i*i)<=100; i++) {
			if(isPrimer[i]) {
				for(int j= i*i;  j <=100; j+=i) {isPrimer[j] = false;}
			}
		}
		//실질수 입력 받기
		Scanner sc = new Scanner(System.in);
		int primerCnt = 0;
		int size = sc.nextInt();
		for(int i=0; i<size; i++) {
			int val = sc.nextInt();
			if(isPrimer[val]) {
				primerCnt++;
			}
		}
		System.out.println(primerCnt);
	}
}
