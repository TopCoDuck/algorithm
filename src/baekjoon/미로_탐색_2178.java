package baekjoon;

public class �̷�_Ž��_2178 {

	//Ž�� �Ϸ� ����
	static int[][] map = {{1,0,1,1,1,1},
		           {1,0,1,0,1,0},
		           {1,0,1,0,1,1},
		           {1,1,1,0,1,1}};

	static boolean[][] vistied = new boolean[4][6];

	static int[][] directs = {{0,1},
			            {1,0},
			            {0,-1},
			            {-1,0}};
	
	static int �ּҰ�� = Integer.MAX_VALUE;
	
	
	public static void main(String[] args) {
		�O��(0,0,1);
	}
	
	public static int �O��(int x, int y,int ĭ��) {
		
		vistied[x][y] = true;
		if(x==3 && y == 5) {
			return ĭ��;
		} 
		
		for(int[] direct :directs) {
			int tx =  x + direct[0];
		    int ty =  y + direct[1];
			
			if(tx>=0 && ty>=0 && tx<4 && ty< 6
					&& map[tx][ty] ==1 && vistied[tx][ty] == false) {
				�ּҰ�� = Math.min(�ּҰ��,�O��(tx,ty,ĭ��+1));
				vistied[tx][ty] = false;
			}
		}
		return �ּҰ��;

	}

}
