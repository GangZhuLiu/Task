package model;

public class user {
    private int id;
    private String username;
    private int password;
    public user(){}
    public user(int id){}
    public user(String username,int password){
        this.username = username;
        this.password = password;
    }
    public user(int id, String username,int password){
        this.id = id;
        this.password = password;
        this.username = username;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password=" + password +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
