package com.rostelecom.demo.Repository;

import com.rostelecom.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Artem Maximov
 */
public interface UserRepository  extends JpaRepository<User, Integer> {
}
