public class Tree implements IAmOld {
    public int height,age;

    public int GetAge() {
        return this.age;
    }

    public Tree(int height, int age) {
        this.height = height;
        this.age = age;
    }

    public String toString() {
        return "Tree{" +
                "height=" + height +
                ", age=" + age +
                '}';
    }
}
