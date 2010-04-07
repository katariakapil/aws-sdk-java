/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Add Job Flow Steps Request
 */
public class AddJobFlowStepsRequest extends AmazonWebServiceRequest {

    private String jobFlowId;

    private java.util.List<StepConfig> steps;

    /**
     * Returns the value of the JobFlowId property for this object.
     *
     * @return The value of the JobFlowId property for this object.
     */
    public String getJobFlowId() {
        return jobFlowId;
    }
    
    /**
     * Sets the value of the JobFlowId property for this object.
     *
     * @param jobFlowId The new value for the JobFlowId property for this object.
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }
    
    /**
     * Sets the value of the JobFlowId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowId The new value for the JobFlowId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddJobFlowStepsRequest withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }
    
    
    /**
     * Returns the value of the Steps property for this object.
     *
     * @return The value of the Steps property for this object.
     */
    public java.util.List<StepConfig> getSteps() {
        if (steps == null) {
            steps = new java.util.ArrayList<StepConfig>();
        }
        return steps;
    }
    
    /**
     * Sets the value of the Steps property for this object.
     *
     * @param steps The new value for the Steps property for this object.
     */
    public void setSteps(java.util.Collection<StepConfig> steps) {
        java.util.List<StepConfig> stepsCopy = new java.util.ArrayList<StepConfig>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;
    }
    
    /**
     * Sets the value of the Steps property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps The new value for the Steps property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddJobFlowStepsRequest withSteps(StepConfig... steps) {
        for (StepConfig value : steps) {
            getSteps().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Steps property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps The new value for the Steps property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddJobFlowStepsRequest withSteps(java.util.Collection<StepConfig> steps) {
        java.util.List<StepConfig> stepsCopy = new java.util.ArrayList<StepConfig>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;

        return this;
    }
    
}
    