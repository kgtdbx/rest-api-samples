//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.10 at 12:13:11 AM CET 
//


package com.tableausoftware.documentation.api.rest.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for frequencyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="frequencyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="intervals">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="interval" type="{http://tableau.com/api}intervalType" maxOccurs="7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="end" type="{http://www.w3.org/2001/XMLSchema}time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "frequencyDetailsType", propOrder = {
    "intervals"
})
public class FrequencyDetailsType {

    @XmlElement(required = true)
    protected FrequencyDetailsType.Intervals intervals;
    @XmlAttribute(name = "start", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar start;
    @XmlAttribute(name = "end")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar end;

    /**
     * Gets the value of the intervals property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDetailsType.Intervals }
     *     
     */
    public FrequencyDetailsType.Intervals getIntervals() {
        return intervals;
    }

    /**
     * Sets the value of the intervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDetailsType.Intervals }
     *     
     */
    public void setIntervals(FrequencyDetailsType.Intervals value) {
        this.intervals = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="interval" type="{http://tableau.com/api}intervalType" maxOccurs="7"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "interval"
    })
    public static class Intervals {

        @XmlElement(required = true)
        protected List<IntervalType> interval;

        /**
         * Gets the value of the interval property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interval property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInterval().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntervalType }
         * 
         * 
         */
        public List<IntervalType> getInterval() {
            if (interval == null) {
                interval = new ArrayList<IntervalType>();
            }
            return this.interval;
        }

    }

}
