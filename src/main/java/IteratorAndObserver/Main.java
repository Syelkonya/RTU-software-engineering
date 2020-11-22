package IteratorAndObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    private static Logger firstUserLogger= LoggerFactory.getLogger("first_user");
    private static Logger secondUserLogger = LoggerFactory.getLogger("second_user");
    private static List<User> userList;
    static PostAddListener postAddListener;
    static PostIterator postIterator;

    public static void main(String[] args) throws InterruptedException {
        userList = new ArrayList<>();


        Group groupVK = new Group();
        groupVK.posts = returnPosts();
        postIterator = new PostIterator(groupVK.posts);


        User firstUser = new User("Первый", firstUserLogger);
        User secondUser = new User("Второй", secondUserLogger);

        userList.add(firstUser);
        userList.add(secondUser);

        postAddListener = new PostAddListener(groupVK.posts,userList,groupVK.posts.size());
        logToUserFile();


        groupVK.addPost(new Post("УРЛЛЛЛЛЛЛА", "Модный текст"));
        //Листенер должен ловить изменение
    }

    private static void logToUserFile(){
        for (User user: userList) {
            if (user.subscribed) {
                while (postIterator.hasNext()){
                    Post currentPost = postIterator.getNext();
                    user.logger.info((currentPost.text + "  " +  currentPost.imageUrl));
                }
            }
        }
    }

    private static List<Post> returnPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(
                "https://www.off-road-light.ru/images/detailed/2/2PT010458761_13_tvcn-9k.jpg",
                "МОДНАЯ ФЕРРАРИ"));
        posts.add(new Post(
                "https://img3.goodfon.ru/original/1920x1440/d/22/car-wallpapers-yellow-mclaren.jpg",
                "макларен"));
        posts.add(new Post(
                "http://img.crazys.info/files/i/2013.3.30/0kuzovov-avtomobilnyh.jpg",
                "форд фокус"));
        return posts;
    }


}
