package math;

import java.util.Scanner;

public class ���ǿ�_��ȸ_2098 {
	// 2< N < 16
	// 1,000,000 ����
	//���� ���� ��� 0
	//i-> j, j-> i ��� �ٸ�
	static int NO_RICH =  100001;
	static int[][] map;
	static int V;
	static int S;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		V = scan.nextInt();
		map = new int[V][V];
		
		for(int i=0; i<V; i++) {
		   	//����,int i,new boolean[V];
			S = i;
		   	searching(i,0,new boolean[V]);
		}		
	}
	
	//��ȯ����  ��ΰ� �湮. ���� ��ȯ
	//�湮�� �� ���� ����
	public static int searching(int t, int length, boolean[] visited) {
		
		

	 	visited[t]= true;
	 	
		int visitCnt =0;
		boolean search = false;
	 	for(int i=0;  i<visited.length; i++) {
	 		if(visited[i] == false) {
	 			if(map[t][i] != 0) {
	 				search = true;
//	 				searching(i,length,);
	 			}
	 		}else {
	 			visitCnt++;
	 		}
	 	}
	 	
	 	if(visitCnt== V) {
	 		if(map[S][t]==0) {
	 			
	 		}else {
	 			return NO_RICH;
	 		}
	 	}else {
	 		return NO_RICH;
	 	}
/*		if(visited[]) {
			
		}*/
		
		
		return 0;
	}

}
