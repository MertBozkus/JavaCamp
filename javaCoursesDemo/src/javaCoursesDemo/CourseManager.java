package javaCoursesDemo;

public class CourseManager {
		public void courseName(Course course) {
			System.out.println("Kurs Ad� : " + course.name);
		}
		
		public void courseTime(Course course) {
			System.out.println("Kurs S�resi : " + course.time + " Saat");
		}
		
		public void courseTeacherName(Course course) {
			System.out.println("E�itimci'nin Ad� : " + course.teacherName);
		}
}
