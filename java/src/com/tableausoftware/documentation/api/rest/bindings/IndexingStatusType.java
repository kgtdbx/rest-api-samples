//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 10:53:25 PM CET 
//


package com.tableausoftware.documentation.api.rest.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indexingStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indexingStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indexingStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indexingErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indexedValueConceptVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indexingStatusType", propOrder = {
    "indexingStatusCode",
    "indexingErrorCode",
    "indexedValueConceptVersion"
})
public class IndexingStatusType {

    @XmlElement(required = true)
    protected String indexingStatusCode;
    @XmlElement(required = true)
    protected String indexingErrorCode;
    protected Long indexedValueConceptVersion;

    /**
     * Gets the value of the indexingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexingStatusCode() {
        return indexingStatusCode;
    }

    /**
     * Sets the value of the indexingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexingStatusCode(String value) {
        this.indexingStatusCode = value;
    }

    /**
     * Gets the value of the indexingErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexingErrorCode() {
        return indexingErrorCode;
    }

    /**
     * Sets the value of the indexingErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexingErrorCode(String value) {
        this.indexingErrorCode = value;
    }

    /**
     * Gets the value of the indexedValueConceptVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndexedValueConceptVersion() {
        return indexedValueConceptVersion;
    }

    /**
     * Sets the value of the indexedValueConceptVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndexedValueConceptVersion(Long value) {
        this.indexedValueConceptVersion = value;
    }

}