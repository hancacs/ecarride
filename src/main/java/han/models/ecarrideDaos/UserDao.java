package han.models.ecarrideDaos;

import javax.transaction.Transactional;

import han.models.ecarrideModels.TaxiUsersEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * A DAO for the entity User is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 * 
 * @author han
 */
@Transactional
public interface UserDao extends CrudRepository<TaxiUsersEntity, Integer> {

  /**
   * Return the user having the passed email or null if no user is found.
   * 
   * @param email the user email.
   */
  public TaxiUsersEntity findByEmail(String email);

  public TaxiUsersEntity findById(int id);

  public TaxiUsersEntity findByUsername(String username);

  public List<TaxiUsersEntity> findAll();

} // class UserDao
