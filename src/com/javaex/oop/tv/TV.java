package com.javaex.oop.tv;

public class TV {

	private boolean power;
	private int channel;
	private int volume;
	
	public TV (boolean power,
			int channel, int volume) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
//	
//	public void power(boolean power) {
//		if (power)
//			
//			
//	}
//	public void channel(int channel) {
//		if (1<=channel && channel <=255);
//		
//	}
//	
//	public void volume(int volume) {
//		if(0<=volume && volume<=100);
//	}
//
//		
	}
	public boolean getPower() {
		return power;

	}
	public int getChannel() {
		return channel;
	
	}
	public int getVolume() {
		return volume;
	}
	public void showInfo() {
	System.out.printf("%d,%d,%b",channel,volume,power);
	
	}
}
