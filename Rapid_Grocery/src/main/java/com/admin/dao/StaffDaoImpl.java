package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.bean.LoggerInfo;
import com.admin.bean.LoginBean;
import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;


@Repository("staffDao")
public class StaffDaoImpl implements StaffDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addStaff(UserMaster userMaster) {
		sessionFactory.getCurrentSession().saveOrUpdate(userMaster);//database ma update ne insert kari aavse
	}
	
	@SuppressWarnings("unchecked")
	public List<UserMaster> listStaffRegistrations() {
		return (List<UserMaster>) sessionFactory.getCurrentSession().createCriteria(UserMaster.class).list();
	}
//id>0 update  id==0 insert
	public UserMaster getStaffRegistration(int user_master_Id) {
		return (UserMaster) sessionFactory.getCurrentSession().get(UserMaster.class, user_master_Id);
	}

	public void deleteStaff(UserMaster userMaster) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM UserMaster WHERE user_master_Id = "+userMaster.getUser_master_Id()).executeUpdate();
	}	
	
	@Override
	public List<UserType> listUserTypes()
	{
		return(List<UserType>) sessionFactory.getCurrentSession().createCriteria(UserType.class).list();
	}
	
	@Override
	public List<Course> listCourses()
	{
		return(List<Course>) sessionFactory.getCurrentSession().createCriteria(Course.class).list();
	}
	
	@Override
	public LoggerInfo getLoggerInfo(LoginBean loginBean) {
		// TODO Auto-generated method stub
		String sql = "select u from UserMaster u where user_Email = '" +loginBean.getUser_Email()+ "' and user_Password = '" + loginBean.getUser_Password()+ "'";
		List<UserMaster> usermasterList = sessionFactory.getCurrentSession().createQuery(sql).list();
		LoggerInfo info = new LoggerInfo();
		if(!usermasterList.isEmpty()) {
			UserMaster usermaster = usermasterList.get(0);
			info.setUser_type_id(usermaster.getUser_type_Id());
			info.setUserName(usermaster.getUser_Fname());
			return info;
		}
		return null;
	}

}
