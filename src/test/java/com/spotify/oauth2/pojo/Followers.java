package com.spotify.oauth2.pojo;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Followers {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	
	@Generated("jsonschema2pojo")
	public class Playlist {

	@JsonProperty("href")
	private Object href;
	@JsonProperty("total")
	private Integer total;

	@JsonProperty("href")
	public Object getHref() {
	return href;
	}

	@JsonProperty("href")
	public void setHref(Object href) {
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

}
