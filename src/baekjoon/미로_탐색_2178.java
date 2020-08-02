package baekjoon;

public class 미로_탐색_2178 {

	//탐색 완료 여부
	static int[][] map = {{1,0,1,1,1,1},
		           {1,0,1,0,1,0},
		           {1,0,1,0,1,1},
		           {1,1,1,0,1,1}};

	static boolean[][] vistied = new boolean[4][6];

	static int[][] directs = {{0,1},
			            {1,0},
			            {0,-1},
			            {-1,0}};
	
	static int 최소경로 = Integer.MAX_VALUE;
	
	
	public static void main(String[] args) {
		찿기(0,0,1);
	}
	
	public static int 찿기(int x, int y,int 칸수) {
		
		vistied[x][y] = true;
		if(x==3 && y == 5) {
			return 칸수;
		} 
		
		for(int[] direct :directs) {
			int tx =  x + direct[0];
		    int ty =  y + direct[1];
			
			if(tx>=0 && ty>=0 && tx<4 && ty< 6
					&& map[tx][ty] ==1 && vistied[tx][ty] == false) {
				최소경로 = Math.min(최소경로,찿기(tx,ty,칸수+1));
				vistied[tx][ty] = false;
			}
		}
		return 최소경로;

	}

}
