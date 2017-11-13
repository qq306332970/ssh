package com.lym.ssh.staff.dao.impl;

import com.lym.ssh.staff.dao.StaffDao;
import com.lym.ssh.staff.domain.Staff;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dllo on 17/11/13.
 */
public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao{
    @Override
    public boolean login(Staff staff) {
        List<Staff> staffs = getHibernateTemplate().findByExample(staff);
        System.out.println(staffs);
        if (staffs != null && staffs.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void save(Staff staff) {
        getHibernateTemplate().save(staff);
    }

    @Override
    public boolean update(Staff staff) {

        return true;
    }

    @Override
    public boolean delete(Staff staff) {
        staff.setStaffId(1);
        getHibernateTemplate().delete(staff);
        return true;
    }

    @Override
    public boolean saveOrUpdate(Staff staff) {
        return true;
    }

    @Override
    public Staff findById(Serializable id) {
        getHibernateTemplate().find("from Staff crm_staff where staffId = ?");
        return null;
    }

    @Override
    public List<Staff> findAll() {
        List<Staff> list = (List<Staff>) getHibernateTemplate().find("from Staff T_STAFF");
        return list;
    }

    @Override
    public List<Staff> findAll(String condition, Object... params) {
        return null;
    }

    @Override
    public int getTotalrecord(String condition, Object[] params) {
        return 0;
    }
}
