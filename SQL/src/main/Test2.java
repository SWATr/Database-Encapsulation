package main;

import java.util.List;

import db.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test2 {

	
	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.hibProcedure("d001");
		obj.hibProcedure("d002");
		obj.hibProcedure("d003");
		obj.hibProcedure("d004");
	}
	
	/**
	 * Adds and/or replaces entries if deptno exsts.
	 * Does not allow same Department Names
	 * @param deptNo
	 * @param deptName
	 */
	public void hibProcedure(String deptNo)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try
		{

			Query q = session.getNamedQuery("callDepartmentProcedure").setParameter("deptCode", deptNo);
			Object dept = q.uniqueResult();
			System.out.println(dept);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
}


