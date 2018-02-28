package com.springboot.web.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.model.TweetName;

@Repository
public interface TweetRepository extends JpaRepository<TweetName, Long>{

	List<TweetName> findByHashtag(String hashtag);
}
