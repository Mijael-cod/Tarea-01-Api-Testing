package pe.edu.upeu.clase01.service;



import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.daoImpl.ShippersDaoIMpl;
import pe.edu.upeu.clase01.entity.Shippers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@Service

public class ShippersService implements Todo<Shippers>{
	
	@Autowired
	private ShippersDaoIMpl daoIMpl;
	@Override
	public int create(Shippers t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
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
		return daoIMpl.readAll();
	}

}
