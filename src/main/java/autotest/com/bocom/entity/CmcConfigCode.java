package autotest.com.bocom.entity;

import java.util.Date;

public class CmcConfigCode {
    private Integer id;

    private String configCode;

    private String configName;

    private String configValue;

    private String configSwitch;

    private String configUtil;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode == null ? null : configCode.trim();
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName == null ? null : configName.trim();
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }

    public String getConfigSwitch() {
        return configSwitch;
    }

    public void setConfigSwitch(String configSwitch) {
        this.configSwitch = configSwitch == null ? null : configSwitch.trim();
    }

    public String getConfigUtil() {
        return configUtil;
    }

    public void setConfigUtil(String configUtil) {
        this.configUtil = configUtil == null ? null : configUtil.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}