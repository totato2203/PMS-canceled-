package pms.a01_Jangho.a03_DAO;
// pms.a01_Jangho.a03_DAO.MemberDao

import org.springframework.stereotype.Repository;

import pms.a01_Jangho.a04_VO.Member;

@Repository
public interface MemberDao {
	public int checkMember(String id);
	public Member getMember(Member m);
}
