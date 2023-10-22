package com.sunbeam.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.Users;
import com.sunbeam.UsersDAO;

public class Tester {

	public static int menu() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("---------------------");
		System.out.println("0.EXIT");
		System.out.println("1.SHOW ALL USERS");
		System.out.println("2.UPDATE USERS");
		System.out.println("3.INSERT USER");
		System.out.println("4.DELETE USERS BY ID");
		choice = scanner.nextInt();
		System.out.println("---------------------");
		return choice;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;
		Users user;
		try (UsersDAO usersDAO = new UsersDAO()) {
			while ((choice = menu()) != 0) {
				switch (choice) {
				case 1:// Show All users
				{
					List<Users> usersList=new ArrayList<>();
					usersList=usersDAO.showAllUser();
					usersList.forEach(x->System.out.println(x));
				}
					break;
				case 2:// Update user by id
				{
					System.out.print("Enter id to update:");
					int id=scanner.nextInt();
					System.out.println("Enter first name:");
					scanner.nextLine();
					String fname=scanner.next();
					System.out.println("Enter last name:");
					scanner.nextLine();
					String lname=scanner.next();
					System.out.println("Enter email:");
					scanner.nextLine();
					String email=scanner.next();
					System.out.println("Enter password:");
					scanner.nextLine();
					String password=scanner.next();
					System.out.println("Enter dob(dd-MM-yyyy):");
					scanner.nextLine();
					String dob=scanner.next();
					System.out.println("Enter status true/false:");
					boolean status=scanner.nextBoolean();
					System.out.println("Enter role:");
					scanner.nextLine();
					String role=scanner.next();
					user=new Users(id,fname,lname,email,password,dob,status,role);
					System.out.println("Rows affected:"+usersDAO.updateUser(user));
				}
					break;
				case 3:// Insert user
				{
					System.out.print("Enter id:");
					int id=scanner.nextInt();
					System.out.println("Enter first name:");
					scanner.nextLine();
					String fname=scanner.next();
					System.out.println("Enter last name:");
					scanner.nextLine();
					String lname=scanner.next();
					System.out.println("Enter email:");
					scanner.nextLine();
					String email=scanner.next();
					System.out.println("Enter password:");
					scanner.nextLine();
					String password=scanner.next();
					System.out.println("Enter dob(dd-MM-yyyy):");
					scanner.nextLine();
					String dob=scanner.next();
					System.out.println("Enter status true/false:");
					boolean status=scanner.nextBoolean();
					System.out.println("Enter role:");
					scanner.nextLine();
					String role=scanner.next();
					user=new Users(id,fname,lname,email,password,dob,status,role);
					System.out.println("Rows inserted:"+usersDAO.insertUser(user));
				}
					break;
				case 4:// Delete user by id
				{
					System.out.println("Enter id to delete user:");
					int id=scanner.nextInt();
					System.out.println("User deleted:"+usersDAO.deleteUser(id));
				}
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thank you!!");
	}
}
