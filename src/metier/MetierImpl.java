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
public class MetierImpl implements IMetier {

	private IDao dao;
	public double calcul() {
		
		double resultat=dao.getValue()*3;
		return resultat;
		
	}
	
	public IDao getDao() {
		return dao;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}


}
