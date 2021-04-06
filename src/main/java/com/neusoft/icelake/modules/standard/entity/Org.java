package com.neusoft.icelake.modules.standard.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <br>Title: Org
 * <br>Description: 组织
 * <br>Author:李一鸣(liyiming.neu@neusoft.com)
 * <br>Date:2016-4-21
 */
@XmlRootElement(name = "SapOrg")
public class Org implements Serializable {
    /**
     * <br>Description: serialVersionUID
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     */
    private static final long serialVersionUID = 7446548875479453298L;

    private String parent_id;

    private String parent_desc;

    private String child_id;

    private String child_desc;

    private String child_short;

    private String org_sort;

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getParent_desc() {
        return parent_desc;
    }

    public void setParent_desc(String parent_desc) {
        this.parent_desc = parent_desc;
    }

    public String getChild_id() {
        return child_id;
    }

    public void setChild_id(String child_id) {
        this.child_id = child_id;
    }

    public String getChild_desc() {
        return child_desc;
    }

    public void setChild_desc(String child_desc) {
        this.child_desc = child_desc;
    }

    public String getChild_short() {
        return child_short;
    }

    public void setChild_short(String child_short) {
        this.child_short = child_short;
    }

    public String getOrg_sort() {
        return org_sort;
    }

    public void setOrg_sort(String org_sort) {
        this.org_sort = org_sort;
    }

    @Override
    public String toString() {
        return "Org [parent_id=" + parent_id + ", parent_desc=" + parent_desc + ", child_id=" + child_id
                + ", child_desc=" + child_desc + ", child_short=" + child_short + ", org_sort=" + org_sort
                + "]";
    }
}