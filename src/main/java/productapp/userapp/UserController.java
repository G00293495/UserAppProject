package productapp.userapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/register")
    public String registerUser(@RequestBody String userInfo) {
        return "User registered: " + userInfo;
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody String loginInfo) {
        return "User logged in: " + loginInfo;
    }

    @GetMapping("/{userId}")
    public String getUserProfile(@PathVariable Long userId) {
        return "User profile for ID " + userId;
    }
}
