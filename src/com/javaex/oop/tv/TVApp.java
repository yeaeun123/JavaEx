package com.javaex.oop.tv;

public class TVApp {

	public static void main(String[] args) {
		
		
		TV tv = new TV( 7, 20, false);
		
		tv.status(); //꺼져있음
		
		tv.power( true );	//전원켜기
		tv.volume( 120 );	//음량범위x
		tv.status();
		
		tv.volume( false );	//채널범위x
		tv.status();
		
		tv.channel( 0 );	
		tv.status();
		
		tv.channel( true );	//channe+1
		tv.channel( true );	
		tv.channel( true );
		tv.status();
		
		tv.power( false );	//끄기
		tv.status();

		
		}
	}


