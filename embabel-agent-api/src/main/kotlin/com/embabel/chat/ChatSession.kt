/*
 * Copyright 2024-2025 Embabel Software, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.embabel.chat

/**
 * Simplest possible conversation session implementation
 */
interface ChatSession {

    /**
     * Conversation history
     */
    val conversation: Conversation

    /**
     * Listener that will always be active
     */
    val messageListener: MessageListener

    /**
     * Any response messages will be sent to the messageListener
     * @param message message to send
     * @param additionalListener any additional listener to send the message to,
     * in addition to the messageListener
     */
    fun respond(message: UserMessage, additionalListener: MessageListener? = null)
}
