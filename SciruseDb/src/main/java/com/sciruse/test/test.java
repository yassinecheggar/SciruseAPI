package com.sciruse.test;

import java.io.IOException;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class test {

	
private final static OkHttpClient httpClient = new OkHttpClient();
	
	private String API_Key="94327dc22a17d2c12b806d241682cd96";
	
	public static void main(String[] args) {
		
		try {
			Movies("https://api.themoviedb.org/3/movie/popular?api_key=94327dc22a17d2c12b806d241682cd96&language=en-US&page=1");
		}catch (Exception e) {}

	}
	
	public static  JSONObject GetMyJson(String url) throws IOException {
		JSONObject object;
		Request request = new Request.Builder()
				.url(url)
				.build();

		try (Response response = httpClient.newCall(request).execute()) {

			if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

			 object = new JSONObject(response.body().string());
		}
				return object;
	}
	
	public static  void Movies(String url) throws IOException {

			JSONObject object = GetMyJson(url);
			JSONArray obj = object.getJSONArray("results");
			Iterator<String> keyList = object.keys();
			
			System.out.println(obj.toString());
			while (keyList.hasNext()){
			     String key = keyList.next();
			     System.out.println(key);
			}
			System.out.println(obj.length());
			
		}

	public static  void Comment(String url) throws IOException {

		JSONObject object = GetMyJson(url);
		JSONArray obj = object.getJSONArray("results");
		Iterator<String> keyList = object.keys();
		
		System.out.println(obj.toString());
		while (keyList.hasNext()){
		     String key = keyList.next();
		     System.out.println(key);
		}
		System.out.println(obj.length());
		
	}
}
