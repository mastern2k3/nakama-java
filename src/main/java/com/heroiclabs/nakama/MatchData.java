/*
 * Copyright 2018 The Nakama Authors
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

import lombok.*;

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
/**
 * Some game state update in a match.
 */
public class MatchData {
    /**
     * The unique match identifier.
     */
    private String matchId;

    /**
     * The operation code for the state change.
     * This value can be used to mark the type of the contents of the state.
     */
    private long opCode;

    /**
     * he byte contents of the state change.
     */
    private byte[] data;

    /**
     * Information on the user who sent the state change.
     */
    private UserPresence userPresence;
}
