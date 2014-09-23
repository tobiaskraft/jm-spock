package de.jm;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
class TweetService {
    static private List<Tweet> all = new ArrayList<Tweet>();

    static {
        all.add(new Tweet("Spock ist cool", new Date()));
        all.add(new Tweet("Geb ist auch cool", new Date()));
        all.add(new Tweet("Groovy programmieren macht Spaß", new Date()));
        all.add(new Tweet("Web-Applikationen mit Grails", new Date()));
    }

    public Tweet getRandomTweet() {
        Random r = new Random();
        int tweetNr = r.nextInt(all.size() - 1);
        return all.get(tweetNr);
    }

    public Tweet get(Integer tweetNr) {
        return all.get(tweetNr);
    }

    public List<Tweet> getAll() {
        return all;
    }

    public Tweet save(String msg) {
        Tweet t = new Tweet(msg);
        all.add(t);
        return t;
    }

}
