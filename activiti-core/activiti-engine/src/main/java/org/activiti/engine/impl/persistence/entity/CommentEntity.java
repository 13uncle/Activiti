/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.engine.impl.persistence.entity;

import java.util.Date;
import org.activiti.engine.api.internal.Internal;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Event;

/**


 */
@Internal
@Deprecated
public interface CommentEntity extends Comment, Event, Entity {

  String TYPE_EVENT = "event";
  String TYPE_COMMENT = "comment";

  byte[] getFullMessageBytes();

  void setFullMessageBytes(byte[] fullMessageBytes);

  void setMessage(String[] messageParts);

  void setUserId(String userId);

  void setTaskId(String taskId);

  void setMessage(String message);

  void setTime(Date time);

  void setProcessInstanceId(String processInstanceId);

  void setType(String type);

  void setFullMessage(String fullMessage);

  void setAction(String action);

}
