package cn.vincent.state;

public abstract class WorkOrderState {
    protected AppContext appContext;

    public void setAppContext(AppContext appContext) {
        this.appContext = appContext;
    }

    public abstract void siteSign(String signString);
    public abstract void submitRecords(String recordsString);
    public abstract void securitySign(String signString);
    public abstract void revoke(String reasonString);
    public abstract void review(String resultString);
}
