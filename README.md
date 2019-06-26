# device_sn

[![License][license-image]][license-url] 
[![Pub](https://img.shields.io/pub/v/device_sn.svg?style=flat-square)](https://pub.dartlang.org/packages/device_sn)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/2564729935f441b4987fd4f49ac988d8)](https://www.codacy.com/app/leyan95/device_sn?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=leyan95/device_sn&amp;utm_campaign=Badge_Grade)

A Flutter plugin 🛠 to get device SN. Ready for Android 🚀

[github](https://github.com/leyan95/device_sn)

## Installation

Add this to your package's pubspec.yaml file:

```yaml
dependencies:
 device_sn: ^0.1.0
```

## Usage example
```dart
import 'package:device_sn/device_sn.dart';

String sn;
try {
  sn = await DeviceSn.pdaSn;
} on Exception {
  sn = await DeviceSn.commonSn;
}
```

## Contribute

We would ❤️ to see your contribution!

## License

Distributed under the MIT license. See ``LICENSE`` for more information.

## About

Created by Shusheng.

[license-image]: https://img.shields.io/badge/License-MIT-blue.svg
[license-url]: LICENSE
