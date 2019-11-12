//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueueItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatTQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatRQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatSQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatUQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatQQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatMQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatNQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatJQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatDQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatKQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatVQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatLQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatZQueueItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FormatHQueueItem" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueItemType", propOrder = {
    "formatTQueueItem",
    "formatRQueueItem",
    "formatSQueueItem",
    "formatUQueueItem",
    "formatQQueueItem",
    "formatMQueueItem",
    "formatNQueueItem",
    "formatJQueueItem",
    "formatDQueueItem",
    "formatKQueueItem",
    "formatVQueueItem",
    "formatLQueueItem",
    "formatZQueueItem",
    "formatHQueueItem"
})
public class QueueItemType {

    @XmlElement(name = "FormatTQueueItem")
    protected List<FormatTQueueItemType> formatTQueueItem;
    @XmlElement(name = "FormatRQueueItem")
    protected List<FormatRQueueItemType> formatRQueueItem;
    @XmlElement(name = "FormatSQueueItem")
    protected List<FormatSQueueItemType> formatSQueueItem;
    @XmlElement(name = "FormatUQueueItem")
    protected List<FormatUQueueItemType> formatUQueueItem;
    @XmlElement(name = "FormatQQueueItem")
    protected List<FormatQQueueItemType> formatQQueueItem;
    @XmlElement(name = "FormatMQueueItem")
    protected List<FormatMQueueItemType> formatMQueueItem;
    @XmlElement(name = "FormatNQueueItem")
    protected List<FormatNQueueItemType> formatNQueueItem;
    @XmlElement(name = "FormatJQueueItem")
    protected List<FormatJQueueItemType> formatJQueueItem;
    @XmlElement(name = "FormatDQueueItem")
    protected List<FormatDQueueItemType> formatDQueueItem;
    @XmlElement(name = "FormatKQueueItem")
    protected List<FormatKQueueItemType> formatKQueueItem;
    @XmlElement(name = "FormatVQueueItem")
    protected List<FormatVQueueItemType> formatVQueueItem;
    @XmlElement(name = "FormatLQueueItem")
    protected List<FormatLQueueItemType> formatLQueueItem;
    @XmlElement(name = "FormatZQueueItem")
    protected List<FormatZQueueItemType> formatZQueueItem;
    @XmlElement(name = "FormatHQueueItem")
    protected List<FormatHQueueItemType> formatHQueueItem;

    /**
     * Gets the value of the formatTQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatTQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatTQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatTQueueItemType }
     * 
     * 
     */
    public List<FormatTQueueItemType> getFormatTQueueItem() {
        if (formatTQueueItem == null) {
            formatTQueueItem = new ArrayList<FormatTQueueItemType>();
        }
        return this.formatTQueueItem;
    }

    /**
     * Gets the value of the formatRQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatRQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatRQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatRQueueItemType }
     * 
     * 
     */
    public List<FormatRQueueItemType> getFormatRQueueItem() {
        if (formatRQueueItem == null) {
            formatRQueueItem = new ArrayList<FormatRQueueItemType>();
        }
        return this.formatRQueueItem;
    }

    /**
     * Gets the value of the formatSQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatSQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatSQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatSQueueItemType }
     * 
     * 
     */
    public List<FormatSQueueItemType> getFormatSQueueItem() {
        if (formatSQueueItem == null) {
            formatSQueueItem = new ArrayList<FormatSQueueItemType>();
        }
        return this.formatSQueueItem;
    }

    /**
     * Gets the value of the formatUQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatUQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatUQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatUQueueItemType }
     * 
     * 
     */
    public List<FormatUQueueItemType> getFormatUQueueItem() {
        if (formatUQueueItem == null) {
            formatUQueueItem = new ArrayList<FormatUQueueItemType>();
        }
        return this.formatUQueueItem;
    }

    /**
     * Gets the value of the formatQQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatQQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatQQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatQQueueItemType }
     * 
     * 
     */
    public List<FormatQQueueItemType> getFormatQQueueItem() {
        if (formatQQueueItem == null) {
            formatQQueueItem = new ArrayList<FormatQQueueItemType>();
        }
        return this.formatQQueueItem;
    }

    /**
     * Gets the value of the formatMQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatMQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatMQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatMQueueItemType }
     * 
     * 
     */
    public List<FormatMQueueItemType> getFormatMQueueItem() {
        if (formatMQueueItem == null) {
            formatMQueueItem = new ArrayList<FormatMQueueItemType>();
        }
        return this.formatMQueueItem;
    }

    /**
     * Gets the value of the formatNQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatNQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatNQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatNQueueItemType }
     * 
     * 
     */
    public List<FormatNQueueItemType> getFormatNQueueItem() {
        if (formatNQueueItem == null) {
            formatNQueueItem = new ArrayList<FormatNQueueItemType>();
        }
        return this.formatNQueueItem;
    }

    /**
     * Gets the value of the formatJQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatJQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatJQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatJQueueItemType }
     * 
     * 
     */
    public List<FormatJQueueItemType> getFormatJQueueItem() {
        if (formatJQueueItem == null) {
            formatJQueueItem = new ArrayList<FormatJQueueItemType>();
        }
        return this.formatJQueueItem;
    }

    /**
     * Gets the value of the formatDQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatDQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatDQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatDQueueItemType }
     * 
     * 
     */
    public List<FormatDQueueItemType> getFormatDQueueItem() {
        if (formatDQueueItem == null) {
            formatDQueueItem = new ArrayList<FormatDQueueItemType>();
        }
        return this.formatDQueueItem;
    }

    /**
     * Gets the value of the formatKQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatKQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatKQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatKQueueItemType }
     * 
     * 
     */
    public List<FormatKQueueItemType> getFormatKQueueItem() {
        if (formatKQueueItem == null) {
            formatKQueueItem = new ArrayList<FormatKQueueItemType>();
        }
        return this.formatKQueueItem;
    }

    /**
     * Gets the value of the formatVQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatVQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatVQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatVQueueItemType }
     * 
     * 
     */
    public List<FormatVQueueItemType> getFormatVQueueItem() {
        if (formatVQueueItem == null) {
            formatVQueueItem = new ArrayList<FormatVQueueItemType>();
        }
        return this.formatVQueueItem;
    }

    /**
     * Gets the value of the formatLQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatLQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatLQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatLQueueItemType }
     * 
     * 
     */
    public List<FormatLQueueItemType> getFormatLQueueItem() {
        if (formatLQueueItem == null) {
            formatLQueueItem = new ArrayList<FormatLQueueItemType>();
        }
        return this.formatLQueueItem;
    }

    /**
     * Gets the value of the formatZQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatZQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatZQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatZQueueItemType }
     * 
     * 
     */
    public List<FormatZQueueItemType> getFormatZQueueItem() {
        if (formatZQueueItem == null) {
            formatZQueueItem = new ArrayList<FormatZQueueItemType>();
        }
        return this.formatZQueueItem;
    }

    /**
     * Gets the value of the formatHQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatHQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatHQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatHQueueItemType }
     * 
     * 
     */
    public List<FormatHQueueItemType> getFormatHQueueItem() {
        if (formatHQueueItem == null) {
            formatHQueueItem = new ArrayList<FormatHQueueItemType>();
        }
        return this.formatHQueueItem;
    }

}