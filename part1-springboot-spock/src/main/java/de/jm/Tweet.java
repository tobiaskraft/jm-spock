package de.jm;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.util.Date;

public class Tweet {

    private String message;
    private Date created;

    public Tweet(String message) {
        this.message = message;
        this.created = new Date();
    }

    public Tweet(String message, Date created) {
        this.message = message;
        this.created = created;
    }

    private Tweet() {}

    public String getMessage() {
        return StringUtils.abbreviate(message, 20);
    }

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        return "{msg='" + message + "' created='" + df.format(created) + "'}";
    }
}
