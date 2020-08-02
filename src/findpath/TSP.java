package findpath;

import java.util.ArrayList;
import java.util.Scanner;

public class TSP {
	static int INF =  100001;
	static int[][] map;
	static int V;
	static int BEST;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		V = scan.nextInt();
		BEST = INF;
		//minEdge
		
		boolean[] visited = new boolean[V];
		for(int i=0; i<V; i++) 
			for(int j=0; j<V; j++) {
				map[j][i] = scan.nextInt();
			}
		
		//minEdge
/*		minEdge = new int[V];
 * 		for(int i=0; i<V; i++) { 
			minEdge[i] = INF;
			for(int j=0; j<V; j++) {
				if(i!=j) minEdge[i] = Math.min(minEdge[i], map[i][j]);
			}
		}*/
		//nearst
/*		nerest =new int[V];
		for(int i =0; i < V; ++i) {
			
		}*/
			
		ArrayList<Integer> path = new ArrayList<Integer>();
		search(path,visited,0);
		
	}
	
	public static void search(ArrayList<Integer> path, boolean[] visited,int currentPath) {
		//간단한 가지치기: 지금까지 찾은 가장 좋은 답 이상일 경우 중단
		//if(BEST <= currentPath) return;
		//minEdge
		//if(BEST <= currentLength + simpleHeuristic(visited)) return;
		int pathSize = path.size();
		int here = path.get(pathSize-1);
		
		if(pathSize == V) {
			BEST = Math.min(BEST,currentPath);
			return;
		}
		
		for(int next=0; next < V; ++next) {
			if(visited[next]) continue;
			path.add(next);
			visited[next] = true;
			search(path,visited,currentPath+map[here][next]);
			path.remove(pathSize);
			visited[next] = false;
		}
	}
	//minEdge
	//static int minEdge[];
	
	//minEdge
/*	static int simpleHeuristic(boolean[] visited) {
		int ret = minEdge[0];
		for(int i =0; i < V; ++i)
			if(!visited[i])
				ret += minEdge[i];
		
		return ret;
	}*/
	//static int nerest[];
}
