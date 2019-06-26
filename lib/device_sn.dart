import 'dart:async';

import 'package:flutter/services.dart';

class DeviceSn {
  static const MethodChannel _channel = const MethodChannel('device_sn');

  static Future<String> get pdaSn async {
    final String androidSn = await _channel.invokeMethod('getPdaSn');
    return androidSn;
  }
  static Future<String> get commonSn async {
    final String androidSn = await _channel.invokeMethod('getCommonSn');
    return androidSn;
  }
}
