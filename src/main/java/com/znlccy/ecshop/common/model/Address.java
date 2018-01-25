package com.znlccy.ecshop.common.model;

/**
 * @Author Adminstrator
 * @Date 2018/1/25 22:13
 * @Version 1.0.0
 * @Comment 地址类
 */

public class Address {

    /*声明地址主键*/
    private Long addressId;

    /*声明国家编码*/
    private String countryCode;

    /*声明地址*/
    private String address;

    /*声明时区*/
    private String timezone;

    /*实现*/
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
