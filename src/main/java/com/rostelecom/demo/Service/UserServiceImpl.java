package com.rostelecom.demo.Service;

import com.rostelecom.demo.JsonHelper.JsonConverter;
import com.rostelecom.demo.Model.User;
import com.rostelecom.demo.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Artem Maximov
 *implementation of UserService
 */

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public User saveUser(Object jsonObject){
        JsonConverter jsonConverter = new JsonConverter();
        User user = new User();
        user.setId(jsonConverter.getIDByKey(jsonObject));
        user.setJson_column(jsonConverter.getJsonString(jsonObject));
        return userRepository.save(user);
    }
}
