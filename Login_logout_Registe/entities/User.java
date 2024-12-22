package Lesson10.Login_logout_Registe.entities;

public class User {
    private String userName;
    private String email;
    private String passworld;

    public User(String userName, String email, String passworld) {
        this.userName = userName;
        this.email = email;
        this.passworld = passworld;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", passworld='" + passworld + '\'' +
                '}';
    }
}
