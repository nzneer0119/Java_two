package chap13.sec06;

import java.util.Arrays;

public class WildCardExample {

	public static void registerCourse(Course<?> course ) {                                                             // 모두 
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
		}
	
	public static void registerCourseStudent(Course<? extends Student> course ) {                         // 상위 제한
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course ) {                              // 하위 제한   
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);  // ("일반인과정", 5) - course class 의 public Course(String name, int capacity) 에 대입 / 배열 5개가 생성됨
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);                                        // 모두
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//registerCourseStudent(personCourse);                             // 상위 제한(extends) 으로 Student, HighStudent만 부름
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);                             // 하위 제한(super) 으로 Person, Worker만 부름
		//registerCourseWorker(highStudentCourse);
		System.out.println();
	}
}
