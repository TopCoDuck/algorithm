package baekjoon;

import java.util.Stack;

public class °ıÈ£ÀÇ°ª_2504 {

	static char  ¼Ò°ıÈ£_¿­±â  = '(';
	static char  ¼Ò°ıÈ£_´İ±â  = ')';
	static char  Áß°ıÈ£_¿­±â  = '[';
	static char  Áß°ıÈ£_´İ±â  = ']';
	public static void main(String args[]){
		String testStr = "(()[[]])([])";
		Stack<String> ½ºÅÃ = new Stack<String>();
		int depth = 0;
		int sum = 0;
		
		for(int i=0; i<testStr.length(); i++) {
			char frag = testStr.charAt(i);
			if(frag == ¼Ò°ıÈ£_¿­±â || frag  == Áß°ıÈ£_¿­±â) {
			  ½ºÅÃ.push(frag+"");
			  depth = 0;
			}else if(frag == ¼Ò°ıÈ£_´İ±â || frag == Áß°ıÈ£_´İ±â){
				
				String popStr = ½ºÅÃ.pop();
				if(popStr == ¼Ò°ıÈ£_¿­±â+"" || frag == ¼Ò°ıÈ£_´İ±â) {
					if(depth == 0){
						
					}else {
						
					}
					depth++;
				}else if(popStr == Áß°ıÈ£_¿­±â+"" || frag == Áß°ıÈ£_´İ±â) {
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
