package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.TweetName;
import com.springboot.web.repo.TweetRepository;

@Controller
public class TweetController {

	@Autowired
	private TweetRepository tweetrepo;
	
	@GetMapping("/newTweet")
	@ResponseBody 
    public String addNewTweet(@RequestParam String hashtag, @RequestParam String tweet) {
        
		TweetName tn = new TweetName();
		tn.setHashtag(hashtag);
		tn.setTweet(tweet);
		tweetrepo.save(tn);
		
		return "Saved";
    }
	
	@GetMapping("/fetchTweets")
	@ResponseBody 
    public List<TweetName> getTweets(@RequestParam String hashtag, ModelMap model) {
        
		//model.put("hashtag", tweetrepo.findByHashtag(hashtag));
		return tweetrepo.findByHashtag(hashtag);
    }
}
