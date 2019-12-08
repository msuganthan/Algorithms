package com.suganthan.inteviews;

import java.util.*;

/**
 * Created by msuganthan on 7/9/19.
 */
public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
        Collection<Friend> friends = this.getFriends();
        if (friends.isEmpty())
            return false;

        if (friends.stream()
                .anyMatch(f -> f.getEmail().equals(friend.getEmail())))
            return false;

        while (!friends.isEmpty()) {
            for (Friend f : friends) {
                if (f.getEmail().equals(friend.getEmail()))
                    return true;
            }
            friends = friend.getFriends();
        }
        return false;
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");
        Friend d = new Friend("D");
        Friend e = new Friend("E");
        Friend f = new Friend("F");
        Friend g = new Friend("G");
        Friend h = new Friend("H");
        Friend i = new Friend("I");
        Friend j = new Friend("J");
        Friend k = new Friend("K");
        Friend l = new Friend("L");

        a.addFriendship(b);
        b.addFriendship(l);
        l.addFriendship(k);
        a.addFriendship(c);

        System.out.println(a.canBeConnected(k));
    }
}