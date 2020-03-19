package org.activiti.editor.language.xml;

import java.util.Collection;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.Signal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SignalConverterTest extends AbstractConverterTest {

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
  }

  private void validateModel(BpmnModel model) {
    Collection<Signal> signals = model.getSignals();
    assertEquals(2, signals.size());
  }

  protected String getResource() {
    return "signaltest.bpmn";
  }
}
