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

import com.google.gson.annotations.SerializedName;

/**
 * ImageInfo.java - A class model that contain image information
 *
 * @author  Sidali Mellouk
 * Created by nyris GmbH
 * Copyright © 2017 nyris GmbH. All rights reserved.
 */
public class ImageInfo{
    @SerializedName("url")
    String url;

    /**
     * Default Constructor
     */
    public ImageInfo(){
    }

    /**
     * Get Url of the image
     * @return URL String value
     */
    public String getUrl() {
        return url;
    }
}
