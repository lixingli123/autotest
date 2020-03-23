package autotest.com.bocom.entity;

import java.util.Date;

public class ItasCaseData {
    private Integer dataId;

    private Integer caseId;

    private Integer caseKey;

    private Integer entityId;

    private String entityType;

    private String dataNature;

    private String listId;

    private String listRow;

    private String fieldKey;

    private String fieldId;

    private String fieldFrom;

    private String actName;

    private Integer actSeq;

    private String actTyp;

    private String actStr;

    private String dataTyp;

    private String dataRem;

    private String dataUsage;

    private Integer create;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    private Integer dataDict;

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getCaseKey() {
        return caseKey;
    }

    public void setCaseKey(Integer caseKey) {
        this.caseKey = caseKey;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType == null ? null : entityType.trim();
    }

    public String getDataNature() {
        return dataNature;
    }

    public void setDataNature(String dataNature) {
        this.dataNature = dataNature == null ? null : dataNature.trim();
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId == null ? null : listId.trim();
    }

    public String getListRow() {
        return listRow;
    }

    public void setListRow(String listRow) {
        this.listRow = listRow == null ? null : listRow.trim();
    }

    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey == null ? null : fieldKey.trim();
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId == null ? null : fieldId.trim();
    }

    public String getFieldFrom() {
        return fieldFrom;
    }

    public void setFieldFrom(String fieldFrom) {
        this.fieldFrom = fieldFrom == null ? null : fieldFrom.trim();
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public Integer getActSeq() {
        return actSeq;
    }

    public void setActSeq(Integer actSeq) {
        this.actSeq = actSeq;
    }

    public String getActTyp() {
        return actTyp;
    }

    public void setActTyp(String actTyp) {
        this.actTyp = actTyp == null ? null : actTyp.trim();
    }

    public String getActStr() {
        return actStr;
    }

    public void setActStr(String actStr) {
        this.actStr = actStr == null ? null : actStr.trim();
    }

    public String getDataTyp() {
        return dataTyp;
    }

    public void setDataTyp(String dataTyp) {
        this.dataTyp = dataTyp == null ? null : dataTyp.trim();
    }

    public String getDataRem() {
        return dataRem;
    }

    public void setDataRem(String dataRem) {
        this.dataRem = dataRem == null ? null : dataRem.trim();
    }

    public String getDataUsage() {
        return dataUsage;
    }

    public void setDataUsage(String dataUsage) {
        this.dataUsage = dataUsage == null ? null : dataUsage.trim();
    }

    public Integer getCreate() {
        return create;
    }

    public void setCreate(Integer create) {
        this.create = create;
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

    public Integer getDataDict() {
        return dataDict;
    }

    public void setDataDict(Integer dataDict) {
        this.dataDict = dataDict;
    }
}