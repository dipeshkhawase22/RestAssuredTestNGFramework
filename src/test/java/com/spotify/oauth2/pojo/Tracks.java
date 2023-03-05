
package com.spotify.oauth2.pojo;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class Tracks {

    @JsonProperty("href")
    private String href;
    @JsonProperty("total")
    private Integer total;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tracks() {
    }

    /**
     * 
     * @param total
     * @param href
     */
    public Tracks(String href, Integer total) {
        super();
        this.href = href;
        this.total = total;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

}
