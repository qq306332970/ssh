package com.lym.ssh.crm.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 17/11/2.
 */
public class Post {

    private int postId;
    private String postName;

    private Department dept;
    private Set<Staff> staffs = new HashSet<Staff>();

    public Post() {
    }

    public Post(int postId, String postName) {
        this.postId = postId;
        this.postName = postName;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postName='" + postName + '\'' +
                '}';
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Set<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(Set<Staff> staffs) {
        this.staffs = staffs;
    }
}
