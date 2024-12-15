package Leson8_Arraylist.TiktokCupPackage.entities;

public class Follower extends Person{
    private int numberOfLike;

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    public Follower(String name, int id, String email, int numberOfLike) {
        super(name, id, email);

    }

    @Override
    public String toString() {
        return "Follower{" +
                "numberOfLike=" + numberOfLike +
                '}';
    }
}
