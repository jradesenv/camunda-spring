package br.com.hypeflame.example.camundaspring.api;

import br.com.hypeflame.example.camundaspring.api.input.ValidacaoInput;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.NotImplementedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidacaoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(value = "Executa o processo de validacao")
    @PostMapping(value = "validacao")
    public String processarValidacaoIdade(@RequestBody ValidacaoInput input) {
        logger.info("iniciando validação {}", input);
        throw new NotImplementedException();
    }
}