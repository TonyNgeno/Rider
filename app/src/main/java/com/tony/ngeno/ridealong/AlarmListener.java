package com.tony.ngeno.ridealong;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmListener extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        System.out.println("I m in the Alarm Listener calls");
        System.out.println("This is the context: " + context);
        Intent intent2 = new Intent(context, CarpoolActivity.class);
    }
}
