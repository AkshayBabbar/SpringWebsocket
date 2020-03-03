package com.example.SpringWebsocketDemo;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;


@Controller
public class UserController {
    @MessageMapping("/hello")
    @SendTo("/topic/userResponse")
    public UserResponse userResponse(User user) throws Exception {
        return new UserResponse(HtmlUtils.htmlEscape(user.getName()));
    }
}
