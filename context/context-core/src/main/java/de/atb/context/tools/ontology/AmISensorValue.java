package de.atb.context.tools.ontology;

/*-
 * #%L
 * ATB Context Extraction Core Lib
 * %%
 * Copyright (C) 2016 - 2020 ATB
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
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
 * #L%
 */


/**
 *
 * @author scholze
 * @version $LastChangedRevision: 144 $
 */
public class AmISensorValue {
    private String bandwidthValue;
    private AmIMeasuredValues measuredValues;

    public AmISensorValue() {
    }

    public AmISensorValue(String bandwidhtValue, AmIMeasuredValues measuredValues) {
        this.bandwidthValue = bandwidhtValue;
        this.measuredValues = measuredValues;
    }

    public String getBandwidhtValue() {
        return bandwidthValue;
    }

    public void setBandwidhtValue(String bandwidhtValue) {
        this.bandwidthValue = bandwidhtValue;
    }

    public AmIMeasuredValues getMeasuredValues() {
        return measuredValues;
    }

    public void setMeasuredValues(AmIMeasuredValues measuredValues) {
        this.measuredValues = measuredValues;
    }
    
}
