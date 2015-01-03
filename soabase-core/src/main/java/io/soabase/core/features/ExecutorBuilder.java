/**
 * Copyright 2014 Jordan Zimmerman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.soabase.core.features;

import io.dropwizard.lifecycle.setup.ExecutorServiceBuilder;
import io.dropwizard.lifecycle.setup.LifecycleEnvironment;
import io.dropwizard.lifecycle.setup.ScheduledExecutorServiceBuilder;

/**
 * Gives access to the executor builders from Dropwizard's environment
 */
public class ExecutorBuilder
{
    private final LifecycleEnvironment environment;

    public ExecutorBuilder(LifecycleEnvironment environment)
    {
        this.environment = environment;
    }

    /**
     * Same as {@link LifecycleEnvironment#executorService(String)}
     *
     * @param nameFormat name format
     * @return builder
     */
    public ExecutorServiceBuilder executorService(String nameFormat) {
        return environment.executorService(nameFormat);
    }

    /**
     * Same as {@link LifecycleEnvironment#scheduledExecutorService(String)}
     *
     * @param nameFormat name format
     * @return builder
     */
    public ScheduledExecutorServiceBuilder scheduledExecutorService(String nameFormat) {
        return environment.scheduledExecutorService(nameFormat);
    }

    /**
     * Same as {@link LifecycleEnvironment#scheduledExecutorService(String, boolean)}
     *
     * @param nameFormat name format
     * @param useDaemonThreads true/false
     * @return builder
     */
    public ScheduledExecutorServiceBuilder scheduledExecutorService(String nameFormat, boolean useDaemonThreads) {
        return environment.scheduledExecutorService(nameFormat, useDaemonThreads);
    }
}
