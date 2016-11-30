/**
 * 
 */
package metier;

import dao.DaoImpl;
import dao.IDao;

/**
 * @author BALDE Baba-Abdoulaye
 *
 * 30 nov. 2016
 */
public class MetierImpl1 implements IMetier {

	private IDao dao;
	
	public double calcul() {
		double value = dao.getValue();
		return 2*value;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
