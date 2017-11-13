package com.lym.ssh.crm.service.impl;

import com.lym.ssh.crm.dao.HomeDao;
import com.lym.ssh.crm.dao.impl.HomeDaoIpml;
import com.lym.ssh.crm.domain.Department;
import com.lym.ssh.crm.domain.Post;
import com.lym.ssh.crm.domain.Staff;
import com.lym.ssh.crm.service.HomeService;

import java.util.List;

/**
 * Created by dllo on 17/11/13.
 */
public class HomeServiceImpl implements HomeService {
    
    private HomeDao homeDao;

    public HomeServiceImpl() {
        homeDao = new HomeDaoIpml();
    }

    @Override
    public List<Department> getDepartments() {
        return homeDao.getDepartments();
    }

    @Override
    public List<Post> getPostByDeptId(int deptId) {
        return homeDao.getPostByDeptId(deptId);
    }

    @Override
    public List<Staff> getStaffByDeptIdAndPostId(int deptId, int postId) {
        return homeDao.getStaffByDeptIdAndPostId(deptId,postId);
    }

    @Override
    public List<Staff> getStaffByDeptId(int deptId) {
        return homeDao.getStaffByDeptId(deptId);
    }

    @Override
    public List<Staff> getStaffs() {
        return homeDao.getStaffs();
    }
}
