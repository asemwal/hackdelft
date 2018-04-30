package com.tnt.planner.bean;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.simple.parser.JSONParser;

public class Request {
	private final String url = "http://172.16.2.156:80/" ;
	//private final String url = "http://localhost:4004/" ;
	private StringBuffer jsonString  = new StringBuffer("");
	public void generateRequest(String type , String fromCity , String toCity , String inDate , String outDate ) {
		String jsonString = "";
		StringBuffer hotel = new StringBuffer("0");
		StringBuffer flight= new StringBuffer("0");
		StringBuffer activity = new StringBuffer("0");
		System.out.println(fromCity);
		System.out.println(toCity);
		System.out.println(inDate);
		System.out.println(outDate);
		try {
			jsonString = new JSONObject()
					.put("type", type)
					.put("from_city", fromCity)
					.put("to_city", toCity)
					.put("from_date", inDate)
					.put("to_date",outDate).toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			this.jsonString.replace(0, this.jsonString.length(), jsonString);
		}


	}
	public static void main(String[] args) throws ParseException, IOException {
		Request r = new Request();
		r.generateRequest("H", "PARIS","AMSTERDAM","2018-05-01","2018-05-01");
		System.out.println(r.jsonString.toString());
		//r.sendRequest();

	}

	@SuppressWarnings("finally")
	public ArrayList<Hotel> sendRequestHotel(String type) {
		HttpClient client = new DefaultHttpClient();
		ArrayList<Hotel> hotel = new ArrayList<>();
		Hotel h;
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 10000); //Timeout Limit
		HttpResponse response;
		StringBuffer rString = new StringBuffer("");
		JSONObject json = new JSONObject();
		String x = "" ;
		try {
			HttpPost post = new HttpPost(this.url);
			StringEntity se = new StringEntity(this.jsonString.toString());
			System.out.println(this.jsonString.toString());
			se.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
			post.setEntity(se);
			response = client.execute(post);

			/*Checking response */
			if (response != null) {
				InputStream in = response.getEntity().getContent(); //Get the data in the entity
				BufferedReader br = new BufferedReader (new InputStreamReader(in));

				while(((x = br.readLine() ) != null)) {
					//System.out.print((char)x);
					h = new Hotel();
					System.out.println(x);
					h.setHotelName(new StringBuffer(x.split("\\|")[0]));
					h.setPrice(Float.parseFloat(x.split("\\|")[1]));
					Review r = new Review();
					r.setScore(Float.parseFloat(x.split("\\|")[2]));
					h.setReview(r);
					hotel.add(h);
				}
			}
			//System.out.println(rString.toString().substring(1, rString.toString().length()-2));

		} catch (Exception e) {
			e.printStackTrace();
			//sendRequest();
			// showMessage("Error", "Cannot Estabilish Connection");
		}

		finally{
			return hotel;
		}

	}

	public ArrayList<TravelItenary> sendRequestFlight(String type) {
		HttpClient client = new DefaultHttpClient();
		ArrayList<TravelItenary> Travel = new ArrayList<>();
		TravelItenary t;
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 10000); //Timeout Limit
		HttpResponse response;
		StringBuffer rString = new StringBuffer("");
		JSONObject json = new JSONObject();
		Location from = null;
		Location to = null;
		Duration duration = null;
		String x = "" ;
		try {
			HttpPost post = new HttpPost(this.url);
			StringEntity se = new StringEntity(this.jsonString.toString());
			System.out.println(this.jsonString.toString());
			se.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
			post.setEntity(se);
			response = client.execute(post);

			/*Checking response */
			if (response != null) {
				InputStream in = response.getEntity().getContent(); //Get the data in the entity
				BufferedReader br = new BufferedReader (new InputStreamReader(in));

				while(((x = br.readLine() ) != null)) {
					//System.out.print((char)x);
					t = new TravelItenary();
					from = new Location();
					from.setCity(new StringBuffer(city));
					to = new Location();
					to.setCity(new StringBuffer(city));
					t.setFrom(from);
					t.setTo(to);
					t.setCost(cost);
					duration = new Duration();
					duration.setStartTime(startTime);
					duration.setEndTime(endTime);
					t.setDuration(duration);
					Travel.add(t);
				}
			}
			//System.out.println(rString.toString().substring(1, rString.toString().length()-2));

		} catch (Exception e) {
			e.printStackTrace();
		}
		//sendRequest();
		// showMessage("Error", "Cannot Estabilish Connection");


		return Travel;
	}
	public ArrayList<Activity> sendRequestActivity(String type) {
		HttpClient client = new DefaultHttpClient();
		ArrayList<Activity> Acti = new ArrayList<>();
		Activity a;
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 10000); //Timeout Limit
		HttpResponse response;
		StringBuffer rString = new StringBuffer("");
		JSONObject json = new JSONObject();
		Location from = null;
		Location to = null;
		Duration duration = null;
		String x = "" ;
		try {
			HttpPost post = new HttpPost(this.url);
			StringEntity se = new StringEntity(this.jsonString.toString());
			System.out.println(this.jsonString.toString());
			se.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
			post.setEntity(se);
			response = client.execute(post);

			/*Checking response */
			if (response != null) {
				InputStream in = response.getEntity().getContent(); //Get the data in the entity
				BufferedReader br = new BufferedReader (new InputStreamReader(in));

				while(((x = br.readLine() ) != null)) {
					//System.out.print((char)x);
					a = new Activity();
					a.setActivity(activity);
					a.setCost(cost);
					Acti.add(a);
				}
			}
			//System.out.println(rString.toString().substring(1, rString.toString().length()-2));

		} catch (Exception e) {
		e.printStackTrace();
		}
		//sendRequest();
		// showMessage("Error", "Cannot Estabilish Connection");
		finally{
			return Acti;
		}

	}


}
