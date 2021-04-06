package com.neusoft.icelake.modules.standard.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.neusoft.icelake.modules.standard.entity.Emps;
import com.neusoft.icelake.modules.standard.entity.Orgs;

@Path("/wq")
public interface IWholeQuantityService {
    /**
     * <br>Description://rest/wq/orglist?_type=json
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     * @return
     */
    @GET
    @Path("/orglist")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Orgs getOrgList();

    @GET
    @Path("/emplist")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Emps getEmpList();
}
