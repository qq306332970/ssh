package com.lym.ssh.crm.Action;

import com.lym.ssh.crm.domain.Department;
import com.lym.ssh.crm.domain.Post;
import com.lym.ssh.crm.service.HomeService;
import com.lym.ssh.crm.service.impl.HomeServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by dllo on 17/11/13.
 */
public class HomeAction extends ActionSupport {

    private HomeService service;

    private List<Department> departments;

    private int deptId;
    private List<Post> posts;

    public HomeAction() {
        service = new HomeServiceImpl();
    }

    public String home(){
        departments = service.getDepartments();
        return SUCCESS;
    }

    public String getPostByDeptId(){
        posts = service.getPostByDeptId(deptId);
        return SUCCESS;
    }

    public HomeService getService() {
        return service;
    }

    public void setService(HomeService service) {
        this.service = service;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
