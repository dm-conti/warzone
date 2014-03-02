package it.paybay.titan.rest.springdata.repositories;

import it.paybay.titan.rest.springdata.entities.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
