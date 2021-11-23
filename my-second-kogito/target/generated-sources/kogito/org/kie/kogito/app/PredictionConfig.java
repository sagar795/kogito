/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.app;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.enterprise.inject.Instance;
import org.kie.kogito.pmml.config.AbstractPredictionConfig;
import org.kie.kogito.prediction.PredictionEventListenerConfig;

@javax.inject.Singleton
class PredictionConfig extends AbstractPredictionConfig {

    @javax.inject.Inject
    public PredictionConfig(Instance<PredictionEventListenerConfig> predictionEventListenerConfigs) {
        super(predictionEventListenerConfigs);
    }
}
