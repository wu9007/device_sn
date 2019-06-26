import 'package:flutter/material.dart';
import 'dart:async';

import 'package:device_sn/device_sn.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String _sn = 'Unknown';

  @override
  void initState() {
    super.initState();
    initSnState();
  }

  Future<void> initSnState() async {
    String sn;
    try {
      sn = await DeviceSn.pdaSn;
    } on Exception {
      sn = await DeviceSn.commonSn;
    }

    if (!mounted) return;

    setState(() {
      _sn = sn;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Center(
          child: Text('_commonSn: $_sn\n'),
        ),
      ),
    );
  }
}
