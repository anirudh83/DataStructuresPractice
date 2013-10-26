package com.anirudh.practise.progressions;

/**
 * @author Anirudh
 *
 */
public class ArithmeticProgression extends Progression {
	
	protected long inc;
	
	ArithmeticProgression() {
		this(1);
	}
	
	ArithmeticProgression(long increment){
		inc=increment;
	}
	
	@Override
	protected long nextValue(){
		cur += inc;
		return cur;
	}
	
}
