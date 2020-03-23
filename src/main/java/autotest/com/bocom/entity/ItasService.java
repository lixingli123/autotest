package autotest.com.bocom.entity;

import java.util.Date;

public class ItasService {
    private Integer svcId;

    private String svcCode;

    private String svcName;

    private Integer sysId;

    private String svcType;

    private String svcStatus;

    private String svcDesc;

    private Integer svcMaster;

    private Integer svcTester;

    private Integer creator;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    public Integer getSvcId() {
        return svcId;
    }

    public void setSvcId(Integer svcId) {
        this.svcId = svcId;
    }

    public String getSvcCode() {
        return svcCode;
    }

    public void setSvcCode(String svcCode) {
        this.svcCode = svcCode == null ? null : svcCode.trim();
    }

    public String getSvcName() {
        return svcName;
    }

    public void setSvcName(String svcName) {
        this.svcName = svcName == null ? null : svcName.trim();
    }

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public String getSvcType() {
        return svcType;
    }

    public void setSvcType(String svcType) {
        this.svcType = svcType == null ? null : svcType.trim();
    }

    public String getSvcStatus() {
        return svcStatus;
    }

    public void setSvcStatus(String svcStatus) {
        this.svcStatus = svcStatus == null ? null : svcStatus.trim();
    }

    public String getSvcDesc() {
        return svcDesc;
    }

    public void setSvcDesc(String svcDesc) {
        this.svcDesc = svcDesc == null ? null : svcDesc.trim();
    }

    public Integer getSvcMaster() {
        return svcMaster;
    }

    public void setSvcMaster(Integer svcMaster) {
        this.svcMaster = svcMaster;
    }

    public Integer getSvcTester() {
        return svcTester;
    }

    public void setSvcTester(Integer svcTester) {
        this.svcTester = svcTester;
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