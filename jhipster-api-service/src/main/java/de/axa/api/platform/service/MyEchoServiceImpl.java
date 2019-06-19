package de.axa.api.platform.service;

import de.axa.api.platform.web.api.EchoApiDelegate;
import de.axa.api.platform.web.api.model.EchoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class MyEchoServiceImpl implements EchoApiDelegate {
    private static final Logger log = LoggerFactory.getLogger(MyEchoServiceImpl.class);

    @Override
    public ResponseEntity<EchoResponse> echo(String message,
                                             String headerParam) {

        EchoResponse echoResponse = new EchoResponse();
        echoResponse.setMessage(message);
        return new ResponseEntity<>(echoResponse, HttpStatus.OK);
    }
}

