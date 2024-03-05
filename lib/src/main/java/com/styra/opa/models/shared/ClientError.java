/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ClientError {
    @JsonProperty("code")
    public String code;

    public ClientError withCode(String code) {
        this.code = code;
        return this;
    }
    
    @JsonProperty("message")
    public String message;

    public ClientError withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public Errors[] errors;

    public ClientError withErrors(Errors[] errors) {
        this.errors = errors;
        return this;
    }
    
    public ClientError(@JsonProperty("code") String code, @JsonProperty("message") String message) {
        this.code = code;
        this.message = message;
  }
}
