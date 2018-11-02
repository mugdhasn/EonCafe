
package com.mg.menu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for menu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="menu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mprice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menu", propOrder = {
    "mid",
    "mname",
    "mprice",
    "vid",
    "vname"
})
public class Menu {

    protected int mid;
    protected String mname;
    protected int mprice;
    protected int vid;
    protected String vname;

    /**
     * Gets the value of the mid property.
     * 
     */
    public int getMid() {
        return mid;
    }

    /**
     * Sets the value of the mid property.
     * 
     */
    public void setMid(int value) {
        this.mid = value;
    }

    /**
     * Gets the value of the mname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMname() {
        return mname;
    }

    /**
     * Sets the value of the mname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMname(String value) {
        this.mname = value;
    }

    /**
     * Gets the value of the mprice property.
     * 
     */
    public int getMprice() {
        return mprice;
    }

    /**
     * Sets the value of the mprice property.
     * 
     */
    public void setMprice(int value) {
        this.mprice = value;
    }

    /**
     * Gets the value of the vid property.
     * 
     */
    public int getVid() {
        return vid;
    }

    /**
     * Sets the value of the vid property.
     * 
     */
    public void setVid(int value) {
        this.vid = value;
    }

    /**
     * Gets the value of the vname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVname() {
        return vname;
    }

    /**
     * Sets the value of the vname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVname(String value) {
        this.vname = value;
    }

}
