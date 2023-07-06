import { WebPlugin } from '@capacitor/core';

import type { BatterySettingsPlugin } from './definitions';

export class BatterySettingsWeb
  extends WebPlugin
  implements BatterySettingsPlugin
{
  async isBatteryOptimizationEnabled(): Promise<{isEnabled: boolean}> {
    console.log('This plugin is not available on web');
    
    return {isEnabled: false};
  }

  async requestBatteryOptimizationDisabled(): Promise<void> {
    console.log('This plugin is not available on web');
  }
}
