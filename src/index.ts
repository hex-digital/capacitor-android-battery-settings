import { registerPlugin } from '@capacitor/core';

import type { BatterySettingsPlugin } from './definitions';

const BatterySettings = registerPlugin<BatterySettingsPlugin>(
  'BatterySettings',
  {
    web: () => import('./web').then(m => new m.BatterySettingsWeb()),
  },
);

export * from './definitions';
export { BatterySettings };
