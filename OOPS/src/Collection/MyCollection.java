package Collection;

import java.util.Iterator;

public class MyCollection implements  Iterable<String> {
      private String[] arr=new String[10];
    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }
    class MyIterator implements Iterator<String>{
         private int index=0;
        @Override
        public boolean hasNext() {
            return index<arr.length && arr[index]!=null;
        }

        @Override
        public String next() {
            return arr[index++];
        }
    }

    public static void main(String[] args) {
        MyCollection c1=new MyCollection();
        c1.arr[0]="abc";
        c1.arr[1]="def";
        c1.arr[2]="ghi";
        Iterator<String> i1= c1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        c1.forEach(s-> System.out.println(s));
        System.out.println("***************************");
        for(String c:c1){
            System.out.println(c);
        }

    }


}
