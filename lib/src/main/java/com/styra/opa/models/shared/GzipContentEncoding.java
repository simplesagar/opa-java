/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GzipContentEncoding {
    GZIP("gzip");

    @JsonValue
    public final String value;

    private GzipContentEncoding(String value) {
        this.value = value;
    }
}
