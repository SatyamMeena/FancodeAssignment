package apiClient;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public UserService() {
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com/";
    }

    public List<Integer> getFanCodeUsers() {
        Response response = RestAssured.get("users/");
        JSONArray usersArray = new JSONArray(response.asString());

        List<Integer> fanCodeUsers = new ArrayList<>();
        for (int i = 0; i < usersArray.length(); i++) {
            JSONObject user = usersArray.getJSONObject(i);
            JSONObject address = user.getJSONObject("address");
            JSONObject geo = address.getJSONObject("geo");
            double lat = geo.getDouble("lat");
            double lng = geo.getDouble("lng");

            // Check if user belongs to FanCode city (lat: -40 to 5, long: 5 to 100)
            if (lat >= -40 && lat <= 5 && lng >= 5 && lng <= 100) {
                fanCodeUsers.add(user.getInt("id"));
            }
        }
        return fanCodeUsers;
    }
}
