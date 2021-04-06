package com.neusoft.icelake.modules.standard.dao;

import java.util.List;

import com.neusoft.icelake.modules.standard.entity.Emp;
import com.neusoft.icelake.modules.standard.entity.Org;

public interface IWholeQuantityDao {
    List<Emp> getEmpAll();

    List<Org> getOrgAll();
}
