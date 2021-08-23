package br.com.hypeflame.example.camundaspring.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AprovarCadastroDelegate implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Integer idade = (Integer) execution.getVariable("idade");
        logger.info("aprovando cadastro com idade {}", idade);
    }
}
