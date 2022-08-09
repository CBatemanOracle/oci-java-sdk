/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcesearch.model;

/**
 * Contains search context, such as highlighting, for found resources.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180409")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SearchContext.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SearchContext extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"highlights"})
    public SearchContext(java.util.Map<String, java.util.List<String>> highlights) {
        super();
        this.highlights = highlights;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Describes what in each field matched the search criteria by showing highlighted values, but only for free text searches or for structured
         * queries that use a MATCHING clause. The list of strings represents fragments of values that matched the query conditions. Highlighted
         * values are wrapped with &lt;h1&gt;..&lt;/h1&gt; tags. All values are HTML-encoded (except &lt;h1&gt; tags).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("highlights")
        private java.util.Map<String, java.util.List<String>> highlights;

        /**
         * Describes what in each field matched the search criteria by showing highlighted values, but only for free text searches or for structured
         * queries that use a MATCHING clause. The list of strings represents fragments of values that matched the query conditions. Highlighted
         * values are wrapped with &lt;h1&gt;..&lt;/h1&gt; tags. All values are HTML-encoded (except &lt;h1&gt; tags).
         *
         * @param highlights the value to set
         * @return this builder
         **/
        public Builder highlights(java.util.Map<String, java.util.List<String>> highlights) {
            this.highlights = highlights;
            this.__explicitlySet__.add("highlights");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchContext build() {
            SearchContext model = new SearchContext(this.highlights);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchContext model) {
            if (model.wasPropertyExplicitlySet("highlights")) {
                this.highlights(model.getHighlights());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Describes what in each field matched the search criteria by showing highlighted values, but only for free text searches or for structured
     * queries that use a MATCHING clause. The list of strings represents fragments of values that matched the query conditions. Highlighted
     * values are wrapped with &lt;h1&gt;..&lt;/h1&gt; tags. All values are HTML-encoded (except &lt;h1&gt; tags).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("highlights")
    private final java.util.Map<String, java.util.List<String>> highlights;

    /**
     * Describes what in each field matched the search criteria by showing highlighted values, but only for free text searches or for structured
     * queries that use a MATCHING clause. The list of strings represents fragments of values that matched the query conditions. Highlighted
     * values are wrapped with &lt;h1&gt;..&lt;/h1&gt; tags. All values are HTML-encoded (except &lt;h1&gt; tags).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.List<String>> getHighlights() {
        return highlights;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchContext(");
        sb.append("super=").append(super.toString());
        sb.append("highlights=").append(String.valueOf(this.highlights));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchContext)) {
            return false;
        }

        SearchContext other = (SearchContext) o;
        return java.util.Objects.equals(this.highlights, other.highlights) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.highlights == null ? 43 : this.highlights.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
