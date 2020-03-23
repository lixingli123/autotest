package autotest.com.bocom.entity;

import java.util.Date;

public class ItasEngineParam {
    private Integer itasEngineParamId;

    private Integer engineId;

    private String itasEngineParamName;

    private String itasEngineParamValue;

    private String itasEngineParamDesc;

    private Integer creator;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    public Integer getItasEngineParamId() {
        return itasEngineParamId;
    }

    public void setItasEngineParamId(Integer itasEngineParamId) {
        this.itasEngineParamId = itasEngineParamId;
    }

    public Integer getEngineId() {
        return engineId;
    }

    public void setEngineId(Integer engineId) {
        this.engineId = engineId;
    }

    public String getItasEngineParamName() {
        return itasEngineParamName;
    }

    public void setItasEngineParamName(String itasEngineParamName) {
        this.itasEngineParamName = itasEngineParamName == null ? null : itasEngineParamName.trim();
    }

    public String getItasEngineParamValue() {
        return itasEngineParamValue;
    }

    public void setItasEngineParamValue(String itasEngineParamValue) {
        this.itasEngineParamValue = itasEngineParamValue == null ? null : itasEngineParamValue.trim();
    }

    public String getItasEngineParamDesc() {
        return itasEngineParamDesc;
    }

    public void setItasEngineParamDesc(String itasEngineParamDesc) {
        this.itasEngineParamDesc = itasEngineParamDesc == null ? null : itasEngineParamDesc.trim();
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