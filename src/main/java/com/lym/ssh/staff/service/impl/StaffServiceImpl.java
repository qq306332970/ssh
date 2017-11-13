package com.lym.ssh.staff.service.impl;

import com.lym.ssh.staff.dao.StaffDao;
import com.lym.ssh.staff.domain.Staff;
import com.lym.ssh.staff.service.StaffService;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by dllo on 17/11/13.
 */
public class StaffServiceImpl implements StaffService {

    @Resource
    private StaffDao staffDao;

    @Override
    public boolean login(Staff staff) {
        return staffDao.login(staff);
    }

    @Override
    public void save(Staff staff) {
        staffDao.save(staff);
    }

    @Override
    public boolean update(Staff staff) {
        return staffDao.update(staff);
    }

    @Override
    public boolean delete(Staff staff) {
        staffDao.delete(staff);
        return true;
    }

    @Override
    public boolean saveOrUpdate(Staff staff) {
        return staffDao.saveOrUpdate(staff);
    }

    @Override
    public List<Staff> findAll() {
        return staffDao.findAll();
    }

    @Override
    public Staff findById(Serializable id) {
        return null;
    }

    @Override
    public List<Staff> findAll(String condition, Object... params) {
        return null;
    }

    @Override
    public int getTotalrecord(String condition, Object[] params) {
        return 0;
    }

    public StaffDao getStaffDao() {
        return staffDao;
    }

    public void setStaffDao(StaffDao staffDao) {
        this.staffDao = staffDao;
    }
}
