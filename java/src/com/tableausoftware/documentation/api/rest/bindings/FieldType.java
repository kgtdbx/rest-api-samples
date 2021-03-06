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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sampleValues" type="{http://tableau.com/api}distinctValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://tableau.com/api}dataTypeType" minOccurs="0"/>
 *         &lt;element name="fieldRole" type="{http://tableau.com/api}fieldRoleType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldType", propOrder = {
    "sampleValues",
    "dataType",
    "fieldRole",
    "name"
})
public class FieldType {

    protected List<DistinctValueType> sampleValues;
    @XmlSchemaType(name = "string")
    protected DataTypeType dataType;
    @XmlSchemaType(name = "string")
    protected FieldRoleType fieldRole;
    protected String name;

    /**
     * Gets the value of the sampleValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSampleValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistinctValueType }
     * 
     * 
     */
    public List<DistinctValueType> getSampleValues() {
        if (sampleValues == null) {
            sampleValues = new ArrayList<DistinctValueType>();
        }
        return this.sampleValues;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeType }
     *     
     */
    public DataTypeType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeType }
     *     
     */
    public void setDataType(DataTypeType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the fieldRole property.
     * 
     * @return
     *     possible object is
     *     {@link FieldRoleType }
     *     
     */
    public FieldRoleType getFieldRole() {
        return fieldRole;
    }

    /**
     * Sets the value of the fieldRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldRoleType }
     *     
     */
    public void setFieldRole(FieldRoleType value) {
        this.fieldRole = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
