package math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 줄_세우기_2252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int memberCnt = 3;
		int[][] line = new int[2][2];
		line[0] = new int[]{1,3};
		line[1] = new int[]{2,3};
		boolean[] subNode = new boolean[memberCnt];
		
		ArrayList<ArrayList<Integer>> adj
		 = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<memberCnt; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		for(int i=0;  i<line.length; i++) {
			adj.get(line[i][0]).add(line[i][1]);
			subNode[line[i][0]] = true;
		}
		
		Queue<Integer> q = new LinkedList<>();
		
		//Default로 
		while(!q.isEmpty()) {
			
		}
		
	}

}
