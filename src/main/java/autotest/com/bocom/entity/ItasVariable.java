package autotest.com.bocom.entity;

import java.util.Date;

public class ItasVariable {
    private Integer varId;

    private String varName;

    private String varValue;

    private String varNature;

    private String varType;

    private String varStatus;

    private String varDesc;

    private Integer creator;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    private String varValuePath;

    public Integer getVarId() {
        return varId;
    }

    public void setVarId(Integer varId) {
        this.varId = varId;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName == null ? null : varName.trim();
    }

    public String getVarValue() {
        return varValue;
    }

    public void setVarValue(String varValue) {
        this.varValue = varValue == null ? null : varValue.trim();
    }

    public String getVarNature() {
        return varNature;
    }

    public void setVarNature(String varNature) {
        this.varNature = varNature == null ? null : varNature.trim();
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType == null ? null : varType.trim();
    }

    public String getVarStatus() {
        return varStatus;
    }

    public void setVarStatus(String varStatus) {
        this.varStatus = varStatus == null ? null : varStatus.trim();
    }

    public String getVarDesc() {
        return varDesc;
    }

    public void setVarDesc(String varDesc) {
        this.varDesc = varDesc == null ? null : varDesc.trim();
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

    public String getVarValuePath() {
        return varValuePath;
    }

    public void setVarValuePath(String varValuePath) {
        this.varValuePath = varValuePath == null ? null : varValuePath.trim();
    }
}