
package com.spotify.oauth2.pojo;

import java.util.List;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_NULL)

@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    @JsonProperty("collaborative")
    private Boolean collaborative;
    @JsonProperty("description")
    private String description;
    @JsonProperty("external_urls")
    private ExternalUrls externalUrls;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("images")
    private List<Object> images;
    @JsonProperty("name")
    private String name;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("primary_color")
    private Object primaryColor;
    @JsonProperty("public")
    private Boolean _public;
    @JsonProperty("snapshot_id")
    private String snapshotId;
    @JsonProperty("tracks")
    private Tracks tracks;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uri")
    private String uri;
    
    public Item() {
    }

    public Item(Boolean collaborative, String description, ExternalUrls externalUrls, String href, String id, List<Object> images, String name, Owner owner, Object primaryColor, Boolean _public, String snapshotId, Tracks tracks, String type, String uri) {
        super();
        this.collaborative = collaborative;
        this.description = description;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.owner = owner;
        this.primaryColor = primaryColor;
        this._public = _public;
        this.snapshotId = snapshotId;
        this.tracks = tracks;
        this.type = type;
        this.uri = uri;
    }

}
