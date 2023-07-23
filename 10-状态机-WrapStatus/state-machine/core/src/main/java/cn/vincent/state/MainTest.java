package cn.vincent.state;

public class MainTest {
    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.securitySign("物业签字");
        context.review("审核通过");
    }
}
