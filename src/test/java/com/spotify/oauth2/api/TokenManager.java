package com.spotify.oauth2.api;

import java.time.Instant;
import java.util.HashMap;
import com.spotify.oauth2.applicationApi.RestResource;
import com.spotify.oauth2.utils.ConfigLoader;

import io.restassured.response.Response;

public class TokenManager extends SpecBuilder{
	
	private static String access_token;
	private static Instant expiry_time;
	
	public static String getToken() {
		try {
			if(access_token == null || Instant.now().isAfter(expiry_time)) {
				System.out.println("Fetching New token...");
				Response response = renewToken();
				access_token = response.path("access_token");
				int tokenExpiryInSeconds = response.path("expires_in");
				expiry_time = Instant.now().plusSeconds(tokenExpiryInSeconds - 100);
				System.out.println("Token expires at " + expiry_time);
			}
			else {
				System.out.println("Token is good to use");
			}
		}
		catch(Exception e) {
			System.out.println("Token fetching failed.");
		}
		return access_token;
	}
	
	private static Response renewToken() {
		
		HashMap<String, String> formParams = new HashMap<String, String>();
		formParams.put("grant_type", ConfigLoader.getInstance().getGrantType()); 
		formParams.put("refresh_token", ConfigLoader.getInstance().getRefreshToken());
		formParams.put("client_id", ConfigLoader.getInstance().getClientID());
		formParams.put("client_secret", ConfigLoader.getInstance().getClientSecret());
		
		Response response = RestResource.tokenApi(formParams);
		
		if (response.statusCode() != 200) {
			throw new RuntimeException("New Token fetching Failed!! Try again in sometime or check the parameters again."); 
		}
		return response;
	} 
	
}
