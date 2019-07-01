package de.axa.api.platform.web.gen.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-01T13:00:03.553Z[Etc/UTC]")

@Controller
@RequestMapping("${openapi.apiservice.base-path:/api}")
public class ProductsApiController implements ProductsApi {

    private final ProductsApiDelegate delegate;

    public ProductsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ProductsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ProductsApiDelegate() {});
    }

    @Override
    public ProductsApiDelegate getDelegate() {
        return delegate;
    }

}
