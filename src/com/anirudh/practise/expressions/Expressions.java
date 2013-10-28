/**
 * 
 */
package com.anirudh.practise.expressions;

import java.util.Stack;


/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 */
public class Expressions {
	
	public void evaluatePostFix(String exp){
		Stack numStack = new Stack();
		
		for(int i=0;i<exp.length();i++){
			char c = exp.charAt(i);
			if(Character.isDigit(c)){
				numStack.push(new Integer(Character.digit(c,36)));
			}else if((c=='+')||(c=='-')||(c=='*')||(c=='/')){
				Integer operand1 = (Integer) numStack.pop();
				Integer operand2= (Integer)numStack.pop();
				numStack.push(operand1);
			}
			
		}
		
		
		
	}

}
