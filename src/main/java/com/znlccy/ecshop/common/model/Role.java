package com.znlccy.ecshop.common.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_role", catalog = "db_ecshop")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleId")
    private Long roleId;
}
