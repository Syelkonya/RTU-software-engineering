package IteratorAndObserver;

import org.slf4j.Logger;

public class User {
    String nickname;
    Logger logger;
    boolean subscribed;

    public User(String nickname, Logger logger) {
        this.nickname = nickname;
        this.logger = logger;
        subscribed = true;
    }
}
