/*
 *    Copyright (C) 2015 Apache Software Foundation (ASF)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.mesos.rx.java.example.framework.sleepy.libmesos;

import org.apache.mesos.MesosSchedulerDriver;
import org.apache.mesos.Protos.FrameworkInfo;
import org.apache.mesos.Scheduler;

public final class LibMesosMain {

    public static void main(String[] args) {
        final Scheduler scheduler = new LegacyScheduler();
        final FrameworkInfo frameworkInfo = FrameworkInfo.newBuilder()
            .setUser("")
            .setName("testing-libmesos")
            .setFailoverTimeout(0)
            .build();

        final MesosSchedulerDriver driver = new MesosSchedulerDriver(scheduler, frameworkInfo, "zk://localhost:2181/mesos");

        driver.run();
    }
}
