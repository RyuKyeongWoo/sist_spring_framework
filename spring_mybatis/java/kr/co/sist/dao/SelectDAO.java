package kr.co.sist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.domain.DeptDomain;
import kr.co.sist.domain.EmpDomain;


public class SelectDAO {
	
	public SelectDAO() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}
	
	public String selectSingleColumn() {
		String dname ="";
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		dname = ss.selectOne("kr.co.sist.selectMapper.singleColumn");
		if(ss != null) {
			ss.close();
		}
		return dname;
	}
	
	public DeptDomain selectMultiColumn() {
		DeptDomain dd =null;
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		dd = ss.selectOne("kr.co.sist.selectMapper.multiColumn");
		if(ss != null) {
			ss.close();
		}
		return dd;
	}
	
	public List<String> selectSingleColumnMultiRow() {
		 List<String> list =null;
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list = ss.selectList("kr.co.sist.selectMapper.singleColumnMultiRow");
		if(ss != null) {
			ss.close();
		}
		return list;
	}
	
	public List<EmpDomain> selectMultiColumnMultiRow() {
		List<EmpDomain> list =null;
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list = ss.selectList("kr.co.sist.selectMapper.multiColumnMultiRow");
		if(ss != null) {
			ss.close();
		}
		return list;
	}
	
	public List<EmpDomain> selectGreaterThan(int sal) {
		List<EmpDomain> list =null;
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list = ss.selectList("kr.co.sist.selectMapper.greaterThan", sal);
		if(ss != null) {
			ss.close();
		}
		return list;
	}
	
	public List<EmpDomain> selectLessThan(int sal) {
		List<EmpDomain> list =null;
		//1. MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. id�� �ش��ϴ� ������ ã�Ƽ� ������ �� ��� ���
		list = ss.selectList("kr.co.sist.selectMapper.lessThan", sal);
		if(ss != null) {
			ss.close();
		}
		return list;
	}
	
}