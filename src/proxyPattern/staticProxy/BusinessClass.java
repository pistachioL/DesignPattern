package proxyPattern.staticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BusinessClass implements AbstractSubject{

    public int flag = 0;
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String sj = sdf.format(d);
    @Override
    public int method() {
        flag = 1;
        System.out.println("方法method()被调用，调用时间为："+ sj);
        return flag;
    }
}
