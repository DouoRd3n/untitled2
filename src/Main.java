import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
//    1 описати клас САТ с полем наме
//    2 в циклі створити 10 обьектів типу кат, записати в масив
//    3 відсортувати по полю наме
//    4 вивести на екран
public static void main(String[] args) {

    String[] array = new String[10];

    Scanner sr = new Scanner(System.in);
    ArrayList<Cat> arrayList = new ArrayList<Cat>();
    for (int i = 0; i < array.length; i++) {

        arrayList.add(new Cat("cat" + (int) (Math.random() * 100)));
        System.out.print(arrayList.get(i).name + " ");
    }
    System.out.println();

    boolean sort = false;
    Cat tempCat = new Cat("");
    while (!sort) {
        sort =true;
        for (int i = 0; i < array.length - 1; i++) {
            int n = arrayList.get(i).getName().compareTo(arrayList.get(i + 1).getName());
            if (n <= 0) {
                continue;


            } else if (n > 0) {
                tempCat = arrayList.get(i + 1);
                arrayList.set(i + 1, arrayList.get(i));
                arrayList.set(i, tempCat);
                sort = false;
            }

        }
    }
    for (int i = 0; i <array.length ; i++) {
        System.out.print(arrayList.get(i).name +" ");

    }
//    Collections.sort(arrayList<Cat>);

}


public static class Cat{
    public String name;

    public Cat(String s){

    this.name = s;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


}
