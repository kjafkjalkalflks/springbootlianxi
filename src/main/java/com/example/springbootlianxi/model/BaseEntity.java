package com.example.springbootlianxi.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @MappedSuperclass 指定一个类，其映射信息应用于从其继承的实体。 映射的超类没有为它定义的单独的表。使用MappedSuperclass注释指定的类可以以与实体相同的方式进行映射，除了映射将仅应用于其子类，因为映射的超类本身没有表。
 * @EntityListeners(AuditingEntityListener.class) 监听实体变化，并且在updateTime字段上增加 @LastModifiedDate注解
 * columnDefinition属性表示创建表时，该字段创建的SQL语句
 * @CreatedBy  表示该字段为创建人，在这个实体被insert的时候，会设置值
 * @CreationTimestamp 使用该注解可以让Hibernate在插入时针对注解的属性对应的日期类型创建默认值
 * @UpdateTimestamp 使用该注解可以让Hibernate在更新时时针对注解的属性对应的日期类型创建默认值。
 */
@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @CreatedDate
    @Column(name = "create_time")
    private Date createTime;

    @LastModifiedDate
    @Column(name = "update_time")
    private Date updateTime;

    @LastModifiedBy
    protected String updator;

    @CreatedBy
    protected String creator;

    @Column(name = "statu",columnDefinition = "INT default 1")
    private Integer statu;

}
