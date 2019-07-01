package de.axa.api.platform.web.gen.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-01T13:01:55.392Z[Etc/UTC]")

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
