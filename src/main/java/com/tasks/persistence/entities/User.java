package com.tasks.persistence.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  fullname;
    private String  username;
    private String   gender;
    private String  email;
    private String  password;
    private String  phone;
    private String  cellphone;
    @Column(name = "profile_picture")
    private String  profilePicture;
    private Short   role;
    @OneToMany(mappedBy = "user")
    private List<Comment> comments;
    @OneToOne(mappedBy = "leader")
    private Team ownerOf;
    @OneToMany(mappedBy = "team")
    private List<UserTeam> teams;
    @OneToMany(mappedBy = "task")
    private List<UserTask> tasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Short getRole() {
        return role;
    }

    public void setRole(Short role) {
        this.role = role;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Team getOwnerOf() {
        return ownerOf;
    }

    public void setOwnerOf(Team ownerOf) {
        this.ownerOf = ownerOf;
    }

    public List<UserTeam> getTeams() {
        return teams;
    }

    public void setTeams(List<UserTeam> teams) {
        this.teams = teams;
    }

    public List<UserTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<UserTask> tasks) {
        this.tasks = tasks;
    }
}
