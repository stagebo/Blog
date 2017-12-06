package com.blog.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.blog.po.TUser;

/**
 * A data access object (DAO) providing persistence and search support for TUser
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.blog.po.TUser
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TUserDAO {
	private static final Logger log = LoggerFactory.getLogger(TUserDAO.class);
	// property constants
	public static final String _FNAME = "FName";
	public static final String _FNICKNAME = "FNickname";
	public static final String _FTEL = "FTel";
	public static final String _FEMAIL = "FEmail";
	public static final String _FPASSWORD = "FPassword";
	public static final String _FSEX = "FSex";
	public static final String _FAGE = "FAge";
	public static final String _FINTRODUCTION = "FIntroduction";
	public static final String _FIDCARDNUM = "FIdcardnum";
	public static final String _FADDR = "FAddr";
	public static final String _FUSERLEVEL = "FUserlevel";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(TUser transientInstance) {
		log.debug("saving TUser instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TUser persistentInstance) {
		log.debug("deleting TUser instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TUser findById(java.lang.String id) {
		log.debug("getting TUser instance with id: " + id);
		try {
			TUser instance = (TUser) getCurrentSession().get(
					"com.jesus.sshframework.model.TUser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TUser instance) {
		log.debug("finding TUser instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.jesus.sshframework.model.TUser")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TUser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TUser as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFName(Object FName) {
		return findByProperty(_FNAME, FName);
	}

	public List findByFNickname(Object FNickname) {
		return findByProperty(_FNICKNAME, FNickname);
	}

	public List findByFTel(Object FTel) {
		return findByProperty(_FTEL, FTel);
	}

	public List findByFEmail(Object FEmail) {
		return findByProperty(_FEMAIL, FEmail);
	}

	public List findByFPassword(Object FPassword) {
		return findByProperty(_FPASSWORD, FPassword);
	}

	public List findByFSex(Object FSex) {
		return findByProperty(_FSEX, FSex);
	}

	public List findByFAge(Object FAge) {
		return findByProperty(_FAGE, FAge);
	}

	public List findByFIntroduction(Object FIntroduction) {
		return findByProperty(_FINTRODUCTION, FIntroduction);
	}

	public List findByFIdcardnum(Object FIdcardnum) {
		return findByProperty(_FIDCARDNUM, FIdcardnum);
	}

	public List findByFAddr(Object FAddr) {
		return findByProperty(_FADDR, FAddr);
	}

	public List findByFUserlevel(Object FUserlevel) {
		return findByProperty(_FUSERLEVEL, FUserlevel);
	}

	public List findAll() {
		log.debug("finding all TUser instances");
		try {
			String queryString = "from TUser";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TUser merge(TUser detachedInstance) {
		log.debug("merging TUser instance");
		try {
			TUser result = (TUser) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TUser instance) {
		log.debug("attaching dirty TUser instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TUser instance) {
		log.debug("attaching clean TUser instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TUserDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TUserDAO) ctx.getBean("TUserDAO");
	}
}