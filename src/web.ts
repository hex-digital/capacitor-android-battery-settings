import { WebPlugin } from '@capacitor/core';

import type { BatterySettingsPlugin } from './definitions';

export class BatterySettingsWeb
  extends WebPlugin
  implements BatterySettingsPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
