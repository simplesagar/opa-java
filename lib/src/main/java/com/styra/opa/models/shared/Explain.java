/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Explain {
    NOTES("notes"),
    FAILS("fails"),
    FULL("full"),
    DEBUG("debug");

    @JsonValue
    public final String value;

    private Explain(String value) {
        this.value = value;
    }
}
