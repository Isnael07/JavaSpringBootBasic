package com.isnael.spring_java_isnael.repositories;

import com.isnael.spring_java_isnael.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
