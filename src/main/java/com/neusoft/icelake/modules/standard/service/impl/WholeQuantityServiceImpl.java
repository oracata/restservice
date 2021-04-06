package com.neusoft.icelake.modules.standard.service.impl;

import java.util.List;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.icelake.modules.standard.dao.IWholeQuantityDao;
import com.neusoft.icelake.modules.standard.entity.Emp;
import com.neusoft.icelake.modules.standard.entity.Emps;
import com.neusoft.icelake.modules.standard.entity.Org;
import com.neusoft.icelake.modules.standard.entity.Orgs;
import com.neusoft.icelake.modules.standard.service.IWholeQuantityService;

@Named("wholeQuantityService")
public class WholeQuantityServiceImpl implements IWholeQuantityService {
    private IWholeQuantityDao wholeQuantityDao;

    public IWholeQuantityDao getWholeQuantityDao() {
        return wholeQuantityDao;
    }

    @Autowired
    public void setWholeQuantityDao(IWholeQuantityDao wholeQuantityDao) {
        this.wholeQuantityDao = wholeQuantityDao;
    }

    @Override
    public Orgs getOrgList() {
        Orgs orgs = new Orgs();
        List<Org> orglist = wholeQuantityDao.getOrgAll();
        orgs.setList(orglist);
        return orgs;
    }

    @Override
    public Emps getEmpList() {
        Emps emps = new Emps();
        List<Emp> emplist = wholeQuantityDao.getEmpAll();
        emps.setList(emplist);
        return emps;
    }
}
