package com.neusoft.icelake.modules.standard.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <br>Title: Emp
 * <br>Description: 人员
 * <br>Author:李一鸣(liyiming.neu@neusoft.com)
 * <br>Date:2016-4-21
 */
@XmlRootElement(name = "SapUser")
public class Emp implements Serializable {

    /**
     * <br>Description: serialVersionUID
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     */
    private static final long serialVersionUID = -2074551703782500573L;

    /**
     * <br>Description: 账号
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     */
    private String accno;

    /**
     * <br>Description: 姓名
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     */
    private String truename;

    /**
     * <br>Description: 性别（奇数为男，偶数为女）
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     */
    private String gender;

    /**
     * <br>Description: 邮箱
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     */
    private String office_mail;

    /**
     * <br>Description: 职位
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     */
    private String title;

    /**
     * <br>Description: 部门ID
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     */
    private String dp_id;

    /**
     * <br>Description: 人员排序码
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     */
    private String person_sort;

    /**
     * <br>Description: 删除标识
     * <br>Author:李一鸣(liyiming.neu@neusoft.com)
     * <br>Date:2016-4-21
     */
    private String del_tag;

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOffice_mail() {
        return office_mail;
    }

    public void setOffice_mail(String office_mail) {
        this.office_mail = office_mail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDp_id() {
        return dp_id;
    }

    public void setDp_id(String dp_id) {
        this.dp_id = dp_id;
    }

    public String getPerson_sort() {
        return person_sort;
    }

    public void setPerson_sort(String person_sort) {
        this.person_sort = person_sort;
    }

    public String getDel_tag() {
        return del_tag;
    }

    public void setDel_tag(String del_tag) {
        this.del_tag = del_tag;
    }

    @Override
    public String toString() {
        return "Org [accno=" + accno + ", truename=" + truename + ", gender=" + gender + ", office_mail="
                + office_mail + ", title=" + title + ", dp_id=" + dp_id + ", person_sort=" + person_sort
                + ", del_tag=" + del_tag + "]";
    }
}
