package org.activiti.editor.language.xml;

import org.activiti.bpmn.model.BpmnModel;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OtherToolImportConverterTest extends AbstractConverterTest {

    @Test
    public void convertXMLToModel() throws Exception {
        BpmnModel bpmnModel = readXMLFile();
        validateModel(bpmnModel);
    }

    @Test
    public void convertModelToXML() throws Exception {
        BpmnModel bpmnModel = readXMLFile();
        BpmnModel parsedModel = exportAndReadXMLFile(bpmnModel);
        validateModel(parsedModel);
        deployProcess(parsedModel);
    }

    protected String getResource() {
        return "othertoolimport.bpmn";
    }

    private void validateModel(BpmnModel model) {
        org.activiti.bpmn.model.Process process = model.getProcess("_GQ4P0PUQEeK4teimjV5_yg");
        assertNotNull(process);
        assertEquals("Carpet_Plus", process.getId());
        assertEquals("Carpet-Plus", process.getName());
        assertTrue(process.isExecutable());
    }

}
