//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 10:53:25 PM CET 
//


package com.tableausoftware.documentation.api.rest.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subscriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="content" type="{http://tableau.com/api}subscriptionContentType"/>
 *         &lt;element name="schedule" type="{http://tableau.com/api}scheduleType"/>
 *         &lt;element name="user" type="{http://tableau.com/api}userType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://tableau.com/api}resourceIdType" />
 *       &lt;attribute name="subject" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="attachImage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="attachPdf" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscriptionType", propOrder = {
    "content",
    "schedule",
    "user"
})
public class SubscriptionType {

    @XmlElement(required = true)
    protected SubscriptionContentType content;
    @XmlElement(required = true)
    protected ScheduleType schedule;
    @XmlElement(required = true)
    protected UserType user;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "subject", required = true)
    protected String subject;
    @XmlAttribute(name = "attachImage")
    protected Boolean attachImage;
    @XmlAttribute(name = "attachPdf")
    protected Boolean attachPdf;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionContentType }
     *     
     */
    public SubscriptionContentType getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionContentType }
     *     
     */
    public void setContent(SubscriptionContentType value) {
        this.content = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setSchedule(ScheduleType value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the attachImage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachImage() {
        return attachImage;
    }

    /**
     * Sets the value of the attachImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachImage(Boolean value) {
        this.attachImage = value;
    }

    /**
     * Gets the value of the attachPdf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachPdf() {
        return attachPdf;
    }

    /**
     * Sets the value of the attachPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachPdf(Boolean value) {
        this.attachPdf = value;
    }

}
