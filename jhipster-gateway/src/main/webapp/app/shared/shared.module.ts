import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { ApigatewaySharedLibsModule, ApigatewaySharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [ApigatewaySharedLibsModule, ApigatewaySharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [ApigatewaySharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ApigatewaySharedModule {
  static forRoot() {
    return {
      ngModule: ApigatewaySharedModule
    };
  }
}
