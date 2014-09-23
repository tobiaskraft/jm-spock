package de.jm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TweetRestController {

    @Autowired
    private TweetService tweetService;

    @RequestMapping("/reverseTweetMessage/{number}")
    public @ResponseBody String reverse(@PathVariable Integer number) {
        Tweet tweet = tweetService.get(number);
        String msg = tweet.getMessage();
        return new StringBuilder(msg).reverse().toString();
    }

    @RequestMapping("/randomTweet")
    public @ResponseBody Tweet random() {
        Tweet tweet = tweetService.getRandomTweet();
        return tweet;
    }

    @RequestMapping("/storeTweet/{msg}")
    public @ResponseBody Tweet store(@PathVariable String msg) {
        Tweet tweet = tweetService.save(msg);
        return tweet;
    }
}
