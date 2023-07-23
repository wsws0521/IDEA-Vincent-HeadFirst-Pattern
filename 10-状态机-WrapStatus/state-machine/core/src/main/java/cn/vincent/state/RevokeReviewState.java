package cn.vincent.state;

public class RevokeReviewState extends WorkOrderState {
    @Override
    public void siteSign(String signString) {
        System.out.println("当前状态无法签到");
    }

    @Override
    public void submitRecords(String recordsString) {
        System.out.println("当前状态无法提交记录");
    }

    @Override
    public void securitySign(String signString) {
        System.out.println("当前状态无法安全员签字");
    }

    @Override
    public void revoke(String reasonString) {
        System.out.println("当前状态无法发起撤回");
    }

    @Override
    public void review(String resultString) {
        // 添加审核通过的相关操作
        System.out.println(resultString);
        this.appContext.setState(this.appContext.STATE_SITESIGN);
    }
}
