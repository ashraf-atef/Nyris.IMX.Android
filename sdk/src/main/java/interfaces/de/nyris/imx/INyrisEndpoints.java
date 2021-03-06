/*
 * Copyright (C) 2017 nyris GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.nyris.imx;

/**
 * INyrisEndpoints.java - An interface that contain the definition of different nyris api
 *
 * @author Sidali Mellouk
 * Created by nyris GmbH
 * Copyright © 2017 nyris GmbH. All rights reserved.
 */
interface INyrisEndpoints {
    /**
     * Get Image Matching API URL
     * @return A String URL
     */
    String getImageMatchingApi();

    /**
     * Get and compose Image Matching API URL with latitude, longitude and accuracy
     * @param lat A variable of type double
     * @param lon A variable of type double
     * @param acc A variable of type double
     * @return A String URL
     */
    String getImageMatchingApi(double lat, double lon, double acc);

    /**
     * Get Image Matching API URL
     * @return A String URL
     */
    String getObjectProposalApi();

    /**
     * Get Text Search API URL
     * @return A String URL
     */
    String getTextSearchApi();
}
