package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	//reponsavel por inserir no banco de dados o obj que enviar como parametrp
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	//reponsavel por pegar o ID e consultar no banco de dados um obj com esse ID
	Department findById(Integer id);
	List<Department> findAll();
	
}
