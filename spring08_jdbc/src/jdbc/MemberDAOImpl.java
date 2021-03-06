package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MemberDAOImpl implements MemberDAO{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void register(MemberVO member) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO member2 VALUES(");
		sql.append("?,?,?,?)");

		Object[] param = {member.getId(), member.getPassword(), member.getName(), member.getAddress()};
		jdbcTemplate.update(sql.toString(), param);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MemberVO> getList() {
		String sql = "SELECT * FROM member2";
		List<MemberVO> list = jdbcTemplate.query(sql, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {//arg1 ?
				System.out.println("arg1 :: "+arg1);

				MemberVO vo = new MemberVO(
						rs.getString("id"), 
						rs.getString("password"), 
						rs.getString("name"), 
						rs.getString("address"));
				return vo;

			}
		});
		return list;
	}
	

	@Override
	public MemberVO getSearch(String id) {
		String sql = "SELECT * FROM member2 WHERE id=?";
		Object[] param= {id};
		
		MemberVO member = (MemberVO) jdbcTemplate.queryForObject(sql, param, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				System.out.println("arg1 :: "+arg1);
				
				MemberVO vo = new MemberVO(
						rs.getString("id"), 
						rs.getString("password"), 
						rs.getString("name"), 
						rs.getString("address"));
				
				return vo;
			}

		});
		return member;
	}

}
