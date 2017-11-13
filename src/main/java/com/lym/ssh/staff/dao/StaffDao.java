package com.lym.ssh.staff.dao;

import com.lym.ssh.base.BaseDao;
import com.lym.ssh.staff.domain.Staff;

/**
 * Created by dllo on 17/11/13.
 */
public interface StaffDao extends BaseDao<Staff> {

    boolean login(Staff staff);

}
