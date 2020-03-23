package autotest.com.bocom.entity;

public class ItasCaseRunWithBLOBs extends ItasCaseRun {
    private String runEntrance;

    private String runCase;

    private String runReq;

    private String runRsp;

    public String getRunEntrance() {
        return runEntrance;
    }

    public void setRunEntrance(String runEntrance) {
        this.runEntrance = runEntrance == null ? null : runEntrance.trim();
    }

    public String getRunCase() {
        return runCase;
    }

    public void setRunCase(String runCase) {
        this.runCase = runCase == null ? null : runCase.trim();
    }

    public String getRunReq() {
        return runReq;
    }

    public void setRunReq(String runReq) {
        this.runReq = runReq == null ? null : runReq.trim();
    }

    public String getRunRsp() {
        return runRsp;
    }

    public void setRunRsp(String runRsp) {
        this.runRsp = runRsp == null ? null : runRsp.trim();
    }
}