package de.axa.api.platform.web.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SwaggerController {

    @Value("${springfox.documentation.swagger.v2.path:/v2/api-docs}")
    String apiDocPath;

    @GetMapping("/swaggerui")
    public String swagger(Model model) {
        model.addAttribute("apiDocPath", this.apiDocPath);
        return "swaggerui";
    }
}
