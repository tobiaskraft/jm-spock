package de.jm;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TweetController {

    @Autowired
    private TweetService tweetService;

    public List<Tweet> fetchAll() {
        List<Tweet> tweets = tweetService.getAll();
        return tweets;
    }

    public Tweet store(String msg) {
        Tweet tweet = tweetService.save(msg);
        return tweet;
    }

    public List<Tweet> bulkStore(List<String> messages) {
        List<Tweet> tweets = new ArrayList();
        for (String msg : messages) {
            Tweet tweet = tweetService.save(msg);
            tweets.add(tweet);
        }
        return tweets;
    }

}
