package com.variable.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.log.Logger;
import com.variable.network.Object.NetworkStatus;

import org.greenrobot.eventbus.EventBus;


/**
 * 20150728[Star] created.
 *
 * 監視網路連線狀況，若斷線或重新連線 NetworkInfo info =NetworkInfo: type: WIFI[], state:
 * CONNECTED/CONNECTED, reason: (unspecified), extra: "CB13015Air2",
 * roaming: false, failover: false, isAvailable: true,
 * isConnectedToProvisioningNetwork: false
 */
public class CustomNetworkBroadcastReceiver extends BroadcastReceiver{
    private final String TAG = CustomNetworkBroadcastReceiver.class.getSimpleName();
    private final boolean DEBUG = false;

    @Override
    public void onReceive(Context context, Intent intent) {
        Logger.d("onReceive");
        if (intent.getAction().equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
            NetworkInfo info = intent.getParcelableExtra(ConnectivityManager.EXTRA_NETWORK_INFO);

            Logger.d("NetworkInfo info=" + info);

            if(info.isAvailable() && info.isConnected()){
                EventBus.getDefault().post(new NetworkStatus(context, NetworkStatus.IS_OK));
            }else {
                if(false==info.isConnected()){
                    EventBus.getDefault().post(new NetworkStatus(context, NetworkStatus.NOT_CONNECTED));
                }else if(false==info.isAvailable()){
                    EventBus.getDefault().post(new NetworkStatus(context, NetworkStatus.NOT_AVAILABLE));
                }else{
                    EventBus.getDefault().post(new NetworkStatus(context, NetworkStatus.NOT_CONNECTED));
                }
            }
        }
    }
}
