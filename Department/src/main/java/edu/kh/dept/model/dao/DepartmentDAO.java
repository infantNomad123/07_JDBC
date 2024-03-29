package edu.kh.dept.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.kh.dept.model.dto.Department;

public interface DepartmentDAO {

	/** 부서 전체 조회
	 * @param conn
	 * @return deptList
	 * @throws SQLException
	 */
	List<Department> selectAll(Connection conn) throws SQLException;

	/**
	 * @param conn
	 * @param dept
	 * @return result
	 * @throws SQLException
	 */
	int insertDepartment(Connection conn, Department dept) throws SQLException;

	

	int deleteDepartment(Connection conn, String deptId) throws SQLException;

	/**부서 1행 조회
	 * @param conn
	 * @param deptId
	 * @return dept
	 * @throws SQLException
	 */
	Department selectOne(Connection conn, String deptId) throws SQLException;

	int updateDepartment(Connection conn, Department dept) throws SQLException;

	/**
	 * @param conn
	 * @param d
	 * @return deptList(조회 결과 없으면 비어있음)
	 * @throws SQLException
	 */
	List<Department> searchDepartment(Connection conn, String d) throws SQLException;

	


}
