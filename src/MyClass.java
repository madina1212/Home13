public class MyClass {
    private String Name;
    private String Surname;
    private int Age;
    private String Lesson;
    private String food;

    private String[] peaksoftLesson;

    public MyClass(String Name,String Surname,int Age,String Lesson,String Food){
        this.Name=Name;
        this.Surname=Surname;
        this.Age=Age;
        this.Lesson=Lesson;
        this.food=Food;
    }

    public MyClass(String name, String surname, int age, String[] peaksoftLesson) {
        this.Name=name;
        this.Surname=surname;
        this.Age=age;
        this.peaksoftLesson = peaksoftLesson;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getage(){
        return Age;
    }

    public String getLesson() {
        return Lesson;
    }

    public String getFood() {
        return food;
    }

    public String[] getPeaksoftLesson() {
        return peaksoftLesson;
    }

    public void setPeaksoftLesson(String[] peaksoftLesson) {
        this.peaksoftLesson = peaksoftLesson;
    }
}

