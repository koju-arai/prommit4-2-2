import com.example.model.Student;
import com.example.model.Teacher;
import com.example.service.SchoolService;

public class Main {
    public static void main(String[] args) {

        SchoolService ss = new SchoolService();
        
        Student std1 = new Student("田中太郎", 11, "6-1", 12);
        Student std2 = new Student("山田太郎", 6, "1-2", 30);
        Student std3 = new Student("鈴木太郎", 10, "4-3", 15);

        ss.addStudent(std1);
        ss.addStudent(std2);
        ss.addStudent(std3);

        Teacher tch1 = new Teacher("佐藤太郎", 25, "国語");
        Teacher tch2= new Teacher("伊藤太郎", 30, "算数");
        Teacher tch3 = new Teacher("渡辺太郎", 46, "社会");

        ss.addTeacher(tch1);
        ss.addTeacher(tch2);
        ss.addTeacher(tch3);

        ss.outputList();
    };
}
