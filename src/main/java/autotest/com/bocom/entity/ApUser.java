package autotest.com.bocom.entity;

import java.util.Date;

public class ApUser {
    private Integer appId;

    private Integer userId;

    private Integer orgId;

    private Integer appOrgId;

    private String userCode;

    private String loginName;

    private String authMode;

    private String userType;

    private String cName;

    private String spellName;

    private String firstName;

    private String middleName;

    private String lastName;

    private String gender;

    private String userIdType;

    private String userIdNo;

    private String userLevel;

    private Date userEffectiveDate;

    private String appUserStatus;

    private Date userExpireDate;

    private String kindGroup;

    private String tellerLevel;

    private String cellPhone;

    private String email;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getAppOrgId() {
        return appOrgId;
    }

    public void setAppOrgId(Integer appOrgId) {
        this.appOrgId = appOrgId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getAuthMode() {
        return authMode;
    }

    public void setAuthMode(String authMode) {
        this.authMode = authMode == null ? null : authMode.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName == null ? null : spellName.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName == null ? null : middleName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getUserIdType() {
        return userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType == null ? null : userIdType.trim();
    }

    public String getUserIdNo() {
        return userIdNo;
    }

    public void setUserIdNo(String userIdNo) {
        this.userIdNo = userIdNo == null ? null : userIdNo.trim();
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    public Date getUserEffectiveDate() {
        return userEffectiveDate;
    }

    public void setUserEffectiveDate(Date userEffectiveDate) {
        this.userEffectiveDate = userEffectiveDate;
    }

    public String getAppUserStatus() {
        return appUserStatus;
    }

    public void setAppUserStatus(String appUserStatus) {
        this.appUserStatus = appUserStatus == null ? null : appUserStatus.trim();
    }

    public Date getUserExpireDate() {
        return userExpireDate;
    }

    public void setUserExpireDate(Date userExpireDate) {
        this.userExpireDate = userExpireDate;
    }

    public String getKindGroup() {
        return kindGroup;
    }

    public void setKindGroup(String kindGroup) {
        this.kindGroup = kindGroup == null ? null : kindGroup.trim();
    }

    public String getTellerLevel() {
        return tellerLevel;
    }

    public void setTellerLevel(String tellerLevel) {
        this.tellerLevel = tellerLevel == null ? null : tellerLevel.trim();
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone == null ? null : cellPhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}