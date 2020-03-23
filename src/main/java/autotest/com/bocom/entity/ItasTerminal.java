package autotest.com.bocom.entity;

import java.util.Date;

public class ItasTerminal {
    private Integer terminalId;

    private String terminalName;

    private String terminalIp;

    private String terminalPort;

    private String status;

    private Integer creator;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    private String terminalType;

    private String terminalUser;

    private String terminalPasswd;

    private String processStatus;

    private Integer processId;

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName == null ? null : terminalName.trim();
    }

    public String getTerminalIp() {
        return terminalIp;
    }

    public void setTerminalIp(String terminalIp) {
        this.terminalIp = terminalIp == null ? null : terminalIp.trim();
    }

    public String getTerminalPort() {
        return terminalPort;
    }

    public void setTerminalPort(String terminalPort) {
        this.terminalPort = terminalPort == null ? null : terminalPort.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    public String getTerminalUser() {
        return terminalUser;
    }

    public void setTerminalUser(String terminalUser) {
        this.terminalUser = terminalUser == null ? null : terminalUser.trim();
    }

    public String getTerminalPasswd() {
        return terminalPasswd;
    }

    public void setTerminalPasswd(String terminalPasswd) {
        this.terminalPasswd = terminalPasswd == null ? null : terminalPasswd.trim();
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus == null ? null : processStatus.trim();
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }
}