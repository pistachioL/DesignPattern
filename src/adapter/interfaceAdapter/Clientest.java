package adapter.interfaceAdapter;

public class Clientest {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("使用m1方法");
            }
        };
        absAdapter.m1();

    }
}
