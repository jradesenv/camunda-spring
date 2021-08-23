package br.com.hypeflame.example.camundaspring.api;

import io.swagger.annotations.ApiOperation;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidacaoController {

    @Autowired
    private RuntimeService runtimeService;

    @ApiOperation(value = "Executa o processo de validacao")
    @PostMapping(value = "validacao/{idade}")
    public String processarValidacaoIdade(@PathVariable Integer idade) {
        return runtimeService.createProcessInstanceByKey("validacao-idade-cadastro")
                    .setVariable("idade", idade)
                    .execute()
                    .getProcessInstanceId();
    }
}