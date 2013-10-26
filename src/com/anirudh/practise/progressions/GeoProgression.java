package com.anirudh.practise.progressions;

/**
 * 
 * @author Anirudh
 *
 */
public class GeoProgression extends Progression{
	
	protected long inc;
	
	public GeoProgression() {
		this(2,1);
	}
	
	public GeoProgression(long first,long inc){
		super.first=first;
		this.inc=inc;
		cur=first;
	}
	
	@Override
	public long nextValue(){
		cur *=inc;
		return cur;
	}

}
