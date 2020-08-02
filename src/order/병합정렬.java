package order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class �������� {
/**
 * def mergeSort(alist):
    if len(alist) <= 1:
        return alist
    mid = len(alist) // 2
    leftlist = alist[:mid]
    rightlist = alist[mid:]
    L = mergeSort(leftlist)
    R = mergeSort(rightlist)
    i = j = 0
    result = []
    while i < len(L) and j < len(R):
        if L[i] < R[j]:
            result.append(L[i])
            i+=1
        else:
            result.append(R[j])
            j+=1
    result += L[i:]
    result += R[j:]
    return result

 * @param args
 */
	
	/**
	 * �迭�� ����Ʈ�� ��ȯ �Ѵ�.
	 * @param args
	 */
	//������. 1�� �ɋ�����
	//mergeSort
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []arr ={3,4,5,9,6,1,7,8,2,10};
		
		List<Integer> result = mergeSort(Arrays.asList(arr));
		System.out.println(result.toString());
	}
	
	public static List<Integer> mergeSort(List<Integer> arr) {
		System.out.println(arr.toString());
		//�ּ�ġ �Ǵ� �˿�
		if(arr.size()<=1)
			return arr;
		
		//�и�����
		int mid =arr.size()/2;
		List<Integer> left = mergeSort(arr.subList(0, mid));
		List<Integer> right =mergeSort(arr.subList(mid, arr.size()));
		int i =0, j=0;
		List<Integer> result = new ArrayList<Integer>();
		//���� ����
		while(i < left.size() && j < right.size()) {
			if(left.get(i) < right.get(j)) {
				result.add(left.get(i));
				++i;
			}else {
				result.add(right.get(j));
				++j;
			}
		}
		if(i < left.size()) {
			result.addAll(left.subList(i, left.size()));
		}
		if(j < right.size()) {
			result.addAll(right.subList(j, right.size()));
		}
		
		return result;
		
	}

}
