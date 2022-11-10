import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Madina", "Halikova", 16, "English", "manty");
        System.out.println(myClass.getName() + "\n" + myClass.getSurname() + "\n" + myClass.getage() + "\n" + myClass.getLesson() + "\n" + myClass.getFood());
        String lesson = "Java";
        String lesson1 = "Java Script";
        String english = "English";
        String event = "Event";
        String softskill = "Soft Skill";
        String[] array = {lesson,lesson1, english,event,softskill,"Cafeteria"};
        MyClass myClass1 = new MyClass("Argen","Abdymomunov",18, array);
        System.out.println(myClass1.getName() + "\n" + myClass1.getSurname() + "\n" + myClass1.getage() + "\n" + Arrays.toString(myClass1.getPeaksoftLesson()));
    }
}