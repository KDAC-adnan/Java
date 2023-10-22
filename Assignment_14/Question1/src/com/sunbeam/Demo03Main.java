package com.sunbeam;

import java.util.List;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023 Author: Nilesh Ghule
 * <nilesh@sunbeaminfo.com> Time: 2023-10-22 12:53
 */

public class Demo03Main {
	public static int menu() {
		int choice = -1;
		Scanner scanner = new Scanner(System.in); 
			System.out.println("----------------------------------");
			System.out.println("0.EXIT");
			System.out.println("1.Show all candidates");
			System.out.println("2.Enter new candidate");
			System.out.println("3.Update candidate");
			System.out.println("4.Show party wise votes");
			System.out.println("5.Delete user by id");
			System.out.println("6.Show candidates of given part");
			System.out.println("7.Increment Candidate vote");
			choice = scanner.nextInt();
			System.out.println("----------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
			try (CandidateDao dao = new CandidateDao()) {
				while ((choice = menu()) != 0) {
					switch (choice) {
					case 1:// Show all candidates
						dao.findAll().forEach(c -> System.out.println(c));
						break;
					case 2:// Enter new candidate
					{
						System.out.print("Enter name:");
						String name = scanner.nextLine();
						System.out.print("Enter party name:");
						String party = scanner.next();
						System.out.print("Enter Votes:");
						int votes = scanner.nextInt();
						Candidate candidate = new Candidate(name, party, votes);
						System.out.println("Rows inserted:" + dao.save(candidate));
					}
						break;
					case 3:// Update Candidate
					{
						System.out.print("Enter Candidate ID:");
						int id = scanner.nextInt();
						System.out.print("Enter name:");
						scanner.nextLine();
						String name = scanner.nextLine();
						System.out.print("Enter party name:");
						String party = scanner.next();
						Candidate candidate = new Candidate(id, name, party, 0);
						System.out.println("Rows Updated:" + dao.update(candidate));
					}
						break;
					case 4:// Show party wise votes
					{
						dao.getPartywiseVotes().forEach(pv -> System.out.println(pv));
					}
						break;
					case 5:// Delete user by id
					{
						System.out.print("Enter candidate id to be deleted: ");
						int id = scanner.nextInt();
						int cnt = dao.deleteById(id);
						System.out.println("Candidates deleted: " + cnt);
					}
						break;
					case 6:// Show candidates of given party
					{
						System.out.print("Enter party: "); 
						String party = scanner.next(); 
						List<Candidate>list = dao.findByParty(party);
						list.forEach(c -> System.out.println(c));
					}
						break;
					case 7:// Increment Candidate vote
					{
						System.out.print("Enter candidate id (to vote): ");
						int candidateId = scanner.nextInt();
						int cnt = dao.incrementVote(candidateId);
						System.out.println("Rows updated: " + cnt);
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
