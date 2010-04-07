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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * An active offer for Amazon EC2 Reserved Instances.
 * </p>
 */
public class ReservedInstancesOffering {

    /**
     * The unique ID of this Reserved Instances offering.
     */
    private String reservedInstancesOfferingId;

    /**
     * The instance type on which the Reserved Instances can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge
     */
    private String instanceType;

    /**
     * The Availability Zone in which the Reserved Instances can be used.
     */
    private String availabilityZone;

    /**
     * The duration of the Reserved Instance, in seconds.
     */
    private Long duration;

    /**
     * The usage price of the Reserved Instance, per hour.
     */
    private Float usagePrice;

    /**
     * The purchase price of the Reserved Instance.
     */
    private Float fixedPrice;

    /**
     * The Reserved Instances description (ex: Windows or Unix/Linux).
     */
    private String productDescription;

    /**
     * The unique ID of this Reserved Instances offering.
     *
     * @return The unique ID of this Reserved Instances offering.
     */
    public String getReservedInstancesOfferingId() {
        return reservedInstancesOfferingId;
    }
    
    /**
     * The unique ID of this Reserved Instances offering.
     *
     * @param reservedInstancesOfferingId The unique ID of this Reserved Instances offering.
     */
    public void setReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
    }
    
    /**
     * The unique ID of this Reserved Instances offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesOfferingId The unique ID of this Reserved Instances offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstancesOffering withReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
        return this;
    }
    
    
    /**
     * The instance type on which the Reserved Instances can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge
     *
     * @return The instance type on which the Reserved Instances can be used.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type on which the Reserved Instances can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge
     *
     * @param instanceType The instance type on which the Reserved Instances can be used.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type on which the Reserved Instances can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge
     *
     * @param instanceType The instance type on which the Reserved Instances can be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see InstanceType
     */
    public ReservedInstancesOffering withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    
    /**
     * The Availability Zone in which the Reserved Instances can be used.
     *
     * @return The Availability Zone in which the Reserved Instances can be used.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instances can be used.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instances can be used.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instances can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instances can be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstancesOffering withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The duration of the Reserved Instance, in seconds.
     *
     * @return The duration of the Reserved Instance, in seconds.
     */
    public Long getDuration() {
        return duration;
    }
    
    /**
     * The duration of the Reserved Instance, in seconds.
     *
     * @param duration The duration of the Reserved Instance, in seconds.
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }
    
    /**
     * The duration of the Reserved Instance, in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration of the Reserved Instance, in seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstancesOffering withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    
    
    /**
     * The usage price of the Reserved Instance, per hour.
     *
     * @return The usage price of the Reserved Instance, per hour.
     */
    public Float getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * The usage price of the Reserved Instance, per hour.
     *
     * @param usagePrice The usage price of the Reserved Instance, per hour.
     */
    public void setUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * The usage price of the Reserved Instance, per hour.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The usage price of the Reserved Instance, per hour.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstancesOffering withUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }
    
    
    /**
     * The purchase price of the Reserved Instance.
     *
     * @return The purchase price of the Reserved Instance.
     */
    public Float getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * The purchase price of the Reserved Instance.
     *
     * @param fixedPrice The purchase price of the Reserved Instance.
     */
    public void setFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * The purchase price of the Reserved Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The purchase price of the Reserved Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstancesOffering withFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }
    
    
    /**
     * The Reserved Instances description (ex: Windows or Unix/Linux).
     *
     * @return The Reserved Instances description (ex: Windows or Unix/Linux).
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The Reserved Instances description (ex: Windows or Unix/Linux).
     *
     * @param productDescription The Reserved Instances description (ex: Windows or Unix/Linux).
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The Reserved Instances description (ex: Windows or Unix/Linux).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The Reserved Instances description (ex: Windows or Unix/Linux).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstancesOffering withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    
    
}
    