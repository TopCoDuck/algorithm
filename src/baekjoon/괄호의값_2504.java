package baekjoon;

import java.util.Stack;

public class ��ȣ�ǰ�_2504 {

	static char  �Ұ�ȣ_����  = '(';
	static char  �Ұ�ȣ_�ݱ�  = ')';
	static char  �߰�ȣ_����  = '[';
	static char  �߰�ȣ_�ݱ�  = ']';
	public static void main(String args[]){
		String testStr = "(()[[]])([])";
		Stack<String> ���� = new Stack<String>();
		int depth = 0;
		int sum = 0;
		
		for(int i=0; i<testStr.length(); i++) {
			char frag = testStr.charAt(i);
			if(frag == �Ұ�ȣ_���� || frag  == �߰�ȣ_����) {
			  ����.push(frag+"");
			  depth = 0;
			}else if(frag == �Ұ�ȣ_�ݱ� || frag == �߰�ȣ_�ݱ�){
				
				String popStr = ����.pop();
				if(popStr == �Ұ�ȣ_����+"" || frag == �Ұ�ȣ_�ݱ�) {
					if(depth == 0){
						
					}else {
						
					}
					depth++;
				}else if(popStr == �߰�ȣ_����+"" || frag == �߰�ȣ_�ݱ�) {
					if(depth == 0){
						
					}else {
						
					}
					depth++;
				}else {
					
				}
				
			}
		}
	}
}
