export interface BatterySettingsPlugin {
  isBatteryOptimizationEnabled(): Promise<{ isEnabled: boolean }>;
  requestBatteryOptimizationDisabled(): Promise<void>;
}
