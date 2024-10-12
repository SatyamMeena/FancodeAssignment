import apiClient.UserService;
import apiClient.TodoService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class TodoTestCase {

    @Test
    public void testFanCodeUserTaskCompletion() {
 
        UserService userService = new UserService();
        List<Integer> fanCodeUsers = userService.getFanCodeUsers();


        TodoService todoService = new TodoService();
        Map<Integer, Double> completionPercentages = todoService.getUserTaskCompletionPercentage(fanCodeUsers);

        for (Map.Entry<Integer, Double> entry : completionPercentages.entrySet()) {
            int userId = entry.getKey();
            double completionPercentage = entry.getValue();
            System.out.println("User ID: " + userId + " - Task Completion: " + completionPercentage + "%");
            Assert.assertTrue(completionPercentage > 50, "User " + userId + " has not completed more than 50% tasks.");
        }
    }
}
