/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the users in the Amazon Cognito user pool.
 * </p>
 */
public class ListUsersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for which you want to list users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The attributes to get from the request to list users.
     * </p>
     */
    private java.util.List<String> attributesToGet;

    /**
     * <p>
     * The limit of the request to list users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     */
    private Integer limit;

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String paginationToken;

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN
     */
    private String userStatus;

    /**
     * <p>
     * The user pool ID for which you want to list users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @return <p>
     *         The user pool ID for which you want to list users.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for which you want to list users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for which you want to list users.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for which you want to list users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for which you want to list users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The attributes to get from the request to list users.
     * </p>
     *
     * @return <p>
     *         The attributes to get from the request to list users.
     *         </p>
     */
    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <p>
     * The attributes to get from the request to list users.
     * </p>
     *
     * @param attributesToGet <p>
     *            The attributes to get from the request to list users.
     *            </p>
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        this.attributesToGet = new java.util.ArrayList<String>(attributesToGet);
    }

    /**
     * <p>
     * The attributes to get from the request to list users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesToGet <p>
     *            The attributes to get from the request to list users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) {
            this.attributesToGet = new java.util.ArrayList<String>(attributesToGet.length);
        }
        for (String value : attributesToGet) {
            this.attributesToGet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The attributes to get from the request to list users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesToGet <p>
     *            The attributes to get from the request to list users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * The limit of the request to list users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @return <p>
     *         The limit of the request to list users.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The limit of the request to list users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @param limit <p>
     *            The limit of the request to list users.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The limit of the request to list users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @param limit <p>
     *            The limit of the request to list users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         An identifier that was returned from the previous call to this
     *         operation, which can be used to return the next set of items in
     *         the list.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param paginationToken <p>
     *            An identifier that was returned from the previous call to this
     *            operation, which can be used to return the next set of items
     *            in the list.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param paginationToken <p>
     *            An identifier that was returned from the previous call to this
     *            operation, which can be used to return the next set of items
     *            in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
        return this;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN
     *
     * @return <p>
     *         The user status. Can be one of the following:
     *         </p>
     *         <ul>
     *         <li>UNCONFIRMED - User has been created but not confirmed.</li>
     *         <li>CONFIRMED - User has been confirmed.</li>
     *         <li>ARCHIVED - User is no longer active.</li>
     *         <li>COMPROMISED - User is disabled due to a potential security
     *         threat.</li>
     *         <li>UNKNOWN - User status is not known.</li>
     *         </ul>
     * @see UserStatusType
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN
     *
     * @param userStatus <p>
     *            The user status. Can be one of the following:
     *            </p>
     *            <ul>
     *            <li>UNCONFIRMED - User has been created but not confirmed.</li>
     *            <li>CONFIRMED - User has been confirmed.</li>
     *            <li>ARCHIVED - User is no longer active.</li>
     *            <li>COMPROMISED - User is disabled due to a potential security
     *            threat.</li>
     *            <li>UNKNOWN - User status is not known.</li>
     *            </ul>
     * @see UserStatusType
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN
     *
     * @param userStatus <p>
     *            The user status. Can be one of the following:
     *            </p>
     *            <ul>
     *            <li>UNCONFIRMED - User has been created but not confirmed.</li>
     *            <li>CONFIRMED - User has been confirmed.</li>
     *            <li>ARCHIVED - User is no longer active.</li>
     *            <li>COMPROMISED - User is disabled due to a potential security
     *            threat.</li>
     *            <li>UNKNOWN - User status is not known.</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatusType
     */
    public ListUsersRequest withUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN
     *
     * @param userStatus <p>
     *            The user status. Can be one of the following:
     *            </p>
     *            <ul>
     *            <li>UNCONFIRMED - User has been created but not confirmed.</li>
     *            <li>CONFIRMED - User has been confirmed.</li>
     *            <li>ARCHIVED - User is no longer active.</li>
     *            <li>COMPROMISED - User is disabled due to a potential security
     *            threat.</li>
     *            <li>UNKNOWN - User status is not known.</li>
     *            </ul>
     * @see UserStatusType
     */
    public void setUserStatus(UserStatusType userStatus) {
        this.userStatus = userStatus.toString();
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>UNCONFIRMED - User has been created but not confirmed.</li>
     * <li>CONFIRMED - User has been confirmed.</li>
     * <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security threat.</li>
     * <li>UNKNOWN - User status is not known.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN
     *
     * @param userStatus <p>
     *            The user status. Can be one of the following:
     *            </p>
     *            <ul>
     *            <li>UNCONFIRMED - User has been created but not confirmed.</li>
     *            <li>CONFIRMED - User has been confirmed.</li>
     *            <li>ARCHIVED - User is no longer active.</li>
     *            <li>COMPROMISED - User is disabled due to a potential security
     *            threat.</li>
     *            <li>UNKNOWN - User status is not known.</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatusType
     */
    public ListUsersRequest withUserStatus(UserStatusType userStatus) {
        this.userStatus = userStatus.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken() + ",");
        if (getUserStatus() != null)
            sb.append("UserStatus: " + getUserStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsersRequest == false)
            return false;
        ListUsersRequest other = (ListUsersRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null
                && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getUserStatus() == null ^ this.getUserStatus() == null)
            return false;
        if (other.getUserStatus() != null
                && other.getUserStatus().equals(this.getUserStatus()) == false)
            return false;
        return true;
    }
}
