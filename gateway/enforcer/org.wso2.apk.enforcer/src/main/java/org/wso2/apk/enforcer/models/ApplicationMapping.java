/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.apk.enforcer.models;

import org.wso2.apk.enforcer.common.CacheableEntity;

/**
 * Entity for keeping mapping between Application and Subscription.
 */
public class ApplicationMapping implements CacheableEntity<String> {

    private String uuid = null;
    private String applicationUUID = null;
    private String subscriptionUUID = null;

    private String organization;

    public String getUuid() {

        return uuid;
    }

    public void setUuid(String uuid) {

        this.uuid = uuid;
    }

    public String getApplicationUUID() {

        return applicationUUID;
    }

    public void setApplicationUUID(String applicationUUID) {

        this.applicationUUID = applicationUUID;
    }

    public String getSubscriptionUUID() {

        return subscriptionUUID;
    }

    public void setSubscriptionUUID(String subscriptionUUID) {

        this.subscriptionUUID = subscriptionUUID;
    }

    public String getOrganization() {

        return organization;
    }

    public void setOrganization(String organization) {

        this.organization = organization;
    }

    @Override
    public String getCacheKey() {

        return organization + ":" + applicationUUID+ ":" + subscriptionUUID;
    }
}
