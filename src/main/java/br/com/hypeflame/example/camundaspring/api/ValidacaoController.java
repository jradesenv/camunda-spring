package br.com.hypeflame.example.camundaspring.api;

import br.com.hypeflame.example.camundaspring.api.input.ValidacaoInput;
import io.swagger.annotations.ApiOperation;
import org.camunda.bpm.engine.RuntimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidacaoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RuntimeService runtimeService;

    @ApiOperation(value = "Executa o processo de validacao")
    @PostMapping(value = "validacao")
    public String processarValidacaoIdade(@RequestBody ValidacaoInput input) {
        logger.info("iniciando validação {}", input);
        return runtimeService.createProcessInstanceByKey("validacao-idade-cadastro")
                .setVariable("idade", input.getIdade())
                .setVariable("nome", input.getNome())
                .setVariable("input", input)
                .execute()
                .getProcessInstanceId();
    }
}