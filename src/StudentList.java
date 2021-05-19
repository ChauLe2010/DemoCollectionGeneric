import generic.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
    ArrayList<Student> studentList=null;

    public StudentList() {
        studentList=new ArrayList();
    }

    public StudentList(ArrayList studentList) {
        this.studentList = studentList;
    }

    void add(){
        studentList.add(new Student("Linh",18));
        studentList.add(new Student("Jai",18));
        studentList.add(new Student("Thai",18));

    }
    void display(){
        Iterator<Student> iterator=studentList.iterator();
        while(iterator.hasNext()){
//            generic.Student demo=(generic.Student)(iterator.next());
//            System.out.println(demo.getName());
            System.out.println(iterator.next().getName());
        }
    }

}
