package com.lym.ssh.crm.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 17/11/2.
 */
public class Department {

    private int deptId;
    private String depName;
    //部门的职位
    private Set<Staff> posts = new HashSet<Staff>();
    //部门的员工
    private Set<Post> staffs = new HashSet<Post>();


    public Department() {
    }

    public Department(String depName) {
        this.depName = depName;
    }

    public Department(int deptId, String depName) {
        this.deptId = deptId;
        this.depName = depName;
    }


    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", depName='" + depName + '\'' +
                '}';
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Set<Staff> getPosts() {
        return posts;
    }

    public void setPosts(Set<Staff> posts) {
        this.posts = posts;
    }

    public Set<Post> getStaffs() {
        return staffs;
    }

    public void setStaffs(Set<Post> staffs) {
        this.staffs = staffs;
    }
}
