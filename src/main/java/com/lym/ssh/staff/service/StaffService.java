package com.lym.ssh.staff.service;

import com.lym.ssh.staff.domain.Staff;
import com.lym.ssh.base.BaseDao;

/**
 * Created by dllo on 17/11/13.
 */
public interface StaffService extends BaseDao<Staff>{

    boolean login(Staff staff);

}
