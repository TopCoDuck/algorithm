package etc;

public class RMQ {
	//배열의 길이
	int n;
	
	int[] rangeMin;
	RMQ(int[] array){
		n = array.length;
		//rangeMin.resize()
		rangeMin = new int[4*n];
		init(array,0,n-1,1);
	}
	
	int init(int[] array, int left, int right,int node) {
		if(left == right)
			return rangeMin[node]  = array[left];
		int mid = (left+right) /2;
		int leftMin = init(array,left,mid, node *2);
		int rightMin = init(array,mid+1,right, node *2+1);
		
		return rangeMin[node] = Math.min(leftMin,rightMin);
	}
	
}
