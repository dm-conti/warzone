package it.tmp.spring.spring_data_mysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.tmp.spring.spring_data_mysql.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
