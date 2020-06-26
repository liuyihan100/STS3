import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.gui.clone.Student;
import com.gui.clone.Teacher;

public class Test1 {
	
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Student student1 = new Student("liu",18,new Teacher("li",30));
		Student student2 = (Student)student1.clone();
		Student student3 = (Student)student1.deepClone();
		System.out.println(student1.getTeacher());
		System.out.println(student2.getTeacher());
		System.out.println(student3.getTeacher());
		System.out.println(student1.getName() == student2.getName());
		Scanner scanner = new Scanner(System.in);
		scanner.hasNext();
		ArrayList list = new ArrayList<>();
		Iterator it = list.iterator();
	}
}
