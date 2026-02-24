/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;


public class Session {
    
    private static Session instance;
    private int a_id;
    private String fullname;
    private String username;
    private String email;
    private String type;
    private String status;
    private String contact;
    private String password;
    
        private Session() {
        // Private constructor to prevent instantiation
    }

      public void clearSession(){
        a_id = 0;
        fullname = null;
        username = null;
        email = null;
        type = null;
        status = null;
        contact = null;
        password = null;
    }

    public static synchronized Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }
   
    public static boolean isInstanceEmpty() {
        return instance == null;
    }

    // Getters and Setters
    public int getA_Id() { return a_id; }
    public void setA_Id(int a_id) { this.a_id = a_id; }

    public String getFullname() { return fullname; }
    public void setFullname(String fullname) { this.fullname = fullname; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // 2. GI-FIX KINI NGA MGA METHODS (Dili na UnsupportedOperationException)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}