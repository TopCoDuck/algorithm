package spanning.tree;

import java.util.Arrays;

public class Å©·ç½ºÄ®_ÃÖ¼Ò_½ºÆÐ´×_Æ®¸® {
	
	class Edge implements Comparable<Edge>{
		
		int src, dest, weight;
		
		@Override
		public int compareTo(Edge compareEdge) {
			// TODO Auto-generated method stub
			return this.weight - compareEdge.weight;
		}
		
	}
	
	class Subset{
		int parent ,rank;
	}
	
	
	int V, E;
	Edge edge[];
	
	Å©·ç½ºÄ®_ÃÖ¼Ò_½ºÆÐ´×_Æ®¸®(int v, int e) {
		V = v;
		E = e;
		edge = new Edge[E];
		for(int i=0; i<e; ++i) {
			edge[i] = new Edge();
		}
	}
	
	int find(Subset subsets[], int i) {
		if(subsets[i].parent != i) {
			subsets[i].parent = find(subsets, subsets[i].parent);
		}
		return subsets[i].parent;
	}
	
	void union(Subset subsets[],int x, int y) {
		int xroot = find(subsets, x);
		int yroot = find(subsets, y);
		
		if(subsets[xroot].rank < subsets[yroot].rank) {
			subsets[xroot].parent = yroot;
		}else if(subsets[xroot].rank > subsets[yroot].rank) {
			subsets[yroot].parent = xroot;
		}else {
			subsets[yroot].parent = xroot;
			subsets[xroot].rank++;
		}
		
	}
	void kruskalMST() {
		Edge result[] = new Edge[V];
		int e = 0;
		int i = 0;
		for(int j=0;j<V; ++j) {
			result[j] = new Edge();
		}
		
		Arrays.sort(edge);
		
		Subset subsets[] = new Subset[V];
		
		for(int j=0; j<V; ++j) {
			subsets[i] = new Subset();
		}
		for(int v=0; v<V; ++v) {
			subsets[v].parent = v;
			subsets[v].rank = 0;
		}
		while(e <V-1) {
			Edge next_edge = new Edge();
			next_edge = edge[i++];
			int x = find(subsets,next_edge.src);
			int y = find(subsets,next_edge.dest);
			
			if(i != y) {
				result[e++] = next_edge;
				union(subsets,x,y);
			}
		}
	}
	
	public static void main(String[] args) {
		int V = 4;
		int E = 5;
		Å©·ç½ºÄ®_ÃÖ¼Ò_½ºÆÐ´×_Æ®¸® graph = new Å©·ç½ºÄ®_ÃÖ¼Ò_½ºÆÐ´×_Æ®¸®(V,E);
		// °ª ÀÔ·ÂÇÏ±â
		graph.kruskalMST();
		
	}
}
