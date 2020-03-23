package autotest.com.bocom.entity;

public class ItasEntranceParam {
    private Integer entranceParamId;

    private Integer entranceId;

    private Integer engineId;

    private Integer itasEngineParamId;

    private String paramValue;

    private String paramDesc;

    private String parametric;

    public Integer getEntranceParamId() {
        return entranceParamId;
    }

    public void setEntranceParamId(Integer entranceParamId) {
        this.entranceParamId = entranceParamId;
    }

    public Integer getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Integer entranceId) {
        this.entranceId = entranceId;
    }

    public Integer getEngineId() {
        return engineId;
    }

    public void setEngineId(Integer engineId) {
        this.engineId = engineId;
    }

    public Integer getItasEngineParamId() {
        return itasEngineParamId;
    }

    public void setItasEngineParamId(Integer itasEngineParamId) {
        this.itasEngineParamId = itasEngineParamId;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc == null ? null : paramDesc.trim();
    }

    public String getParametric() {
        return parametric;
    }

    public void setParametric(String parametric) {
        this.parametric = parametric == null ? null : parametric.trim();
    }
}