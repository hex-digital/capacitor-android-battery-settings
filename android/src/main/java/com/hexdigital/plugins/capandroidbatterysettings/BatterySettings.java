package com.hexdigital.plugins.capandroidbatterysettings;

import android.util.Log;

public class BatterySettings {

  public Boolean isBatteryOptimizationEnabled() {
    Log.i("Echo", "requestBatteryOptimizationDisabled doing nothing");
    return false;
  }

  public void requestBatteryOptimizationDisabled() {
    Log.i("Echo", "requestBatteryOptimizationDisabled doing nothing");
  }

  public String echo(String value) {
    Log.i("Echo", value);
    return value;
  }
}
