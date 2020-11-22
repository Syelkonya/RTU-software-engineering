package IteratorAndObserver;

import java.util.ArrayList;
import java.util.List;

import static IteratorAndObserver.Main.postIterator;

public class PostAddListener {
    List<Post> posts;
    List<User> users;
    int size;

    public PostAddListener(List<Post> posts, List<User> users, int size) {
        this.posts = posts;
        this.users = users;
        this.size = size;
    }


    public void update(List<Post> posts){
        if (posts.size() > size)
            for (User user: users) {
                if (user.subscribed) {
                    user.logger.info("\n///////////////////UPDATING///////////////////////");
                    while (postIterator.hasNext()){
                        Post currentPost = postIterator.getNext();
                        user.logger.info((currentPost.text + "  " +  currentPost.imageUrl));
                    }
                }
            }

    }
}
