package com.info.observer;

public class User implements Observer{
	
	@Override
	public void notifyUser(String msg, String userName) {
		// TODO Auto-generated method stub
		System.out.println("******"+msg+" "+userName+" **********");
	}

}
