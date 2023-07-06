export interface BatterySettingsPlugin {
  isBatteryOptimizationEnabled(): Promise<{ isUnrestricted: boolean }>;
  requestBatteryOptimizationDisabled(): Promise<void>;
}
