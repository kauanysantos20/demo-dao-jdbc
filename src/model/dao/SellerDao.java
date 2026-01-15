package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	//reponsavel por inserir no banco de dados o obj que enviar como parametrp
		void insert(Seller obj);
		void update(Seller obj);
		void deleteById(Integer id);
	//reponsavel por pegar o ID e consultar no banco de dados um obj com esse ID
		Seller findById(Integer id);
		List<Seller> findAll();
		List<Seller> findByDepartment(Department department);
}
