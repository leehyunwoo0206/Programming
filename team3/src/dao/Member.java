package dao;

import java.util.Date;

public class Member {
	private String M_Id;
	private String M_PASSWD;
	private String M_NAME;
	private String M_TEL;
	private String M_EMAIL;
	private	int M_GRADE;
	private Date M_RDATE;
	
	public String getM_ID() {
		return M_Id;
	}
	public void setM_Id(String m_ID) {
		M_Id = m_ID;
	}
	public String getM_Passwd() {
		return M_PASSWD;
	}
	public void setM_Passwd(String m_PASSWD) {
		M_PASSWD = m_PASSWD;
	}
	public String getM_NAME() {
		return M_NAME;
	}
	public void setM_NAME(String m_NAME) {
		M_NAME = m_NAME;
	}
	public String getM_TEL() {
		return M_TEL;
	}
	public void setM_TEL(String m_TEL) {
		M_TEL = m_TEL;
	}

	public String getM_EMAIL() {
		return M_EMAIL;
	}
	public void setM_EMAIL(String m_EMAIL) {
		M_EMAIL = m_EMAIL;
	}
	public int getM_GRADE() {
		return M_GRADE;
	}
	public void setM_GRADE(int m_GRADE) {
		M_GRADE = m_GRADE;
	}
	public Date getM_RDATE() {
		return M_RDATE;
	}
	public void setM_RDATE(Date m_RDATE) {
		M_RDATE = m_RDATE;
	}
	
	
}