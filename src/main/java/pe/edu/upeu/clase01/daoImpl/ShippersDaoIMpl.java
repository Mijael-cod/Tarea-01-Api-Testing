package pe.edu.upeu.clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.entity.Shippers;

@Component

public class ShippersDaoIMpl implements Todo<Shippers>{
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Shippers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Shippers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Shippers read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shippers> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from shippers", new BeanPropertyRowMapper<Shippers>(Shippers.class));
	}

}
