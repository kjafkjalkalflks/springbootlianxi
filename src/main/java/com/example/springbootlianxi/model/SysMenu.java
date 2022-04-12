package com.example.springbootlianxi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @EqualsAndHashCode(callSuper = true)，model bean实现equals方法和hashcode方法,true那就是用自己的属性和从父类继承的属性 来生成hashcode
 */
@Entity
@Data
@Slf4j
@Table(name = "sys_menu")
@EqualsAndHashCode(callSuper = true)
public class SysMenu extends BaseEntity implements Serializable {

    /**
     * 父菜单ID，一级菜单为0
     */
    @NotNull(message = "上级菜单不能为空")
    @Column(name = "parent_id")
    private Long parentId;

    @NotBlank(message = "菜单名称不能为空")
    @Column(name = "name")
    private String name;
    /**
     * 菜单URL
     */
    @Column(name = "path")
    private String path;
    /**
     * 授权(多个用逗号分隔，如：user:list,user:create)
     */
    @NotBlank(message = "菜单授权码不能为空")
    private String perms;

    private String component;

    /**
     * 类型     0：目录   1：菜单   2：按钮
     */
    @NotNull(message = "菜单类型不能为空")
    private Integer type;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 排序
     */

    private Integer orderNum;

    private List<SysMenu> children = new ArrayList<>();


}
