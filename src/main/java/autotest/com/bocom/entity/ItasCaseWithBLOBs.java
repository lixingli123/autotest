package autotest.com.bocom.entity;

public class ItasCaseWithBLOBs extends ItasCase {
    private String casePurpose;

    private String caseConditon;

    private String caseDataReq;

    private String caseTestSteps;

    private String caseExpectation;

    public String getCasePurpose() {
        return casePurpose;
    }

    public void setCasePurpose(String casePurpose) {
        this.casePurpose = casePurpose == null ? null : casePurpose.trim();
    }

    public String getCaseConditon() {
        return caseConditon;
    }

    public void setCaseConditon(String caseConditon) {
        this.caseConditon = caseConditon == null ? null : caseConditon.trim();
    }

    public String getCaseDataReq() {
        return caseDataReq;
    }

    public void setCaseDataReq(String caseDataReq) {
        this.caseDataReq = caseDataReq == null ? null : caseDataReq.trim();
    }

    public String getCaseTestSteps() {
        return caseTestSteps;
    }

    public void setCaseTestSteps(String caseTestSteps) {
        this.caseTestSteps = caseTestSteps == null ? null : caseTestSteps.trim();
    }

    public String getCaseExpectation() {
        return caseExpectation;
    }

    public void setCaseExpectation(String caseExpectation) {
        this.caseExpectation = caseExpectation == null ? null : caseExpectation.trim();
    }
}