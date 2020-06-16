package com.capgemini.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-capgemini-pojo-User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "`user`")
public class User {
    /**
     * 用户表的主键id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty(value="用户表的主键id")
    private Integer id;

    /**
     * 用户表的名称 
     */
    @Column(name = "`name`")
    @ApiModelProperty(value="用户表的名称 ")
    private String name;
}