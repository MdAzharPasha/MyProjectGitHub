package CollectionsunderColection;

import java.util.Arrays;
import java.util.List;

public class Course {
public static void main(String[] args) {
	List<String> courses=Arrays.asList("core java","advanced java","springboot");
	List<String> uiCourses = Arrays.asList("HTML","javascript");
	List<List<String>> totalCourse = Arrays.asList(courses,uiCourses);
totalCourse.stream().map(null);

}
}
