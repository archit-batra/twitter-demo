package com.springboot.web.model;

import javax.persistence.*;

@Entity
public class TweetName {
	
		private Long id;
		private String hashtag;
		private String tweet;
		
	    @Id 
	    @GeneratedValue(strategy = GenerationType.AUTO) 
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getHashtag() {
			return hashtag;
		}
		public void setHashtag(String hashtag) {
			this.hashtag = hashtag;
		}
		public String getTweet() {
			return tweet;
		}
		public void setTweet(String tweet) {
			this.tweet = tweet;
		}
	    

}
