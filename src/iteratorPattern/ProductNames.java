package iteratorPattern;

public class ProductNames implements ProductList {
    private String[] productNames;
    public ProductNames(String[] names) {
        this.productNames = names;
    }

    @Override
    public MyIterator getIterator() {
        return new productIterator();
    }
    class productIterator implements MyIterator{
        private int curName = 0;
        @Override
        public void next() {
            if(curName < productNames.length)
                curName++;
        }

        @Override
        public void previous() {
            if(curName > -1)
                curName--;
        }

        @Override
        public boolean hasNext() {
            if(curName < productNames.length - 1){
                return true;
            }
            return false;
        }

        @Override
        public String curName() {
            return productNames[curName];
        }


        @Override
        public boolean isLast() {
            if(curName == productNames.length) {
                curName = productNames.length - 1;
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            return curName == -1;

        }
    }
}
