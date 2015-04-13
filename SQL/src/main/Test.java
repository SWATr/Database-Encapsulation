package main;

import db.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.forceAddDept("d011","Test");
	}
	
	/**
	 * Adds and/or replaces entries if deptno exsts.
	 * Does not allow same Department Names
	 * @param deptNo
	 * @param deptName
	 */
	public void forceAddDept(String deptNo, String deptName)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try
		{
			transaction = session.beginTransaction();
			
			Departments oldDept =  (Departments)session.get(Departments.class, deptNo); 
			if(oldDept != null)
			{          
				session.delete(oldDept);  
			}

			Departments dept = new Departments();
			dept.setDeptNo(deptNo);
			dept.setDeptName(deptName);
			session.save(dept);
			transaction.commit();
			System.out.println("Data Updated");
		
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


