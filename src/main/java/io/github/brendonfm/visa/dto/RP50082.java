//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RP_500_82 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RP_500_82">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.visa.com/ROLSI}RepreType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.visa.com/ROLSI}BaseDisputeGroup"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcqrCaseNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AgentUniqueId" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackConditionNotMetInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRemedyInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SeparateTranInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CreditRefNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FileIndCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ChargebackRefNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberMsgEditText" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}RepresentmentMerchInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MoreInfoComment" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProofCallTimeDiffersInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AdditionalFnInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="createFinancial" type="{http://www.visa.com/ROLSI}YNType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_500_82")
public class RP50082
    extends RepreType
{


}
