package proxyPattern.staticProxy;


public class LoggerProxy implements AbstractSubject {
    private BusinessClass businessObj;  //被代理对象　通过接口聚合

    public LoggerProxy(BusinessClass businessObj) {
        this.businessObj = businessObj;
    }

    @Override
    public int method() {
        int ans = 0;
        System.out.println("开始代理：");
        ans = businessObj.method();
        if(ans == 1){
            System.out.println("方法调用成功！");
        }
        else{
            System.out.println("方法method()调用失败");
        }

        return ans;
    }
}
