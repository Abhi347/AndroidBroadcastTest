package in.noobgames.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BatteryReceiver extends BroadcastReceiver {
    public BatteryReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equalsIgnoreCase("android.intent.action.ACTION_POWER_CONNECTED"))
            Toast.makeText(context, "Power Connected", Toast.LENGTH_LONG).show();
        else if (intent.getAction().equalsIgnoreCase("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            Toast.makeText(context, "Power Disconnected", Toast.LENGTH_LONG).show();
        }
    }
}