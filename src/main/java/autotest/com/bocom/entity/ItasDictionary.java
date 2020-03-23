package autotest.com.bocom.entity;

import java.util.Date;

public class ItasDictionary {
    private Integer dictId;

    private String dictNature;

    private Integer dictPid;

    private Integer systemId;

    private String dictCode;

    private String dictName;

    private String dictType;

    private String dictStatus;

    private String dictDesc;

    private Integer creator;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    private String dictCpx;

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictNature() {
        return dictNature;
    }

    public void setDictNature(String dictNature) {
        this.dictNature = dictNature == null ? null : dictNature.trim();
    }

    public Integer getDictPid() {
        return dictPid;
    }

    public void setDictPid(Integer dictPid) {
        this.dictPid = dictPid;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    public String getDictStatus() {
        return dictStatus;
    }

    public void setDictStatus(String dictStatus) {
        this.dictStatus = dictStatus == null ? null : dictStatus.trim();
    }

    public String getDictDesc() {
        return dictDesc;
    }

    public void setDictDesc(String dictDesc) {
        this.dictDesc = dictDesc == null ? null : dictDesc.trim();
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

    public String getDictCpx() {
        return dictCpx;
    }

    public void setDictCpx(String dictCpx) {
        this.dictCpx = dictCpx == null ? null : dictCpx.trim();
    }
}