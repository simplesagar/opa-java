/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class HealthResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public HealthResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public HealthResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public HealthResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OPA service is healthy. If the bundles option is specified then all configured bundles have been activated. If the plugins option is specified then all plugins are in an OK state.
     */
    
    public com.styra.opa.models.shared.HealthyServer healthyServer;

    public HealthResponse withHealthyServer(com.styra.opa.models.shared.HealthyServer healthyServer) {
        this.healthyServer = healthyServer;
        return this;
    }
    
    /**
     * OPA service is not healthy. If the bundles option is specified this can mean any of the configured bundles have not yet been activated. If the plugins option is specified then at least one plugin is in a non-OK state.
     */
    
    public com.styra.opa.models.shared.UnhealthyServer unhealthyServer;

    public HealthResponse withUnhealthyServer(com.styra.opa.models.shared.UnhealthyServer unhealthyServer) {
        this.unhealthyServer = unhealthyServer;
        return this;
    }
    
    public HealthResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
