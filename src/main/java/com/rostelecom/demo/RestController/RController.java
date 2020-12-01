package com.rostelecom.demo.RestController;



import com.rostelecom.demo.Service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Artem Maximov
 * It`s simple REST controller
 */

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@Log
public class RController {
    private final UserService userService;

    @PostMapping("/save")
    public Object saveUser (@RequestBody Object jsonObject)  {
    log.info("Обработка сохранения пользователя..."  +jsonObject);
        System.out.println("jsonObject");
        return userService.saveUser(jsonObject);
    }
}
