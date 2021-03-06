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

import java.util.List;


/**
 * IMatchCallback.java - An interface that contain the status definition of Image Matching API
 *
 * @see ICallback
 * @author Sidali Mellouk
 * Created by nyris GmbH
 * Copyright © 2017 nyris GmbH. All rights reserved.
 */
public interface IObjectExtractCallback extends ICallback{
    /**
     * On Object Extracted called when there are object extracted from the sent picture
     * @param objectProposals A list of variable of type OfferInfos
     * @see ObjectProposal
     */
    void onObjectExtracted(List<ObjectProposal> objectProposals);

    /**
     * On Object Extracted called when there are object extracted from the sent picture
     * @param json A variable of type String
     */
    void onObjectExtracted(String json);
}
