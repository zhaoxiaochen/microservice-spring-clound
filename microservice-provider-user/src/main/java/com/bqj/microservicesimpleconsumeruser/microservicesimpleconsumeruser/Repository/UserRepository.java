package com.bqj.microservicesimpleconsumeruser.microservicesimpleconsumeruser.Repository;

import com.bqj.microservicesimpleconsumeruser.microservicesimpleconsumeruser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}
