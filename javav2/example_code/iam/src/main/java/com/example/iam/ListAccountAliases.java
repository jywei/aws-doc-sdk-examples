/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.example.iam;
import software.amazon.awssdk.services.iam.model.ListAccountAliasesResponse;

import software.amazon.awssdk.core.regions.Region;
import software.amazon.awssdk.services.iam.IAMClient;

/**
 * Lists all aliases associated with an AWS account
 */
public class ListAccountAliases {
    public static void main(String[] args) {

        Region region = Region.AWS_GLOBAL;
        IAMClient iam = IAMClient.builder().region(region).build();

        ListAccountAliasesResponse response = iam.listAccountAliases();

        for (String alias : response.accountAliases()) {
            System.out.printf("Retrieved account alias %s", alias);
        }
    }
}

