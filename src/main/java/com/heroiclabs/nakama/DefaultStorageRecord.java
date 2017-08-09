/*
 * Copyright 2017 The Nakama Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.heroiclabs.nakama;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString(includeFieldNames = true)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class DefaultStorageRecord implements StorageRecord {

    private final String bucket;

    private final long createdAt;

    private final String collection;

    private final long expiresAt;

    private final String key;

    private final PermissionRead permissionRead;

    private final PermissionWrite permissionWrite;

    private final byte[] value;

    private final byte[] version;

    private final long updatedAt;

    private final byte[] userId;

    @Override
    public <T> T getValue(Class<T> clazz) {
        // TODO move to static type.
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(new String(value), clazz);
    }
}