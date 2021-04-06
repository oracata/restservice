package com.neusoft.icelake.modules.standard.entity;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SapUsers")
public class Emps {
    private List<Emp> list;

    private Emp[] array;

    private Map<String, Emp> map;

    public List<Emp> getList() {
        return list;
    }

    public void setList(List<Emp> list) {
        this.list = list;
    }

    public Emp[] getArray() {
        return array;
    }

    public void setArray(Emp[] array) {
        this.array = array;
    }

    public Map<String, Emp> getMap() {
        return map;
    }

    public void setMap(Map<String, Emp> map) {
        this.map = map;
    }
}
