import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("mm-dd-yyyy");
        ArrayList<Person> people;
        people = new ArrayList<Person>();
        try {
            people.add(new Person("Joe", 92422, df.parse("12-12-2010")));
            people.add(new Person("Joef", 24122, df.parse("1-12-2010")));
            people.add(new Person("Joee", 24922, df.parse("12-2-2010")));
        }
        catch(ParseException e) {
            e.printStackTrace();
        }

        Collections.sort(people, new Person.CompID());
        System.out.println("BY ID");
        for(Person p : people) {
            System.out.println(p.toString());
        }

        Collections.sort(people, new Person.CompDate(false));
        System.out.println("BY Date asc");
        for(Person p : people) {
            System.out.println(p.toString());
        }

        Collections.sort(people, new Person.CompDate(true));
        System.out.println("BY Date desc");
        for(Person p : people) {
            System.out.println(p.toString());
        }

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.valueOf(p1.id).compareTo(p2.id);
            }
        });
        System.out.println("BY ID");
        for(Person p : people) {
            System.out.println(p.toString());
        }

        System.out.println("-------------------------------------------------------------------");

        ArrayList<Person> zpeople = new ArrayList<Person>();

        try {
            zpeople.add(new Person("A", 6, df.parse("1-1-2011")));
            zpeople.add(new Person("B", 2, df.parse("2-1-2011")));
            zpeople.add(new Person("C", 3, df.parse("3-1-2011")));
            zpeople.add(new Person("D", 4, df.parse("1-2-2011")));
            zpeople.add(new Person("E", 5, df.parse("1-3-2011")));
            zpeople.add(new Person("F", 1, df.parse("1-1-2012")));
            zpeople.add(new Person("G", 7, df.parse("1-1-2013")));
            zpeople.add(new Person("H", 8, df.parse("2-2-2011")));
            zpeople.add(new Person("I", 9, df.parse("2-3-2011")));
            zpeople.add(new Person("J", 10, df.parse("4-2-2011")));
        }
        catch (ParseException e) { }

        zpeople.get(0).SetAge(30);
        zpeople.get(1).SetAge(700);
        zpeople.get(2).SetAge(20);
        zpeople.get(3).SetAge(33);
        zpeople.get(4).SetAge(40);
        zpeople.get(5).SetAge(55);
        zpeople.get(6).SetAge(22);
        zpeople.get(7).SetAge(44);
        zpeople.get(8).SetAge(11);
        zpeople.get(9).SetAge(19);


        System.out.println("Max : " + maxIDPer(zpeople));
        System.out.println("Min : " + minIDPer(zpeople));

        System.out.println();

        ArrayList<Tree> ztree = new ArrayList<Tree>();
        ztree.add(new Tree(100,50));
        ztree.add(new Tree(550,20));
        ztree.add(new Tree(780,30));
        ztree.add(new Tree(120, 40));
        ztree.add(new Tree(410, 10));

        Collections.sort(zpeople, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return compareAge(o1, o2);
            }
        });
        for(Person person : zpeople) {
            System.out.println(person);
        }

        System.out.println();

        Collections.sort(ztree, new Comparator<Tree>() {
            @Override
            public int compare(Tree o1, Tree o2) {
                return compareAge(o1, o2);
            }
        });
        for(Tree tree : ztree) {
            System.out.println(tree);
        }


    }

    public static int compareAge(IAmOld var1, IAmOld var2) {
        return var1.GetAge() - var2.GetAge();
    }


    public static int minIDPer(ArrayList<Person> zpeople) {
        Collections.sort(zpeople, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.id - o2.id;
            }
        });
        return zpeople.get(0).id;
    }

    public static int maxIDPer(ArrayList<Person> zpeople) {
        Collections.sort(zpeople, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return -1*o1.id - o2.id;
            }
        });
        return zpeople.get(0).id;
    }


}
