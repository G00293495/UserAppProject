package productapp.userapp;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/users")
public class UserService {
    private final Map<Long, User> users = new HashMap<>();

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        users.put(user.getUserId(), user);
        return "User registered successfully!";
    }
    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        return users.get(userId);
    }
}


