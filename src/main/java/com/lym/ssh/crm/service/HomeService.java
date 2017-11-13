package com.lym.ssh.crm.service;

import com.lym.ssh.crm.domain.Department;
import com.lym.ssh.crm.domain.Post;
import com.lym.ssh.crm.domain.Staff;

import java.util.List;

/**
 * Created by dllo on 17/11/13.
 */
public interface HomeService {

    List<Department> getDepartments();


    List<Post> getPostByDeptId(int deptId);


    List<Staff> getStaffByDeptIdAndPostId(int deptId, int postId);


    List<Staff> getStaffByDeptId(int deptId);



    List<Staff> getStaffs();
    
}
