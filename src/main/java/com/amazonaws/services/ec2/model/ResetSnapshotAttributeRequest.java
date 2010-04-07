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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to reset an attribute on a snapshot back to its default
 * value. Only one attribute can be reset per request.
 * </p>
 */
public class ResetSnapshotAttributeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the snapshot whose attribute is being reset.
     */
    private String snapshotId;

    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * createVolumePermission
     */
    private String attribute;

    /**
     * The ID of the snapshot whose attribute is being reset.
     *
     * @return The ID of the snapshot whose attribute is being reset.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the snapshot whose attribute is being reset.
     *
     * @param snapshotId The ID of the snapshot whose attribute is being reset.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the snapshot whose attribute is being reset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the snapshot whose attribute is being reset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetSnapshotAttributeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * createVolumePermission
     *
     * @return The name of the attribute being reset. <p> Available attribute names:
     *         createVolumePermission
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * createVolumePermission
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         createVolumePermission
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * createVolumePermission
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         createVolumePermission
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetSnapshotAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    
    
}
    