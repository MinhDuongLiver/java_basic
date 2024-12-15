package Leson8_Arraylist.TiktokCupPackage.Service;

import Leson8_Arraylist.TiktokCupPackage.entities.Follower;
import Leson8_Arraylist.TiktokCupPackage.entities.Idol;
import Leson8_Arraylist.TiktokCupPackage.entities.Song;

import java.util.ArrayList;

public class TiktokService {
    private static ArrayList<Idol> idols = new ArrayList<>();
    private static ArrayList<Song> songs = new ArrayList<>();
    private  ArrayList<Follower> followers = new ArrayList<>();

    //them idol
    public static void addIdol(Idol idol){
        idols.add(idol);
    }

    //them song
    public static void addSong(Song song){
        songs.add(song);
    }

    //them follower
    private void addfollwer(Follower follower){
        followers.add(follower);
    }

    //hien thi thong tin chi tiet
    public void display() {
        System.out.println("Idol");
        for (Idol idol:idols){
            System.out.println(idol);
        }
        System.out.println("Song");
        for (Song song:songs){
            System.out.println(song);
        }
        System.out.println("follow");
        for (Follower follower:followers){
            System.out.println(follower);
        }
    }

    public static void addFollower(int follower) {
    }
}
