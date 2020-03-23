package autotest.com.bocom.entity;

import java.util.Date;

public class ItasTransfer {
    private Integer transferId;

    private String transferNo;

    private String transferName;

    private String transferExport;

    private String transferDesc;

    private String caseNo;

    private Integer creator;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    private String transferValue;

    public Integer getTransferId() {
        return transferId;
    }

    public void setTransferId(Integer transferId) {
        this.transferId = transferId;
    }

    public String getTransferNo() {
        return transferNo;
    }

    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo == null ? null : transferNo.trim();
    }

    public String getTransferName() {
        return transferName;
    }

    public void setTransferName(String transferName) {
        this.transferName = transferName == null ? null : transferName.trim();
    }

    public String getTransferExport() {
        return transferExport;
    }

    public void setTransferExport(String transferExport) {
        this.transferExport = transferExport == null ? null : transferExport.trim();
    }

    public String getTransferDesc() {
        return transferDesc;
    }

    public void setTransferDesc(String transferDesc) {
        this.transferDesc = transferDesc == null ? null : transferDesc.trim();
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
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

    public String getTransferValue() {
        return transferValue;
    }

    public void setTransferValue(String transferValue) {
        this.transferValue = transferValue == null ? null : transferValue.trim();
    }
}