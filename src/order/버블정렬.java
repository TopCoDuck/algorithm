package order;

public class 버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr ={3,4,5,9,6,1,7,8,2,10};
		//n*n
		for(int i=arr.length-1; i>0; i-- )
		  for(int j=0;  j<i; j++) {
			    if (arr[j] >= arr[j+1]) {
			      int tmp = arr[j+1];
			      arr[j+1] = arr[j];
			      arr[j] = tmp;
			    }
		  }
		for(int a:arr) {
			System.out.println(a);
		}
	}
/*	선택정렬
 * def selectionSort(alist):
	    for offset in range(0,len(alist)-1):
	        offset_minValue = offset
	        for num in range(offset+1, len(alist)):
	            if alist[num] < alist[offset_minValue]:
	                offset_minValue = num
	        tmp = alist[offset_minValue]
	        alist[offset_minValue] = alist[offset]
	        alist[offset] = tmp
	    return alist*/
/*	삽입정렬
 *  def insertionSort(alist):
	    for index in range(1,len(alist)):
	        currentvalue = alist[index]
	        position = index
	        while position>0 and alist[position-1]>currentvalue:
	            alist[position]=alist[position-1]
	            position = position-1
	    alist[position]=currentvalue
	    return alist*/


}
