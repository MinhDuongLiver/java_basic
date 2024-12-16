package Leson8_Arraylist.TiktokCupPackage.entities;

import java.util.ArrayList;

public class Idol extends Person{
    private ArrayList<Follower> followers = new ArrayList<>();
    private String group;

    public Idol(String name, int id, String email, int followers, String group) {
        super(name, id, email);
        this.followers = followers;
        this.group = group;
    }

    public int getFollowers() {

        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}
