package com.example.portfoliosomesh.Repository;

import com.example.portfoliosomesh.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
