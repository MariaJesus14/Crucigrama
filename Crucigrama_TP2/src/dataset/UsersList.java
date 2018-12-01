/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataset;

import java.io.Serializable;
import model.User;

/**
 *
 * @author Usuario
 */
public class UsersList implements Serializable{
    private User [] vecUser;
    private int count;

    public UsersList() {
        vecUser= new User [100];
    }

    public UsersList(User[] vecUser, int count) {
        this.vecUser = vecUser;
        this.count = count;
    }

    public User[] getVecUser() {
        return vecUser;
    }

    public void setVecUser(User[] vecUser) {
        this.vecUser = vecUser;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
        public int getSize() {
        return count;
    }

    public User getStudent(int index) {
        return vecUser[index];
    }

    public void addStudent(User student) {
        vecUser[count++] = student;
    }

    public String getListString() {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += vecUser[i] + "\n";
        }
        return text;
    }
    
    
}
