package com.neuedu.model.service;

import java.sql.Connection;
import java.util.List;

import com.neuedu.model.dao.ManageTitleDAO;
import com.neuedu.model.dao.ManageTitleDAOImp;
import com.neuedu.model.po.OneTitle;
import com.neuedu.model.po.TwoTitle;
import com.neuedu.utils.DBUtil;

public class ManageTitleService {

	private ManageTitleService(){
		
	}
	private static ManageTitleService service = new ManageTitleService();
	public static ManageTitleService getInstance() {
		return service;
	}

	public void newOneTitle(OneTitle oneTitle) {
		Connection conn = DBUtil.getConn();
		DBUtil.beginTransaction(conn);
		try {
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		dao.addOneTitle(oneTitle);
		DBUtil.commit(conn);
		}catch(Exception e) {
			DBUtil.rollback(conn);
		}finally {
			DBUtil.closeConn(conn);
		}
	}

	public void newTwoTitle(TwoTitle twoTitle) {

				Connection conn = DBUtil.getConn();
				DBUtil.beginTransaction(conn);
				try {
				ManageTitleDAO dao = new ManageTitleDAOImp(conn);
				dao.addTwoTitle(twoTitle);
				DBUtil.commit(conn);
				}catch(Exception e) {
					DBUtil.rollback(conn);
				}finally {
					DBUtil.closeConn(conn);
				}
	}
	public List<OneTitle> selectOneTitle(String onetitle_name) {
				Connection conn = DBUtil.getConn();
				ManageTitleDAO dao = new ManageTitleDAOImp(conn);
				return dao.selectOneList(onetitle_name);
	}
	public List<TwoTitle> selectTwoTitle(String twotitle_name) {
				Connection conn = DBUtil.getConn();
				ManageTitleDAO dao = new ManageTitleDAOImp(conn);
				return dao.selectTwoList(twotitle_name);
	}
	public List<OneTitle> selectOneTitle(String onetitle_name, int pageNum, int pageSize) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectOneList(onetitle_name,pageNum,pageSize);
	}

	public List<TwoTitle> selectTwoTitle(String twotitle_name, int pageNum, int pageSize) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectTwoList(twotitle_name,pageNum,pageSize);
	}
	public int selectOnePage(String onetitle_name, int pageSize) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectOnePage(onetitle_name,pageSize);
	}
	public int selectTwoPage(String twotitle_name, int pageSize) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectTwoPage(twotitle_name,pageSize);
	}
	public void updateTwoTitle(TwoTitle twoTitle) {

				Connection conn = DBUtil.getConn();

				DBUtil.beginTransaction(conn);
				try {
				ManageTitleDAO dao = new ManageTitleDAOImp(conn);
				dao.updateTwoTitle(twoTitle);

				DBUtil.commit(conn);
				}catch(Exception e) {
					DBUtil.rollback(conn);
				}finally {
					DBUtil.closeConn(conn);
				}
	}
	public void updateOneTitle(OneTitle oneTitle) {

			Connection conn = DBUtil.getConn();

			DBUtil.beginTransaction(conn);
			try {
				ManageTitleDAO dao = new ManageTitleDAOImp(conn);
				dao.updateOneTitle(oneTitle);

				DBUtil.commit(conn);
			}catch(Exception e) {
				DBUtil.rollback(conn);
			}finally {
				DBUtil.closeConn(conn);
			}
	}
	public String selectOneNameById(int onetitle_id) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectOneNameById(onetitle_id);
	}
	public void deleteTwoTitle(int twotitle_id) {

		Connection conn = DBUtil.getConn();

		DBUtil.beginTransaction(conn);
		try {
			ManageTitleDAO dao = new ManageTitleDAOImp(conn);
			dao.deleteTwoTitle(twotitle_id);

			DBUtil.commit(conn);
		}catch(Exception e) {
			DBUtil.rollback(conn);
		}finally {
			DBUtil.closeConn(conn);
		}
	}
	public void deleteOneTitle(int onetitle_id) {

		Connection conn = DBUtil.getConn();

		DBUtil.beginTransaction(conn);
		try {
			ManageTitleDAO dao = new ManageTitleDAOImp(conn);
			dao.deleteOneTitle(onetitle_id);

			DBUtil.commit(conn);
		}catch(Exception e) {
			DBUtil.rollback(conn);
		}finally {
			DBUtil.closeConn(conn);
		}
	}
	public String oneTitleIsDelete(int onetitle_id) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.oneTitleIsDelete(onetitle_id);
	}
	public List<TwoTitle> selectTwoTitle(int onetitle_id) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectTwoList(onetitle_id);
	}
	public String selectTwoNameById(int twotitle_id) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectTwoNameById(twotitle_id);
	}
	public String selectOneNameByTwoId(int twotitle_id) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectOneNameByTwoId(twotitle_id);
	}
	public List<OneTitle> selectOneTitleById(int onetitle_id) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectOneTitleById(onetitle_id);
	}
	public List<TwoTitle> selectTwoTitleById(int twotitle_id) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectTwoTitleById(twotitle_id);
	}
	public String twoTitleIsDelete(int twotitle_id) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.twoTitleIsDelete(twotitle_id);
	}

	public int selectOneIdByTwoId(int twotitle_id) {
		Connection conn = DBUtil.getConn();
		ManageTitleDAO dao = new ManageTitleDAOImp(conn);
		return dao.selectOneIdByTwoId(twotitle_id);
	}
}
