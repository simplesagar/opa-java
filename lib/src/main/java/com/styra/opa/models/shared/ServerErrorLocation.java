/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ServerErrorLocation {
    @JsonProperty("file")
    public String file;

    public ServerErrorLocation withFile(String file) {
        this.file = file;
        return this;
    }
    
    @JsonProperty("row")
    public Long row;

    public ServerErrorLocation withRow(Long row) {
        this.row = row;
        return this;
    }
    
    @JsonProperty("col")
    public Long col;

    public ServerErrorLocation withCol(Long col) {
        this.col = col;
        return this;
    }
    
    public ServerErrorLocation(@JsonProperty("file") String file, @JsonProperty("row") Long row, @JsonProperty("col") Long col) {
        this.file = file;
        this.row = row;
        this.col = col;
  }
}
