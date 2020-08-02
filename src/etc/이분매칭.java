package etc;

public class 이분매칭 {
	//A와 B의 정정의 개수
	static int n, m;
	//연결 되어있는가?
	static boolean adj[][];
	static int [] aMatch,bMatch;
	static boolean [] visited;
	
	static boolean dfs(int a) {
		if(visited[a]) return false;
		visited[a] = true;
		for(int b = 0; b < m; ++b) {
			if(adj[a][b]) {
				if(bMatch[b] == -1 || dfs(bMatch[b])){
					aMatch[a] = b;
					bMatch[b] = a;
					return true;
				}
			}
			
		}
		return false;
	}
	
	static int  bipartiteMacth() {
		aMatch = new int[n];
		bMatch = new int[m];
		int size = 0;
		for(int start = 0; start < n; ++start) {
			visited = new boolean[n];
			if(dfs(start))
				++size;
		}
		return size;
	}
	public static void main(String[] args) {
		bipartiteMacth();
	}

}
