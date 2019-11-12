//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentPageNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrentPageNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BlankPage"/>
 *     &lt;enumeration value="LoginPage"/>
 *     &lt;enumeration value="ChangePasswordPage"/>
 *     &lt;enumeration value="AccountLockedPage"/>
 *     &lt;enumeration value="UserIdDisabledPage"/>
 *     &lt;enumeration value="UserIdInactivePage"/>
 *     &lt;enumeration value="AuthorizationFailurePage"/>
 *     &lt;enumeration value="AccessDisallowedPage"/>
 *     &lt;enumeration value="DexFailurePage"/>
 *     &lt;enumeration value="EditQuestionnairePage"/>
 *     &lt;enumeration value="DisputeWarningPage"/>
 *     &lt;enumeration value="ViewQuestionnairePage"/>
 *     &lt;enumeration value="DisputeErrorPage"/>
 *     &lt;enumeration value="UniversalIDBlockedPage"/>
 *     &lt;enumeration value="RegionBlockedPage"/>
 *     &lt;enumeration value="UserBlockedPage"/>
 *     &lt;enumeration value="VOLErrorPage"/>
 *     &lt;enumeration value="ServiceInactivePage"/>
 *     &lt;enumeration value="NoEntitlementPage"/>
 *     &lt;enumeration value="NoServicePage"/>
 *     &lt;enumeration value="EditRecallPage"/>
 *     &lt;enumeration value="DocAdviceMatchingPage"/>
 *     &lt;enumeration value="MaxfailurePage"/>
 *     &lt;enumeration value="DatabaseFailurePage"/>
 *     &lt;enumeration value="MaintenancePage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrentPageNameType")
@XmlEnum
public enum CurrentPageNameType {

    @XmlEnumValue("BlankPage")
    BLANK_PAGE("BlankPage"),
    @XmlEnumValue("LoginPage")
    LOGIN_PAGE("LoginPage"),
    @XmlEnumValue("ChangePasswordPage")
    CHANGE_PASSWORD_PAGE("ChangePasswordPage"),
    @XmlEnumValue("AccountLockedPage")
    ACCOUNT_LOCKED_PAGE("AccountLockedPage"),
    @XmlEnumValue("UserIdDisabledPage")
    USER_ID_DISABLED_PAGE("UserIdDisabledPage"),
    @XmlEnumValue("UserIdInactivePage")
    USER_ID_INACTIVE_PAGE("UserIdInactivePage"),
    @XmlEnumValue("AuthorizationFailurePage")
    AUTHORIZATION_FAILURE_PAGE("AuthorizationFailurePage"),
    @XmlEnumValue("AccessDisallowedPage")
    ACCESS_DISALLOWED_PAGE("AccessDisallowedPage"),
    @XmlEnumValue("DexFailurePage")
    DEX_FAILURE_PAGE("DexFailurePage"),
    @XmlEnumValue("EditQuestionnairePage")
    EDIT_QUESTIONNAIRE_PAGE("EditQuestionnairePage"),
    @XmlEnumValue("DisputeWarningPage")
    DISPUTE_WARNING_PAGE("DisputeWarningPage"),
    @XmlEnumValue("ViewQuestionnairePage")
    VIEW_QUESTIONNAIRE_PAGE("ViewQuestionnairePage"),
    @XmlEnumValue("DisputeErrorPage")
    DISPUTE_ERROR_PAGE("DisputeErrorPage"),
    @XmlEnumValue("UniversalIDBlockedPage")
    UNIVERSAL_ID_BLOCKED_PAGE("UniversalIDBlockedPage"),
    @XmlEnumValue("RegionBlockedPage")
    REGION_BLOCKED_PAGE("RegionBlockedPage"),
    @XmlEnumValue("UserBlockedPage")
    USER_BLOCKED_PAGE("UserBlockedPage"),
    @XmlEnumValue("VOLErrorPage")
    VOL_ERROR_PAGE("VOLErrorPage"),
    @XmlEnumValue("ServiceInactivePage")
    SERVICE_INACTIVE_PAGE("ServiceInactivePage"),
    @XmlEnumValue("NoEntitlementPage")
    NO_ENTITLEMENT_PAGE("NoEntitlementPage"),
    @XmlEnumValue("NoServicePage")
    NO_SERVICE_PAGE("NoServicePage"),
    @XmlEnumValue("EditRecallPage")
    EDIT_RECALL_PAGE("EditRecallPage"),
    @XmlEnumValue("DocAdviceMatchingPage")
    DOC_ADVICE_MATCHING_PAGE("DocAdviceMatchingPage"),
    @XmlEnumValue("MaxfailurePage")
    MAXFAILURE_PAGE("MaxfailurePage"),
    @XmlEnumValue("DatabaseFailurePage")
    DATABASE_FAILURE_PAGE("DatabaseFailurePage"),
    @XmlEnumValue("MaintenancePage")
    MAINTENANCE_PAGE("MaintenancePage");
    private final String value;

    CurrentPageNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrentPageNameType fromValue(String v) {
        for (CurrentPageNameType c: CurrentPageNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}