package com.spotify.oauth2.applicationApi;

import com.spotify.oauth2.api.TokenManager;
import com.spotify.oauth2.pojo.Item;
import com.spotify.oauth2.utils.ConfigLoader;

import io.restassured.response.Response;
import static com.spotify.oauth2.applicationApi.Routes.USERS;
import static com.spotify.oauth2.applicationApi.Routes.PLAYLISTS;

public class PlaylistApi extends TokenManager{
		
	public static Response post(Item requestPlaylist) {
		
		return RestResource.post(USERS + "/" + ConfigLoader.getInstance().getUserId() + PLAYLISTS, getToken(), requestPlaylist);
	}
	
	public static Response get(String playlistId) {
		
		return RestResource.get(PLAYLISTS + "/" + playlistId, getToken());
	}
	
	public static Response update(Item requestPlaylist, String playlistId) {
		
		return RestResource.update(PLAYLISTS + "/" + playlistId, getToken(), requestPlaylist);		
	}

}
