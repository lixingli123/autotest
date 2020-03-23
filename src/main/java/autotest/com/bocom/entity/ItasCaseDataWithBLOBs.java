package autotest.com.bocom.entity;

public class ItasCaseDataWithBLOBs extends ItasCaseData {
    private String actCpx;

    private String dataStr;

    private String dataCpx;

    private String dataSupplied;

    public String getActCpx() {
        return actCpx;
    }

    public void setActCpx(String actCpx) {
        this.actCpx = actCpx == null ? null : actCpx.trim();
    }

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr == null ? null : dataStr.trim();
    }

    public String getDataCpx() {
        return dataCpx;
    }

    public void setDataCpx(String dataCpx) {
        this.dataCpx = dataCpx == null ? null : dataCpx.trim();
    }

    public String getDataSupplied() {
        return dataSupplied;
    }

    public void setDataSupplied(String dataSupplied) {
        this.dataSupplied = dataSupplied == null ? null : dataSupplied.trim();
    }
}