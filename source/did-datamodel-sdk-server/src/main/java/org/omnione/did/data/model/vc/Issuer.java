/*
 * Copyright 2024 OmniOne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omnione.did.data.model.vc;

import jakarta.validation.constraints.NotEmpty;

import org.omnione.did.data.model.DataObject;
import org.omnione.did.data.model.util.json.GsonWrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Issuer extends DataObject{

    /**
     *  did
     */
    @SerializedName("id")
    @Expose @NotEmpty
    private String id;
    
    /**
     * Provide name
     */
    @SerializedName("name")
    @Expose
    private String name;

    @Override
    public void fromJson(String val) {
        GsonWrapper gson = new GsonWrapper();
        Issuer data = gson.fromJson(val, Issuer.class);
        
        id = data.id;
        name = data.name;
    }
}
