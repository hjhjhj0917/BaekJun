package exam1;

public class OverrideMain {
    public static void main(String[] args) {

        Parent parent = new Child();

        System.out.println(parent.cal(5, 6));
    }
}
