package view;

import org.hibernate.Session;

import controller.HibernateUtil;
import model.Alunos;

public class App {

	public static void main(String[] args) {
		Alunos alunos = new Alunos();
		alunos.setNome("Matheus Antonio");
		alunos.setEndereco("Av Nordestina");
		
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(alunos);
			session.getTransaction().commit();

	}

}
