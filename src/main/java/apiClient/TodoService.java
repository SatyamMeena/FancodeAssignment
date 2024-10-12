package apiClient;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoService {

    public TodoService() {
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com/";
    }

    public Map<Integer, Double> getUserTaskCompletionPercentage(List<Integer> userIds) {
        Response response = RestAssured.get("todos/");
        JSONArray todosArray = new JSONArray(response.asString());

        Map<Integer, Integer> totalTasksMap = new HashMap<>();
        Map<Integer, Integer> completedTasksMap = new HashMap<>();

        // Loop through all todos to find task data for relevant users
        for (int i = 0; i < todosArray.length(); i++) {
            JSONObject todo = todosArray.getJSONObject(i);
            int userId = todo.getInt("userId");

            // Only process if userId is in the list of FanCode users
            if (userIds.contains(userId)) {
                totalTasksMap.put(userId, totalTasksMap.getOrDefault(userId, 0) + 1);
                if (todo.getBoolean("completed")) {
                    completedTasksMap.put(userId, completedTasksMap.getOrDefault(userId, 0) + 1);
                }
            }
        }

        // Calculate completion percentages
        Map<Integer, Double> completionPercentages = new HashMap<>();
        for (Integer userId : userIds) {
            int totalTasks = totalTasksMap.getOrDefault(userId, 0);
            int completedTasks = completedTasksMap.getOrDefault(userId, 0);
            double percentage = (totalTasks > 0) ? (completedTasks * 100.0 / totalTasks) : 0;
            completionPercentages.put(userId, percentage);
        }
        return completionPercentages;
    }
}
