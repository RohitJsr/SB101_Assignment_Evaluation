package com.masaiQ3;

import java.util.Objects;

public class Member {
    private int memberId;
    private String memberName;
    private int membershipNo;
    private int membershipEnddate;
	public Member(int memberId, String memberName, int membershipNo, int membershipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEnddate = membershipEnddate;
	}
	public Member() {
		super();
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMembershipNo() {
		return membershipNo;
	}
	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}
	public int getMembershipEnddate() {
		return membershipEnddate;
	}
	public void setMembershipEnddate(int membershipEnddate) {
		this.membershipEnddate = membershipEnddate;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo=" + membershipNo
				+ ", membershipEnddate=" + membershipEnddate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(memberId, memberName, membershipEnddate, membershipNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return memberId == other.memberId && Objects.equals(memberName, other.memberName)
				&& membershipEnddate == other.membershipEnddate && membershipNo == other.membershipNo;
	}
    
    
}
