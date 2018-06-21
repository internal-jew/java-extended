package com.alevel.mitin.ExceptionPractice;

//3. Определите свой checked exception, пусть он принимает
// в конструктор строку с объяснением. Сохраните эту строку в виде поля.
public class Task3 {

    public void doSmth(String s) throws MyCheckedException {
        throw new MyCheckedException(s);
    }

    public static void main(String[] args) {
        System.out.println("first step");
        Task3 tt = new Task3();
        try {
            tt.doSmth("Something Wrong");
        } catch (MyCheckedException e) {
            System.out.println(e.getExplanation());
//            e.printStackTrace();
        }
        System.out.println("All done");
    }
}


class MyCheckedException extends Throwable {
    private String s;

    MyCheckedException(String s) {
        this.s = s;
    }

    public String getExplanation() {
        return s;
    }

}
