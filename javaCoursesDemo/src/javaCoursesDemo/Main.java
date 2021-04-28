package javaCoursesDemo;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course("Java", 18, "Engin Demiro�");
		Course course2 = new Course("Python", 15, "Engin Demiro�");
		Course course3 = new Course();
		course3.name = "C#";
		course3.time = 17;
		course3.teacherName = "Engin Demiro�";
		
		System.out.println("--------------------------------");
			
		CourseManager courseManager = new CourseManager();
		courseManager.courseName(course1);
		courseManager.courseTime(course1);
		courseManager.courseTeacherName(course1);
		
		System.out.println("--------------------------------");
		
		courseManager.courseName(course2);
		courseManager.courseTime(course2);
		courseManager.courseTeacherName(course2);
		
		System.out.println("--------------------------------");
		
		courseManager.courseName(course3);
		courseManager.courseTime(course3);
		courseManager.courseTeacherName(course3);
		
		
	}

}
