package network;

import java.util.LinkedList;
import java.util.Queue;

public class NetworkFlow {
	
	public static int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 5;
		int E = 4;
		int src = 0;
		int sink = 4;
		
		int[][] flow = new int[V+1][V+1];
		int[][] capacity = new int[V+1][V+1];
		boolean[][] adj = new boolean[V+1][V+1];
		
		for(int e = 0; e<E; ++e){
			int a = 1;
			int b = 2;
			int c = 3;
			capacity[a][b] = c;
			adj[a][b] = adj[b][a] = true;
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		int ans = 0;
		
		while(true) {
			int[] prev = new int[V+1];
			
			q.clear();
			q.add(src);
			prev[src] = src;
			
			while(!q.isEmpty()) {
				int cur = q.poll();
				
				for(int there = 1; there <=V; ++there) {
					if(!adj[cur][there]) continue;
					if(prev[there] != 0) continue;
					
					if(capacity[cur][there] - flow[cur][there] >0) {
						q.add(there);
						prev[there] = cur;
						if(there == sink) break;
					}
				}
				
				if(prev[sink] == 0) break;
				
				int minFlow = INF;
				for(int v= sink; prev[v] != v; v = prev[v]) {
					minFlow = Math.min(minFlow, capacity[prev[v]][v] - flow[prev[v]][v]);
				}
				
				for(int v = sink; prev[v] !=v; v = prev[v]) {
					flow[prev[v]][v] +=minFlow;
					flow[v][prev[v]] -=minFlow;
				}
				ans += minFlow;
			}
			

		}
		
/*		for() {
			
		}*/
	}

}
