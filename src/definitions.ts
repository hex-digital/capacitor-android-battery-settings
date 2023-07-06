export interface BatterySettingsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
