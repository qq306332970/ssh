package com.lym.ssh.crm.dao.impl;

import com.lym.ssh.crm.dao.HomeDao;
import com.lym.ssh.crm.domain.Department;
import com.lym.ssh.crm.domain.Post;
import com.lym.ssh.crm.domain.Staff;
import com.lym.ssh.crm.utils.QueryUtil;

import java.util.List;

/**
 * Created by dllo on 17/11/13.
 */
public class HomeDaoIpml implements HomeDao {
    @Override
    public List<Department> getDepartments() {
        return QueryUtil.findAll(Department.class);
    }

    @Override
    public List<Post> getPostByDeptId(int deptId) {
        return QueryUtil.queryByEqual(Post.class,"dept",deptId);
    }

    @Override
    public List<Staff> getStaffByDeptIdAndPostId(int deptId, int postId) {
        String[] fields = {"dept","post"};
        Object[] values = {deptId,postId};
        return QueryUtil.queryByEquals(Staff.class,fields,values);
    }

    @Override
    public List<Staff> getStaffByDeptId(int deptId) {
        return QueryUtil.queryByEqual(Staff.class,"dept",deptId);
    }

    @Override
    public List<Staff> getStaffs() {
        return QueryUtil.findAll(Staff.class);
    }
}
