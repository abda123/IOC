/**
 * 
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import metier.IMetier;
import metier.MetierImpl;
import dao.DaoImpl;
import dao.IDao;

/**
 * @author BALDE Baba-Abdoulaye
 *
 * 30 nov. 2016
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Developpement par reflexion
		 */
		// TODO Auto-generated method stub
		/*
		 * Methode classique
		 */
//		IDao dao = new DaoImpl();
//		MetierImpl metier= new MetierImpl();
//		metier.setDao(dao);
//		System.out.println(metier.calcul());
		Scanner scanner;
		try {
			scanner = new Scanner(new File("config.text"));
			String classDao= scanner.next();
			String classMetier=scanner.next();
			Class cdao = Class.forName(classDao);
			IDao objetDao =(IDao)cdao.newInstance();
			/*
			 * Utilisation de l'intanciation dynamique
			 */
			Class cmetier = Class.forName(classMetier);
			
			MetierImpl objetMetier = (MetierImpl) cmetier.newInstance();
			/*
			 * Invocation de la methode de la classe metierImpl.
			 */
			Method method= cmetier.getMethod("setDao" ,new Class[]{IDao.class});
			method.invoke(objetMetier, new Object[]{objetDao});
			System.out.println(objetMetier.calcul());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
