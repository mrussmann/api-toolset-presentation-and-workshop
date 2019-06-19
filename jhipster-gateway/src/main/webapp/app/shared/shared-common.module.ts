import { NgModule } from '@angular/core';

import { ApigatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
  imports: [ApigatewaySharedLibsModule],
  declarations: [JhiAlertComponent, JhiAlertErrorComponent],
  exports: [ApigatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class ApigatewaySharedCommonModule {}
