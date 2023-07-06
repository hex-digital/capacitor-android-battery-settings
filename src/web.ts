import { WebPlugin } from '@capacitor/core';

import type { BatterySettingsPlugin } from './definitions';

export class BatterySettingsWeb
  extends WebPlugin
  implements BatterySettingsPlugin
{
  async isBatteryOptimizationEnabled(): Promise<{isUnrestricted: boolean}> {
    console.log('This plugin is not available on web');
    
    return {isUnrestricted: false};
  }

  async requestBatteryOptimizationDisabled(): Promise<void> {
    console.log('This plugin is not available on web');
  }
}
