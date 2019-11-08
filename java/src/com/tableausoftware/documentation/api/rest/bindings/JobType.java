//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 10:53:25 PM CET 
//


package com.tableausoftware.documentation.api.rest.bindings;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for jobType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusNotes" type="{http://tableau.com/api}statusNoteListType" minOccurs="0"/>
 *         &lt;element name="extractRefreshJob" type="{http://tableau.com/api}extractRefreshJobType" minOccurs="0"/>
 *         &lt;element name="runFlowJobType" type="{http://tableau.com/api}runFlowJobType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://tableau.com/api}resourceIdType" />
 *       &lt;attribute name="mode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Asynchronous"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="GroupSync"/>
 *             &lt;enumeration value="RefreshExtract"/>
 *             &lt;enumeration value="PublishWorkbook"/>
 *             &lt;enumeration value="PublishDatasource"/>
 *             &lt;enumeration value="RunFlow"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="progress" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="createdAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="startedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="completedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="finishCode" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobType", propOrder = {
    "statusNotes",
    "extractRefreshJob",
    "runFlowJobType"
})
public class JobType {

    protected StatusNoteListType statusNotes;
    protected ExtractRefreshJobType extractRefreshJob;
    protected RunFlowJobType runFlowJobType;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "progress")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger progress;
    @XmlAttribute(name = "createdAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlAttribute(name = "startedAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startedAt;
    @XmlAttribute(name = "updatedAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlAttribute(name = "completedAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedAt;
    @XmlAttribute(name = "finishCode")
    protected BigInteger finishCode;

    /**
     * Gets the value of the statusNotes property.
     * 
     * @return
     *     possible object is
     *     {@link StatusNoteListType }
     *     
     */
    public StatusNoteListType getStatusNotes() {
        return statusNotes;
    }

    /**
     * Sets the value of the statusNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusNoteListType }
     *     
     */
    public void setStatusNotes(StatusNoteListType value) {
        this.statusNotes = value;
    }

    /**
     * Gets the value of the extractRefreshJob property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractRefreshJobType }
     *     
     */
    public ExtractRefreshJobType getExtractRefreshJob() {
        return extractRefreshJob;
    }

    /**
     * Sets the value of the extractRefreshJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractRefreshJobType }
     *     
     */
    public void setExtractRefreshJob(ExtractRefreshJobType value) {
        this.extractRefreshJob = value;
    }

    /**
     * Gets the value of the runFlowJobType property.
     * 
     * @return
     *     possible object is
     *     {@link RunFlowJobType }
     *     
     */
    public RunFlowJobType getRunFlowJobType() {
        return runFlowJobType;
    }

    /**
     * Sets the value of the runFlowJobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunFlowJobType }
     *     
     */
    public void setRunFlowJobType(RunFlowJobType value) {
        this.runFlowJobType = value;
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
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProgress(BigInteger value) {
        this.progress = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the startedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartedAt() {
        return startedAt;
    }

    /**
     * Sets the value of the startedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartedAt(XMLGregorianCalendar value) {
        this.startedAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the completedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedAt() {
        return completedAt;
    }

    /**
     * Sets the value of the completedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedAt(XMLGregorianCalendar value) {
        this.completedAt = value;
    }

    /**
     * Gets the value of the finishCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFinishCode() {
        return finishCode;
    }

    /**
     * Sets the value of the finishCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFinishCode(BigInteger value) {
        this.finishCode = value;
    }

}
