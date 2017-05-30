package model;

import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import controller.FileManager;
import library.IConstants;

public class JSONProcesor implements IConstants{
	private JSONArray JSONFile;
	private FileManager FileInput;
	
	public JSONProcesor(){
		FileInput = new FileManager(JSON_FILE_NAME);
	}
	
	private void loadJSONFile(){//regions
		try {
			FileInput.openFile();
			Thread.sleep(1000);
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(FileInput.getFr());
			JSONObject jsonObject = (JSONObject) obj;
			
			long name = (long) jsonObject.get("height");
            System.out.println("nombre:" + name);
			
            JSONArray FragmentsArray = (JSONArray) jsonObject.get("fragments");
            JSONObject EventsObject = (JSONObject) FragmentsArray.get(4);
            JSONArray EventsArray = (JSONArray) EventsObject.get("events");
            
            System.out.println(EventsArray.size());
			
			FileInput.closeFile();
		} catch (IOException | ParseException | InterruptedException e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
    }
	
	public void extractInfo(){
		loadJSONFile();
		//for (Object objet : JSONFile) {
			
		//}
	}	
}
