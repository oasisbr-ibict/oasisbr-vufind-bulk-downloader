package org.lareferencia.services.vufindbulkdownloader;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandlerController implements ErrorController {

  private static final String PATH = "/error";

  @RequestMapping(value = PATH)
  public String error() {
    return "Not found!";
  }

  @Override
  public String getErrorPath() {
    return PATH;
  }

}
