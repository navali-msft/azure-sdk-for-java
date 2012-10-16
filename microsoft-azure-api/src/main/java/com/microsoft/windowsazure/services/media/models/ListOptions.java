/**
 * Copyright 2012 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.windowsazure.services.media.models;

import javax.ws.rs.core.MultivaluedMap;
import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * The Class ListOptions.
 */
public class ListOptions {

    /**
     * Instantiates a new list options.
     */
    public ListOptions() {
        this.queryParameters = new MultivaluedMapImpl();
    }

    /** The query parameters. */
    protected MultivaluedMap<String, String> queryParameters;

    /**
     * Gets the query parameters.
     * 
     * @return the query parameters
     */
    public MultivaluedMap<String, String> getQueryParameters() {
        return this.queryParameters;
    }

}
