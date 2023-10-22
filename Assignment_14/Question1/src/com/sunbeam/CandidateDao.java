package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Core Java @ Sunbeam Karad Sep 2023 Author: Nilesh Ghule
 * <nilesh@sunbeaminfo.com> Time: 2023-10-22 13:01
 */

public class CandidateDao implements AutoCloseable {
	private Connection con;

	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// delete given candidate
	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM candidates WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
	}

	// update candidate
	public int update(Candidate c) throws SQLException {
		int rowsAffected = -1;
		String sql = "UPDATE candidates SET name=?,party=? WHERE id=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, c.getName());
			pstmt.setString(2, c.getParty());
			pstmt.setInt(3, c.getId());
			rowsAffected = pstmt.executeUpdate();
		}
		return rowsAffected;
	}

	// get all candidates
	public List<Candidate> findAll() throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

	// increment candidate vote
	public int incrementVote(int candidateId) throws SQLException {
		String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
	}

	// get all candidates of given party
	public List<Candidate> findByParty(String givenParty) throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, givenParty);
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

	// Add a new Candidate
	public int save(Candidate c) throws SQLException {
		int rowsAffected = -1;
		String sql = "INSERT INTO candidates VALUES(default,?,?,?)";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, c.getName());
			pstmt.setString(2, c.getParty());
			pstmt.setInt(3, c.getVotes());
			rowsAffected = pstmt.executeUpdate();

		}
		return rowsAffected;
	}

	// get partywise vote count
	List<PartyVotes> getPartywiseVotes() throws SQLException {
		List<PartyVotes> list = new ArrayList<>();
		String sql = "SELECT party,sum(votes) FROM candidates group by party";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			try (ResultSet res = pstmt.executeQuery()) {
				while(res.next())
				{
					String party=res.getString("party");
					int votes=res.getInt("sum(votes)");
					PartyVotes partyVotes=new PartyVotes(party,votes);
					list.add(partyVotes);
				}
			}
		}
		return list;
	}
}
