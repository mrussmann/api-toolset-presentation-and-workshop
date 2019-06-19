package de.axa.api.platform.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-14T15:06:33.319Z[Etc/UTC]")

@Controller
@RequestMapping("${openapi.apiservice.base-path:/api}")
public class EchoApiController implements EchoApi {

    private final EchoApiDelegate delegate;

    public EchoApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) EchoApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new EchoApiDelegate() {});
    }

    @Override
    public EchoApiDelegate getDelegate() {
        return delegate;
    }

}
