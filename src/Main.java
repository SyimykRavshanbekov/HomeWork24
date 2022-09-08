import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);


        System.out.println("№1 Hash set: ");
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println("\n№2 Hash set: ");
        System.out.println(set2);

        System.out.println(newSet(set1, set2));
//        Iterator<Student> studentIterator = students.iterator();
//        while(studentIterator.hasNext()){
//            Student obj_Student = studentIterator.next();
//            if (obj_Student.getAge() < 20){
//                studentIterator.remove();
//            }
//        }

    }
    static Set<Integer> newSet(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.removeAll(set2);
        set2.removeAll(set1);
        newSet.addAll(set2);
        System.out.print("\nOutput: ");
        return newSet;
    }
}