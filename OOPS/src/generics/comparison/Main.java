package generics.comparison;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12,88.5f);
        Student rahul = new Student(23,98.4f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student[] list  = {kunal,rahul,arpit,karan,sachin};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        if(kunal.compareTo(rahul) < 0){
//            System.out.println(kunal.compareTo(rahul));
//            System.out.println("rahul has more marks");
//

//        }
   }
}
