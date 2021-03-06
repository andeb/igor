/*
 * Copyright 2018 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.spinnaker.igor.polling;

import com.netflix.spinnaker.kork.eureka.RemoteStatusChangedEvent;
import org.springframework.context.ApplicationListener;

public interface PollingMonitor extends ApplicationListener<RemoteStatusChangedEvent> {
  void onApplicationEvent(RemoteStatusChangedEvent event);

  String getName();

  boolean isInService();

  Long getLastPoll();

  /** TODO(rz): Duration. This value is used as seconds. */
  int getPollInterval();

  boolean isPollingEnabled();
}
