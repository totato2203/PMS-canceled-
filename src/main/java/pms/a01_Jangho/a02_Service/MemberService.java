package pms.a01_Jangho.a02_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pms.a01_Jangho.a03_DAO.MemberDao;
import pms.a01_Jangho.a04_VO.Member;

@Service
public class MemberService {
	@Autowired(required=false)
	private MemberDao dao;
	public int checkMember(String id) {
		return dao.checkMember(id);
	}
	public Member getMember(Member m) {
		return dao.getMember(m);
	}
}
