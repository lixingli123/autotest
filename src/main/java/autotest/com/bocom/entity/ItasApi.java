package autotest.com.bocom.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ItasApi {
    private Integer apiId;

    private Integer apiKey;

    private String apiCode;

    private String apiName;

    private Integer systemId;

    private Integer serviceId;

    private String apiType;

    private String apiNature;

    private Integer apiMaster;

    private Integer apiTester;

    private Integer creator;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    private BigDecimal apiVersion;

    private String apiActived;

    private String apiFlag;

    private String prdDate;

    private Integer apiBased;

    private String changeVersion;

    private String apiStatus;

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    public Integer getApiKey() {
        return apiKey;
    }

    public void setApiKey(Integer apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiCode() {
        return apiCode;
    }

    public void setApiCode(String apiCode) {
        this.apiCode = apiCode == null ? null : apiCode.trim();
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getApiType() {
        return apiType;
    }

    public void setApiType(String apiType) {
        this.apiType = apiType == null ? null : apiType.trim();
    }

    public String getApiNature() {
        return apiNature;
    }

    public void setApiNature(String apiNature) {
        this.apiNature = apiNature == null ? null : apiNature.trim();
    }

    public Integer getApiMaster() {
        return apiMaster;
    }

    public void setApiMaster(Integer apiMaster) {
        this.apiMaster = apiMaster;
    }

    public Integer getApiTester() {
        return apiTester;
    }

    public void setApiTester(Integer apiTester) {
        this.apiTester = apiTester;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getReviser() {
        return reviser;
    }

    public void setReviser(Integer reviser) {
        this.reviser = reviser;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeRevised() {
        return timeRevised;
    }

    public void setTimeRevised(Date timeRevised) {
        this.timeRevised = timeRevised;
    }

    public BigDecimal getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(BigDecimal apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getApiActived() {
        return apiActived;
    }

    public void setApiActived(String apiActived) {
        this.apiActived = apiActived == null ? null : apiActived.trim();
    }

    public String getApiFlag() {
        return apiFlag;
    }

    public void setApiFlag(String apiFlag) {
        this.apiFlag = apiFlag == null ? null : apiFlag.trim();
    }

    public String getPrdDate() {
        return prdDate;
    }

    public void setPrdDate(String prdDate) {
        this.prdDate = prdDate == null ? null : prdDate.trim();
    }

    public Integer getApiBased() {
        return apiBased;
    }

    public void setApiBased(Integer apiBased) {
        this.apiBased = apiBased;
    }

    public String getChangeVersion() {
        return changeVersion;
    }

    public void setChangeVersion(String changeVersion) {
        this.changeVersion = changeVersion == null ? null : changeVersion.trim();
    }

    public String getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus == null ? null : apiStatus.trim();
    }
}