/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Khizer
 */
public class editMenu {

	@SuppressWarnings("unchecked")
	public void addItem(String item, String name, int qauntity, double cost, double price) throws Exception {

		JSONParser parser = new JSONParser();

		Object obj = parser.parse(new FileReader("./Data/menuList.json"));

		JSONObject menu = (JSONObject) obj;

		JSONArray getItem = (JSONArray) menu.get(item);

		JSONObject newitem = new JSONObject();

		newitem.put("Name", name);
		newitem.put("Quantity", qauntity);
		newitem.put("Price", price);
		newitem.put("Cost", cost);

		getItem.add(newitem);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(menu);

		FileWriter file = new FileWriter("./Data/menuList.json");
		file.write(json);
		file.close();

	}

	public void readItem(String item) throws Exception {

		JSONParser parser = new JSONParser();

		Object obj = parser.parse(new FileReader("./Data/menuList.json"));

		JSONObject menu = (JSONObject) obj;

		JSONArray getItem = (JSONArray) menu.get(item);

		Object[] getItemArray = getItem.toArray();

		for (int i = 0; i < getItemArray.length; i++) {
			JSONObject itemobject = (JSONObject) getItemArray[i];

			System.out.println();
			System.out.println("Name: " + itemobject.get("Name"));
			System.out.println("Quantity: " + itemobject.get("Quantity"));
			System.out.println("Price: " + itemobject.get("Price"));
		}

//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String json = gson.toJson(getItem);
//        
//        System.out.println(json);     
	}

	public void readSubItem(String item, String subItem) throws Exception {

		JSONParser parser = new JSONParser();

		Object obj = parser.parse(new FileReader("./Data/menu.json"));

		JSONObject menu = (JSONObject) obj;

		JSONArray getItem = (JSONArray) menu.get(item);

		Object[] getItemArray = getItem.toArray();

		for (int i = 0; i < getItemArray.length; i++) {
			JSONObject itemobject = (JSONObject) getItemArray[i];

			System.out.println();
			System.out.println("Name: " + itemobject.get("Name"));
			System.out.println("Quantity: " + itemobject.get("Quantity"));
			System.out.println("Price: " + itemobject.get("Price"));
		}

//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String json = gson.toJson(getItem);
//        
//        System.out.println(json);     
	}

	public static void main(String[] args) throws Exception {
		editMenu menu = new editMenu();
//        menu.addItem("Burger","",7,7.0,9.0);
	}
}
