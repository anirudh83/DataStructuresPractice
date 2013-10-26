package com.anirudh.practise.progressions;

/**
 * 
 * @author Anirudh
 *
 */
public class FibonacciProgression extends Progression{
	
	protected long prev;
	
	public FibonacciProgression() {
		this(0,1);
	}
	
	public FibonacciProgression(long first,long second){
		super.first=first;
		prev = second - first;
		
	}
	
	@Override
	public long nextValue(){
		long temp = prev;
		prev=cur;
		cur = cur+temp;
		return cur;
	}
	

}
