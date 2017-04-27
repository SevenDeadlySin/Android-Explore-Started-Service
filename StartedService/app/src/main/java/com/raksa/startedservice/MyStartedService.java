package com.raksa.startedservice;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Raksa on 4/22/2017.
 */

public class MyStartedService extends Service {

    private final String TAG = MyStartedService.class.getSimpleName();


    @Override
    public void onCreate() {

        Log.i(TAG,"onCreate , Thread Name : "+Thread.currentThread().getName());
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"onStartCommand , Thread Name : "+Thread.currentThread().getName());
        return START_STICKY;
        //START_STICKY : Restart The Service if its was destroy by memory over usage but with no intent(NULL).
        //START_REDELIVER_INTENT : Restart The Service and with always restart the delivered Intent.
        //START_NOT_STICKY : No Restart and No Intent




    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG,"onBind , Thread Name : "+Thread.currentThread().getName());
        return null;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG,"onDestroy , Thread Name : "+Thread.currentThread().getName());
        super.onDestroy();
    }

}

class MyAsyncTask extends AsyncTask {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Object doInBackground(Object[] params) {
        return null;
    }

    @Override
    protected void onProgressUpdate(Object[] values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
    }
}
