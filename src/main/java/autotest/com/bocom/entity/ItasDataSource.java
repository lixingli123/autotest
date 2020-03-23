package autotest.com.bocom.entity;

import java.util.Date;

public class ItasDataSource {
    private Integer sourceId;

    private String sourceName;

    private Integer systemId;

    private String sourceType;

    private String sourceStatus;

    private String sourceDriver;

    private String sourceUrl;

    private String sourceUser;

    private String sourcePasswd;

    private String sourceDesc;

    private Integer creator;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public String getSourceStatus() {
        return sourceStatus;
    }

    public void setSourceStatus(String sourceStatus) {
        this.sourceStatus = sourceStatus == null ? null : sourceStatus.trim();
    }

    public String getSourceDriver() {
        return sourceDriver;
    }

    public void setSourceDriver(String sourceDriver) {
        this.sourceDriver = sourceDriver == null ? null : sourceDriver.trim();
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl == null ? null : sourceUrl.trim();
    }

    public String getSourceUser() {
        return sourceUser;
    }

    public void setSourceUser(String sourceUser) {
        this.sourceUser = sourceUser == null ? null : sourceUser.trim();
    }

    public String getSourcePasswd() {
        return sourcePasswd;
    }

    public void setSourcePasswd(String sourcePasswd) {
        this.sourcePasswd = sourcePasswd == null ? null : sourcePasswd.trim();
    }

    public String getSourceDesc() {
        return sourceDesc;
    }

    public void setSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc == null ? null : sourceDesc.trim();
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
}