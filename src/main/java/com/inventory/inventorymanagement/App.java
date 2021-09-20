package com.inventory.inventorymanagement;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class App 
{
    public static void main( String[] args )
    {
             //First object details
   	      JSONObject  jsonObjectDetails1 = new JSONObject();
   	      jsonObjectDetails1.put("name", "rice");
   	      jsonObjectDetails1.put("weight", "10");
   	      jsonObjectDetails1.put("pricePerKg", "50");
        
	       JSONObject jsonObject1 = new JSONObject(); 
	       jsonObject1.put("Food", jsonObjectDetails1);
        
	       //Second food details
	       JSONObject jsonObjectDetails2 = new JSONObject();
	       jsonObjectDetails2.put("name", "wheat");
	       jsonObjectDetails2.put("weight", "20");
	       jsonObjectDetails2.put("pricePerKg", "60");
	        
	       JSONObject jsonObject2 = new JSONObject(); 
	       jsonObject2.put("Food", jsonObjectDetails2);
	       
	       //Second food details
	       JSONObject jsonObjectDetails3 = new JSONObject();
	       jsonObjectDetails3.put("name", "pulses");
	       jsonObjectDetails3.put("weight", "30");
	       jsonObjectDetails3.put("pricePerKg", "70");
	        
	       JSONObject jsonObject3 = new JSONObject(); 
	       jsonObject3.put("Food", jsonObjectDetails3);
	        
	       //Add food item to list
	       JSONArray inventoryDataList = new JSONArray();
	       inventoryDataList.put(jsonObject1);
	       inventoryDataList.put(jsonObject2);
	       inventoryDataList.put(jsonObject3);
        
    	    try {
    	         FileWriter file = new FileWriter("E:/inventorymanagement/src/main/java/com/inventory/inventorymanagement/app.json");
    	         file.write(inventoryDataList.toString());
    	         file.close();
    	      } catch (IOException e) {
    	         // TODO Auto-generated catch block
    	         e.printStackTrace();
    	      }
    	    
    	      System.out.println("JSON file created: "+inventoryDataList);
    	   }
}
