package IteratorAndObserver;

import java.util.ArrayList;
import java.util.List;

import static IteratorAndObserver.Main.postAddListener;

public class Group {
    List<Post> posts = new ArrayList();


    public void addPost(Post post) {
        posts.add(post);
        postAddListener.update(posts);
    }
}
