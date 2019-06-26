package com.shinow.device_sn;


import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import android.content.Context;
import com.seuic.misc.Misc;
import android.os.Build;
import android.telephony.TelephonyManager;

import android.provider.Settings;

public class DeviceSnPlugin implements MethodCallHandler {

//    private final Context context;

    /**
     * Plugin registration.
     */
    public static void registerWith(Registrar registrar) {
        final MethodChannel channel = new MethodChannel(registrar.messenger(), "device_sn");
        channel.setMethodCallHandler(new DeviceSnPlugin(/*registrar.context()*/));
    }

//    private DeviceSnPlugin(Context context) {
//        this.context = context;
//    }

    @Override
    public void onMethodCall(MethodCall call, Result result) {
        if (call.method.equals("getPdaSn")) {
            Misc misc = new Misc();
            result.success(misc.getSN());
        } else if (call.method.equals("getCommonSn")) {
            ///System.out.println(Build.SERIAL);
            ///System.out.println(Build.DEVICE);
            ///System.out.println(Build.ID);
            ///String ANDROID_ID = Settings.System.getString(context.getContentResolver(), Settings.System.ANDROID_ID);
            ///System.out.println(ANDROID_ID);
            result.success(Build.SERIAL);
        } else {
            result.notImplemented();
        }
    }
}
