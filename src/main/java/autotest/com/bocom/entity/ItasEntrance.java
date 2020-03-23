package autotest.com.bocom.entity;

import java.util.Date;

public class ItasEntrance {
    private Integer entranceId;

    private String entranceEnv;

    private Integer reqSysId;

    private Integer rspSysId;

    private Integer rspSvcId;

    private String protocol;

    private String msgFromat;

    private String entranceNature;

    private String entranceStatus;

    private Integer caseParser;

    private Integer caseCompiler;

    private Integer transceiver;

    private Integer rspParser;

    private String entranceDesc;

    private Integer creator;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    private String formatType;

    public Integer getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Integer entranceId) {
        this.entranceId = entranceId;
    }

    public String getEntranceEnv() {
        return entranceEnv;
    }

    public void setEntranceEnv(String entranceEnv) {
        this.entranceEnv = entranceEnv == null ? null : entranceEnv.trim();
    }

    public Integer getReqSysId() {
        return reqSysId;
    }

    public void setReqSysId(Integer reqSysId) {
        this.reqSysId = reqSysId;
    }

    public Integer getRspSysId() {
        return rspSysId;
    }

    public void setRspSysId(Integer rspSysId) {
        this.rspSysId = rspSysId;
    }

    public Integer getRspSvcId() {
        return rspSvcId;
    }

    public void setRspSvcId(Integer rspSvcId) {
        this.rspSvcId = rspSvcId;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    public String getMsgFromat() {
        return msgFromat;
    }

    public void setMsgFromat(String msgFromat) {
        this.msgFromat = msgFromat == null ? null : msgFromat.trim();
    }

    public String getEntranceNature() {
        return entranceNature;
    }

    public void setEntranceNature(String entranceNature) {
        this.entranceNature = entranceNature == null ? null : entranceNature.trim();
    }

    public String getEntranceStatus() {
        return entranceStatus;
    }

    public void setEntranceStatus(String entranceStatus) {
        this.entranceStatus = entranceStatus == null ? null : entranceStatus.trim();
    }

    public Integer getCaseParser() {
        return caseParser;
    }

    public void setCaseParser(Integer caseParser) {
        this.caseParser = caseParser;
    }

    public Integer getCaseCompiler() {
        return caseCompiler;
    }

    public void setCaseCompiler(Integer caseCompiler) {
        this.caseCompiler = caseCompiler;
    }

    public Integer getTransceiver() {
        return transceiver;
    }

    public void setTransceiver(Integer transceiver) {
        this.transceiver = transceiver;
    }

    public Integer getRspParser() {
        return rspParser;
    }

    public void setRspParser(Integer rspParser) {
        this.rspParser = rspParser;
    }

    public String getEntranceDesc() {
        return entranceDesc;
    }

    public void setEntranceDesc(String entranceDesc) {
        this.entranceDesc = entranceDesc == null ? null : entranceDesc.trim();
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

    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType == null ? null : formatType.trim();
    }
}