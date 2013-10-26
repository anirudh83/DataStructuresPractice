package com.anirudh.practise.progressions;

/**
 * 
 * @author Anirudh
 *
 */
public class Progression {
	
	protected long first;
	protected long cur;
    
	public Progression() {
		first=cur=0;
    }
	
	/*
	 * Resetting the progression
	 */
	protected long firstValue(){
		cur=first;
		return cur;
	}
	
	protected long nextValue(){
		return ++cur;
	}
	
	public void printProgression(int n){
		System.out.println(firstValue());
	    for(int i=2;i<n;i++){
	    	System.out.println(nextValue());
	    	System.out.println();
	    }
	}
}
