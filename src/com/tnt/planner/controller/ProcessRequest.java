package com.tnt.planner.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;

import com.tnt.planner.bean.Activity;
import com.tnt.planner.bean.Hotel;
import com.tnt.planner.bean.Request;
import com.tnt.planner.bean.ResultsBean;
import com.tnt.planner.bean.TravelItenary;

public class ProcessRequest {
	public ArrayList<Object> processRequest(HttpServletRequest request) {
		ArrayList<Object> response = new ArrayList<>();
		Request r = new Request();
		r.generateRequest("H", request.getParameter("fromCity"), 
    			request.getParameter("toCity"), 
    			request.getParameter("fromDate"), 
    			request.getParameter("toDate")
    			);
		ArrayList<Hotel> hotel = r.sendRequestHotel("H");
    	 r.generateRequest("F", request.getParameter("fromCity"), 
    			request.getParameter("toCity"), 
    			request.getParameter("fromDate"), 
    			request.getParameter("toDate")
    			);
 		/*ArrayList<TravelItenary> flight = r.sendRequestFlight("F");
    	r.generateRequest("A", request.getParameter("fromCity"), 
    			request.getParameter("toCity"), 
    			request.getParameter("fromDate"), 
    			request.getParameter("toDate")
    			);
		ArrayList<Activity> activity = r.sendRequestActivity("A");
		response.add(flight);*/
		response.add(hotel);
//		response.add(activity);
		return response;
	}
	
	public ResultsBean processResults(Request req) {


		return null;

	}
	public ArrayList<Hotel> processHotel(){

		return null;
	}

	public ArrayList<TravelItenary> processTravel(){

		return null;
	}

	public ArrayList<Activity> processActivities(){

		return null;
	}


}
