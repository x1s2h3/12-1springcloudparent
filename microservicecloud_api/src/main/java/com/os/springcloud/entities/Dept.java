package com.os.springcloud.entities;

public class Dept {

    private Long deptno;//部门编号
    private String dname;//部门名称
    private String db_source;//来自哪个数据库

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptno(1L);
        dept.setDname("测试数据");
        dept.setDb_source("测试数据库");
        System.out.println(dept);
    }
}
