package com.BlogAppliction.repository;

import com.BlogAppliction.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

}
