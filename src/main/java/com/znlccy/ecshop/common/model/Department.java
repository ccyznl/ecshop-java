package com.znlccy.ecshop.common.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_department", catalog = "db_ecshop")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deptId")
    private Long deptId;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
}
