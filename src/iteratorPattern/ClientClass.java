package iteratorPattern;

public class ClientClass {
    public static void main(String[] args) {
        String[] productNames = {"鼠标","电脑","显示器","主机","音响","耳机","显示器","充电器","手机","电视机"};
        ProductList names = new ProductNames(productNames);
        MyIterator iterator = names.getIterator();
        System.out.println("正向输出商品名：");
        while(!iterator.isLast()){
            System.out.println(iterator.curName().toString());
            iterator.next();
        }

        System.out.println("---------------------------------------------");
        System.out.println("反向输出商品名");
        while(!iterator.isFirst()){
            System.out.println(iterator.curName().toString());
            iterator.previous();
        }


    }
}
