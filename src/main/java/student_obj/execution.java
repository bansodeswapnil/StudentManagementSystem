package student_obj;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class execution {
	public static void main(String[] args) {
		System.out.println("enter your choice");
		System.out.println("1.addStudent");
		System.out.println("2.viewStudent");
		System.out.println("3.removeStudent");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("enter id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter email");
			String email=sc.nextLine();
			System.out.println("enter phone_no");
			long phone_no=sc.nextLong();
			Student s=new Student(id,name,email,phone_no);
			Queries q=new Queries();
			q.addStudent(s.getId(),s.getName(),s.getEmail(),s.getPhone_no());
		}
		else if(choice==2) {
			Queries q=new Queries();
			ResultSet res=q.viewStudent();
			try {
				while(res.next()) {
					System.out.println(res.getInt(1));
					System.out.println(res.getString("student_name"));
					System.out.println(res.getString(3));
					System.out.println(res.getLong("phone_no"));	
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(choice==3) {
			System.out.println("enter id");
			int id=sc.nextInt();
			Queries q=new Queries();
			q.deleteStudent(id);
		}
	}
}
