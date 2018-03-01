package com.znlccy.ecshop.common.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * @Author Adminstrator
 * @Date 2018/1/25 21:30
 * @Version 1.0.0
 * @Comment 订单类
 */

@Entity
@Table(name = "tb_order",catalog = "db_ecshop")
public class Order {

    /*声明订单主键*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private Long orderId;

    /*声明创建订单时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "generateOrderTime")
    private Timestamp generateOrderTime;

    /*声明订单商品*/
    @ManyToMany(cascade = {}, fetch = FetchType.EAGER)
    @JoinTable(name = "order_goods",joinColumns = {@JoinColumn(name = "orderId")},inverseJoinColumns = {@JoinColumn(name = "goodsId")})
    private List<Goods> goods;

    /*声明订单用户*/
    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonBackReference
    private User user;

    /*声明订单编号*/
    private String outTradeNumber;

    /*声明订单总额*/
    private BigDecimal totalAmount;

    /*声明订单内容*/
    private String orderContent;

    /*声明交易类型*/
    private String tradeType;

    /*声明交易状态*/
    private String tradeStatus;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Timestamp getGenerateOrderTime() {
        return generateOrderTime;
    }

    public void setGenerateOrderTime(Timestamp generateOrderTime) {
        this.generateOrderTime = generateOrderTime;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOutTradeNumber() {
        return outTradeNumber;
    }

    public void setOutTradeNumber(String outTradeNumber) {
        this.outTradeNumber = outTradeNumber;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }
}
