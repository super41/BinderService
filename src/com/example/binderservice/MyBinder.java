package com.example.binderservice;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

public class MyBinder extends Binder implements MusicInterface{
       
	
	MediaPlayer mediaPlayer;
	Context context;
	

	public MyBinder(Context context){
		this.context=context;
	    mediaPlayer=MediaPlayer.create(context,R.raw.fly);
	}
	
	@Override
	protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
		// TODO Auto-generated method stub
		switch(code){
		case 0:
			reply.writeString("playingS");
			Log.i("go", data.readString()+"11"); 
			play();
			break;
		case 1:
			reply.writeString("stopS");
			stop();
			break;
		}
		return true;
		//return true;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
	  mediaPlayer.start();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		mediaPlayer.stop();
	}


	

}
