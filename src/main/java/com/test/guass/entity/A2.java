package com.test.guass.entity;

import javax.persistence.*;

/**
 * @ClassName A2
 * @Author Andy
 * @Date 2020/1/7 10:51
 * @Description TODO
 **/
@Entity
@Table(name = "A2")
public class A2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PSPID")
    private String pspid;
    @Column(name = "XMLB")
    private String xmlb;
    @Column(name = "SDWID")
    private String sdwid;
    @Column(name = "XDWID")
    private String xdwid;
    @Column(name = "LXMLB")
    private String lxmlb;

    public String getPspid() {
        return pspid;
    }

    public void setPspid(String pspid) {
        this.pspid = pspid;
    }

    public String getXmlb() {
        return xmlb;
    }

    public void setXmlb(String xmlb) {
        this.xmlb = xmlb;
    }

    public String getSdwid() {
        return sdwid;
    }

    public void setSdwid(String sdwid) {
        this.sdwid = sdwid;
    }

    public String getXdwid() {
        return xdwid;
    }

    public void setXdwid(String xdwid) {
        this.xdwid = xdwid;
    }

    public String getLxmlb() {
        return lxmlb;
    }

    public void setLxmlb(String lxmlb) {
        this.lxmlb = lxmlb;
    }
}
