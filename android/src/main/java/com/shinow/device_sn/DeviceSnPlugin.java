package com.shinow.device_sn;


import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import com.seuic.misc.Misc;
import android.os.Build;

public class DeviceSnPlugin implements MethodCallHandler {

    public static void registerWith(Registrar registrar) {
        final MethodChannel channel = new MethodChannel(registrar.messenger(), "device_sn");
        channel.setMethodCallHandler(new DeviceSnPlugin());
    }
    @Override
    @SuppressWarnings("deprecation")
    public void onMethodCall(MethodCall call, Result result) {
        if (call.method.equals("getPdaSn")) {
            Misc misc = new Misc();
            result.success(misc.getSN());
        } else if (call.method.equals("getCommonSn")) {
            result.success(Build.SERIAL);
        } else {
            result.notImplemented();
        }
    }
}
