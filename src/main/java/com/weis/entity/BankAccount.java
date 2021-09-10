package com.weis.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName BankAccount
 * @Description TODO
 * @Author weis
 * @Date 2021/9/9 11:35
 * @Version
 */
public class BankAccount {

    /**
     * 唯一id
     */
    private Integer id;

    /**
     *用户名
     */
    private String userName;

    /**
     * 用户卡号
     */
    private String userAccount;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 逻辑删除
     */
    private boolean deleteFlag;

    /**
     * 创建时间
     */
    private Date creatTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    public BankAccount() {
    }

    public BankAccount(Integer id, String userName, String userAccount, BigDecimal balance, boolean deleteFlag, Date creatTime, Date updateTime) {
        this.id = id;
        this.userName = userName;
        this.userAccount = userAccount;
        this.balance = balance;
        this.deleteFlag = deleteFlag;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", balance=" + balance +
                ", deleteFlag=" + deleteFlag +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
