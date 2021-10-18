/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.indices;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

// typedef: indices._types.IndexSettingsAnalysis
public final class IndexSettingsAnalysis implements ToJsonp {
	@Nullable
	private final Map<String, JsonValue> charFilter;

	// ---------------------------------------------------------------------------------------------

	protected IndexSettingsAnalysis(Builder builder) {

		this.charFilter = builder.charFilter;

	}

	/**
	 * API name: {@code char_filter}
	 */
	@Nullable
	public Map<String, JsonValue> charFilter() {
		return this.charFilter;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.charFilter != null) {

			generator.writeKey("char_filter");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.charFilter.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingsAnalysis}.
	 */
	public static class Builder implements ObjectBuilder<IndexSettingsAnalysis> {
		@Nullable
		private Map<String, JsonValue> charFilter;

		/**
		 * API name: {@code char_filter}
		 */
		public Builder charFilter(@Nullable Map<String, JsonValue> value) {
			this.charFilter = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #charFilter(Map)}, creating the map if needed.
		 */
		public Builder putCharFilter(String key, JsonValue value) {
			if (this.charFilter == null) {
				this.charFilter = new HashMap<>();
			}
			this.charFilter.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link IndexSettingsAnalysis}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingsAnalysis build() {

			return new IndexSettingsAnalysis(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndexSettingsAnalysis
	 */
	public static final JsonpDeserializer<IndexSettingsAnalysis> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexSettingsAnalysis::setupIndexSettingsAnalysisDeserializer);

	protected static void setupIndexSettingsAnalysisDeserializer(
			DelegatingDeserializer<IndexSettingsAnalysis.Builder> op) {

		op.add(Builder::charFilter, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"char_filter");

	}

}