//
// Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
//
// WSO2 LLC. licenses this file to you under the Apache License,
// Version 2.0 (the "License"); you may not use this file except
// in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//
// Before adding another function for a new error code
// make sure there is no already existing error code for that.
// If there is an error code for that, reuse it.

import wso2/apk_common_lib as commons;

public isolated function e909600(error e) returns commons:APKError {
    return error commons:APKError( e.message(), e,
        code = 909600,
        message = e.message(),
        statusCode = 500,
        description = e.message()
    ); 
}

public isolated function e909601(error e) returns commons:APKError {
    return error commons:APKError( "Error while retrieving connection", e,
        code = 909601,
        message = "Error while retrieving connection",
        statusCode = 500,
        description = "Error while retrieving connection"
    ); 
}

public isolated function e909602() returns APKError {
    return error APKError( "API Definition Not Found for provided API ID",
        code = 909602,
        message = "API Definition Not Found for provided API ID",
        statusCode = "404",
        description = "API Definition Not Found for provided API ID"
    ); 
}
