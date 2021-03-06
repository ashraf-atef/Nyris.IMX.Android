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
 * NyrisLiveEndpoints.java - A class that contain the different live service endpoints
 * extend NyrisEndpoints
 *
 * @author Sidali Mellouk
 * @see NyrisEndpoints
 * Created by nyris GmbH
 * Copyright © 2017 nyris GmbH. All rights reserved.
 */
class NyrisLiveEndpoints extends NyrisEndpoints{
    /**
     * Constructor
     */
    NyrisLiveEndpoints(){
        super();
        apiServer = "api.nyris.io";
        version = "v1";
    }
}
