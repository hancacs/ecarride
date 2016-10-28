package dev.interfaces;

import dev.models.TaxiUsers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

/**
 * Interface for TaxiUsersDAO.
 * 
 * @author MyEclipse Persistence Tools
 */
@Repository
public interface ITaxiUsersDAO extends CrudRepository<TaxiUsers, Integer>{

	public TaxiUsers save(TaxiUsers entity);

	public void delete(TaxiUsers entity);

	public TaxiUsers findById(Integer id);

	public List<TaxiUsers> findAll();
}