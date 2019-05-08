package json;

import com.google.gson.*;

public class JsonParse {

	public static void main(String[] args) {		
		JsonParser jsonParser = new JsonParser();
		JsonElement jsonElement = jsonParser.parse("{\"name\":\"Test\",\"type\":\"jdbc\",\"info\":{\"role\":\"SYSDBA\",\"SavePassword\":\"true\"}}");
		JsonObject rootObject = jsonElement.getAsJsonObject();

			String name = rootObject.get("name").getAsString();
			System.out.println("name: " + name);
			
			String type = rootObject.get("type").getAsString();
			System.out.println("type: " + type);
			
			JsonObject childObject = rootObject.getAsJsonObject("info");
			
			String role = childObject.get("role").getAsString();
			System.out.println("role: " + role);
			
			String SavePassword = childObject.get("SavePassword").getAsString();
			System.out.println("SavePassword: " + SavePassword);

		
		
	}
}