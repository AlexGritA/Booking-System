package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;
    private String name;
    @Column(unique = true)
    private String username;
    private String password;
    @Column(unique = true)
    private String email;
    private int phoneNumber;
    private int cardNumber;

    public User () {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(int newCardNumber) {
        this.cardNumber = newCardNumber;
    }

}























