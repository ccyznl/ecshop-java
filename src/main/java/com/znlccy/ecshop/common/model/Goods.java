package com.znlccy.ecshop.common.model;

import org.hibernate.annotations.GeneratorType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Author Adminstrator
 * @Date 2018/1/24 20:07
 * @Version 1.0.0
 * @Comment 商品类
 */

@Entity
@Table(name = "tb_goods",catalog = "db_ecshop")
public class Goods {

    /*声明商品Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goodsId")
    private Long goodsId;

    /*声明商品名称*/
    @Column(name = "goodName")
    private String goodsName;

    /*声明商品单价*/
    @Column(name = "goodsPrice")
    private BigDecimal goodsPrice;

    /*声明商品数量*/
    @Column(name = "goodsNumber")
    private Integer goodsNumber;

    /*声明商品生产日期*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp produceDate;

    /*声明商品生产地址*/
    private String produceAddress;

    /*声明商品有效日期*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp validateDate;

    /*声明商品总价*/
    private BigDecimal totalAmount;

    /*声明商品保质日期*/
    private Timestamp keepDate;

    /*声明商品图片地址*/
    private String imageUrl;

    /*声明商品属性*/
    private String goodsAttribute;

    /*声明商品重量*/
    private Float goodsWeight;

    /*实现商品主键的get方法*/
    public Long getGoodsId() {
        return goodsId;
    }

    /*实现商品主键的set方法*/
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /*实现商品名称的get方法*/
    public String getGoodsName() {
        return goodsName;
    }

    /*实现商品名称的set方法*/
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /*实现商品单价的get方法*/
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /*实现商品单价的set方法*/
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /*实现商品数量的get方法*/
    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    /*实现商品数量的set方法*/
    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /*实现商品生产日期的get方法*/
    public Timestamp getProduceDate() {
        return produceDate;
    }

    /*实现商品生产日期的set方法*/
    public void setProduceDate(Timestamp produceDate) {
        this.produceDate = produceDate;
    }

    /*实现商品生产地址的get方法*/
    public String getProduceAddress() {
        return produceAddress;
    }

    /*实现商品生产地址的set方法*/
    public void setProduceAddress(String produceAddress) {
        this.produceAddress = produceAddress;
    }

    /*实现商品有效日期的get方法*/
    public Timestamp getValidateDate() {
        return validateDate;
    }

    /*实现商品有效日期的set方法*/
    public void setValidateDate(Timestamp validateDate) {
        this.validateDate = validateDate;
    }

    /*实现商品总价的get方法*/
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /*实现商品总价的set方法*/
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /*实现商品保质日期的get方法*/
    public Timestamp getKeepDate() {
        return keepDate;
    }

    /*实现商品保质日期的set方法*/
    public void setKeepDate(Timestamp keepDate) {
        this.keepDate = keepDate;
    }

    /*实现商品图片地址的get方法*/
    public String getImageUrl() {
        return imageUrl;
    }

    /*实现商品图片的set方法*/
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /*实现商品属性的get方法*/
    public String getGoodsAttribute() {
        return goodsAttribute;
    }

    /*实现商品属性的set方法*/
    public void setGoodsAttribute(String goodsAttribute) {
        this.goodsAttribute = goodsAttribute;
    }

    /*实现商品重量的get方法*/
    public Float getGoodsWeight() {
        return goodsWeight;
    }

    /*实现商品重量的set方法*/
    public void setGoodsWeight(Float goodsWeight) {
        this.goodsWeight = goodsWeight;
    }
}
