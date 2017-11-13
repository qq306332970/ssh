package com.lym.ssh.crm.domain;

/**
 * Created by dllo on 17/11/2.
 */
public class Staff {

    private int staffId;
    private String staffName;
    private String gender;
    private String onDutyDate;

    private Department dept;
    private Post post;

    public Staff() {
    }

    public Staff(int staffId, String staffName, String gender, String onDutyDate) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.gender = gender;
        this.onDutyDate = onDutyDate;
    }

    public Staff(String staffName, String gender, String onDutyDate) {
        this.staffName = staffName;
        this.gender = gender;
        this.onDutyDate = onDutyDate;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(String onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {

        this.post = post;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
}
