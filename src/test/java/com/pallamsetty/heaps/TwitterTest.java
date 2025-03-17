package com.pallamsetty.heaps;

import com.pallamsetty.heaps.helpers.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TwitterTest {
    private final Twitter twitter;

    public TwitterTest() {
        twitter = new Twitter();
    }

    @Test
    public void testTwitter1() {
        twitter.postTweet(1, 5);
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        List<Integer> actual = twitter.getNewsFeed(1);

        Assertions.assertLists(expected, actual);

        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        expected = new ArrayList<>();
        expected.add(6);
        expected.add(5);
        actual = twitter.getNewsFeed(1);

        Assertions.assertLists(expected, actual);

        twitter.unfollow(1, 2);
        expected = new ArrayList<>();
        expected.add(5);
        actual = twitter.getNewsFeed(1);

        Assertions.assertLists(expected, actual);
    }
}
