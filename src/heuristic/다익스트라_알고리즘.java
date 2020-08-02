package heuristic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class 다익스트라_알고리즘 {

	static final int INF = 5000000;

	public static void main(String[] args) throws IOException {
		//아프리카
		int V;
		int E;
		ArrayList<ArrayList<Integer>> W = new ArrayList();
		int[] dist;
		int startNode;
		
		V = 5;
		E = 6;
		
		dist =new int[V + 1];
		Arrays.fill(dist, INF);
		for(int i=0; i < V +1; i++) {
			W.add(new ArrayList<>());
		}
		
		startNode = 1;
		
		W.get(5).add(1*11+1);
		W.get(1).add(2*11+2);
		W.get(1).add(3*11+3);
		W.get(2).add(3*11+4);
		W.get(2).add(4*11+5);
		W.get(3).add(4*11+6);
		
		dijkstra(startNode,V,W,dist);
		
        for (int i = 1; i < V + 1; i++) {
        	System.out.print(dist[i] < INF ? dist[i] + "\n" : "INF\n");
        }
        
	}
	
	static void dijkstra(int src, int V, ArrayList<ArrayList<Integer>> W, int[] dist) {
		PriorityQueue<Element> pq = new PriorityQueue<>();
		dist[src] = 0;
		pq.add(new Element(src,dist[src]));
		
		while(!pq.isEmpty()) {
			int cost = pq.peek().dist;
			int here = pq.peek().node;
			
			pq.poll();
			
			if(dist[here] < cost) continue;
			
			for(int x:W.get(here)) {
				int adjNode = x/11;
				int weight = x%11;
				
				if(dist[adjNode]> dist[here]+weight) {
					dist[adjNode] = dist[here]+weight;
					pq.add(new Element(adjNode, dist[adjNode]));
				}
			}
		
		}
	}
	
	
	static class Element implements Comparable<Element> {

	    int node;
	    int dist;

	    Element(int node, int dist) {

	        this.node = node;
	        this.dist = dist;
	    }

	    @Override
	    public int compareTo(Element o) {

	        return this.dist < o.dist ? -1 : 1;
	    }
	}

}
