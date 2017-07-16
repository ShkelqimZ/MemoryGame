package com.example.pc.memory_test;

/**
 * Created by PC on 7/2/2017.
 */

public class clsResults {

    Integer ID;
    String Username,Score;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public clsResults(Integer ID, String username, String score) {
        this.ID = ID;
        Username = username;
        Score = score;
    }
}
