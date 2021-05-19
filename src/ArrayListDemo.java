import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        List dssv = new ArrayList();
        dssv.add(1);//Integer
        dssv.add("C03K");
        dssv.add(1.5);//Float
//        for(int i=0;i<dssv.size();i++){
//            System.out.println(dssv.get(i));
//        }

//        for (Object o:dssv) {
//            System.out.println(o);
//
//        }
        ListIterator listIterator=dssv.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
//        while (listIterator.hasPrevious()){
//            listIterator.previous();
//        }
        System.out.println("Ket qua iter: ");
        Iterator iterator=dssv.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /* 1. So sanh giua cac anh trene, iterator */
        //boxing,unboxing java - Wapper class int - Integer
    }
}
