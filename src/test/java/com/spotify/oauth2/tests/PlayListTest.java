package com.spotify.oauth2.tests;

import org.testng.annotations.Test;
import com.spotify.oauth2.api.SpecBuilder;
import com.spotify.oauth2.api.StatusCode;
import com.spotify.oauth2.applicationApi.PlaylistApi;
import com.spotify.oauth2.pojo.Item;
import com.spotify.oauth2.utils.DataLoader;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import com.spotify.oauth2.utils.FakerUtils;

public class PlayListTest extends SpecBuilder{
	
	@Test
	public void create_a_playlist() {
		
		Item requestPlaylist = playlistBuilder(FakerUtils.generateName(), FakerUtils.generateDescription(), false);
		
		Response response = PlaylistApi.post(requestPlaylist);
		assertStatusCode(response.statusCode(), StatusCode.CODE_201);
		
		itemAssertions(response.as(Item.class), requestPlaylist);
	}
	
	@Test
	public void get_a_playlist() {
		
		Item requestPlaylist = playlistBuilder("Updated Playlist Name", "Updated playlist description", false);
		
		Response response = PlaylistApi.get(DataLoader.getInstance().getPlaylistId());
		assertStatusCode(response.statusCode(), StatusCode.CODE_200);
		
		itemAssertions(response.as(Item.class), requestPlaylist); 
	}
	
	@Test
	public void update_a_playlist() {
		
		Item requestPlaylist = playlistBuilder(FakerUtils.generateName(), FakerUtils.generateDescription(), false);
		
		Response response = PlaylistApi.update(requestPlaylist, DataLoader.getInstance().updatePlaylistId());
		assertStatusCode(response.statusCode(), StatusCode.CODE_200);
	}
	
	
	public Item playlistBuilder(String name, String description, boolean publicValue) {
		
		return Item.builder().
				name(name).
				description(description).
				_public(publicValue).
				build();
	}
	
	public void itemAssertions(Item responsePlaylist, Item requestPlaylist) {
		assertThat(responsePlaylist.getName(), equalTo(requestPlaylist.getName()));
		assertThat(responsePlaylist.getDescription(), equalTo(requestPlaylist.getDescription()));
		assertThat(responsePlaylist.get_public(), equalTo(requestPlaylist.get_public()));
	}
	
	public void assertStatusCode(int actualStatusCode, StatusCode statusCode) {
		assertThat(actualStatusCode, equalTo(statusCode.code));
	}
	
}
