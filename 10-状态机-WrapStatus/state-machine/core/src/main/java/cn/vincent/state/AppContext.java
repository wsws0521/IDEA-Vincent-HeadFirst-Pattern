package cn.vincent.state;

public class AppContext {
    public static final WorkOrderState STATE_CREATE = new CreateState();
    public static final WorkOrderState STATE_SITESIGN = new SiteSignState();
    public static final WorkOrderState STATE_SUBMITRECORDS = new SubmitRecordsState();
    public static final WorkOrderState STATE_SECURITYSIGN = new SecuritySignState();
    public static final WorkOrderState STATE_REVOKEREVIEW = new RevokeReviewState();

    private WorkOrderState currentState = STATE_REVOKEREVIEW;
    {
        STATE_CREATE.setAppContext(this);
        STATE_SITESIGN.setAppContext(this);
        STATE_SUBMITRECORDS.setAppContext(this);
        STATE_SECURITYSIGN.setAppContext(this);
        STATE_REVOKEREVIEW.setAppContext(this);
    }

    public void setState(WorkOrderState state){
        if(state instanceof CreateState){
            System.out.println("状态设置为 已派发");
        }else if(state instanceof SiteSignState){
            System.out.println("状态设置为 已签到");
        }else if(state instanceof SubmitRecordsState){
            System.out.println("状态设置为 已提交记录");
        }else if(state instanceof SecuritySignState){
            System.out.println("状态设置为 已安全员签字");
        }else if(state instanceof RevokeReviewState){
            System.out.println("状态设置为 撤回申请");
        }
        this.currentState = state;
        this.currentState.setAppContext(this);
    }

    public WorkOrderState getState(){
        return this.currentState;
    }

    public void siteSign(String signString){
        this.currentState.siteSign(signString);
    }

    public void submitRecords(String recordsString){
        this.currentState.submitRecords(recordsString);
    }

    public void securitySign(String signString){
        this.currentState.securitySign(signString);
    }

    public void revoke(String reasonString){
        this.currentState.revoke(reasonString);
    }

    public void review(String resultString){
        this.currentState.review(resultString);
    }
}
