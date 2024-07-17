package com.lcwd.use.service.Repositories;

import com.lcwd.use.service.Entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,String> {

    //If you want to write any custom method or query you can write here
}
