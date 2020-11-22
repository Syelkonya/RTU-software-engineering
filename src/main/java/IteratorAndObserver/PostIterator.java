package IteratorAndObserver;

import java.util.ArrayList;
import java.util.List;

public class PostIterator {

    private int currentPosition = 0;
    private List<Post> posts;

    PostIterator(List <Post> posts){
        this.posts = posts;
    }

    public boolean hasNext() {
        return currentPosition < posts.size();
    }


    public Post getNext() {
        if (!hasNext()) {
            return null;
        }
        currentPosition++;
        return  posts.get(currentPosition-1);
    }

    public void backToBegin() {
        currentPosition = 0;
    }

}
