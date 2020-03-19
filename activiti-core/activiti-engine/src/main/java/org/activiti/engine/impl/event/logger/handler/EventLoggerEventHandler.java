package org.activiti.engine.impl.event.logger.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;
import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.persistence.entity.EventLogEntryEntity;

/**

 */
public interface EventLoggerEventHandler {

  EventLogEntryEntity generateEventLogEntry(CommandContext commandContext);

  void setEvent(ActivitiEvent event);

  void setTimeStamp(Date timeStamp);

  void setObjectMapper(ObjectMapper objectMapper);

}
