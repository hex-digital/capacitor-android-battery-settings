package com.hexdigital.plugins.capandroidbatterysettings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import android.provider.Settings;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.JSObject;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "BatterySettings")
public class BatterySettingsPlugin extends Plugin {

  @Override
  public Context getContext() {
    return bridge.getContext();
  }

  @PluginMethod
  public void isBatteryOptimizationEnabled(PluginCall call) {
    try {
      PowerManager powerManager = (PowerManager) getContext().getSystemService(Context.POWER_SERVICE);
      boolean isBatteryOptimizationEnabled = false;
      if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
        isBatteryOptimizationEnabled = powerManager.isIgnoringBatteryOptimizations(getContext().getPackageName());
      }
      JSObject result = new JSObject();
      result.put("isEnabled", isBatteryOptimizationEnabled);
      call.success(result);
    } catch (Exception e) {
      call.error(e.getMessage(), e);
    }
  }

  @PluginMethod
  public void requestBatteryOptimizationDisabled(PluginCall call) {
    try {
      Intent intent = new Intent();
      intent.setAction(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS);
      intent.setData(Uri.parse("package:" + getContext().getPackageName()));
      getContext().startActivity(intent);
      call.success();
    } catch (Exception e) {
      call.error(e.getMessage(), e);
    }
  }
}
