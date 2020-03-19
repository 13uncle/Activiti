package org.activiti.examples;

import org.activiti.api.process.model.ProcessDefinition;
import org.activiti.api.process.runtime.ProcessRuntime;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private ProcessRuntime processRuntime;

    @Autowired
    private SecurityUtil securityUtil;

    @Test
    public void contextLoads() {
        securityUtil.logInAs("system");
        ProcessDefinition processDefinition = processRuntime.processDefinition("categorizeProcess");
        assertThat(processDefinition).isNotNull();
    }

}
