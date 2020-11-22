package IteratorAndObserver;

import java.util.ArrayList;
import java.util.List;

import static IteratorAndObserver.Main.postAddListener;

public class Group {
    List<Post> posts = new ArrayList();


    public void addPost(Post post) throws InterruptedException {
        posts.add(post);
        Thread.sleep(5_000);
        postAddListener.update(posts);
    }
}
