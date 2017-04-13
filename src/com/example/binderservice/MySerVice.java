package com.example.binderservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MySerVice extends Service{
    
	MyBinder myBinder;
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		
		return myBinder;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		myBinder=new MyBinder(getApplicationContext());
	}
	

}
