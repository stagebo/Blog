package com.blog.dao;

import java.sql.Timestamp;
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

import com.blog.po.TMessage;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMessage entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.blog.dao.TMessage
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TMessageDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TMessageDAO.class);
	// property constants
	public static final String _FROOTID = "FRootid";
	public static final String _FPID = "FPid";
	public static final String _FOWNERID = "FOwnerid";
	public static final String _FOWNERTYPE = "FOwnertype";
	public static final String _FPIDLIST = "FPidlist";
	public static final String _FCONTENT = "FContent";

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

	public void save(TMessage transientInstance) {
		log.debug("saving TMessage instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TMessage persistentInstance) {
		log.debug("deleting TMessage instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TMessage findById(java.lang.String id) {
		log.debug("getting TMessage instance with id: " + id);
		try {
			TMessage instance = (TMessage) getCurrentSession().get(
					"com.blog.dao.TMessage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TMessage instance) {
		log.debug("finding TMessage instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.blog.dao.TMessage")
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
		log.debug("finding TMessage instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TMessage as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFRootid(Object FRootid) {
		return findByProperty(_FROOTID, FRootid);
	}

	public List findByFPid(Object FPid) {
		return findByProperty(_FPID, FPid);
	}

	public List findByFOwnerid(Object FOwnerid) {
		return findByProperty(_FOWNERID, FOwnerid);
	}

	public List findByFOwnertype(Object FOwnertype) {
		return findByProperty(_FOWNERTYPE, FOwnertype);
	}

	public List findByFPidlist(Object FPidlist) {
		return findByProperty(_FPIDLIST, FPidlist);
	}

	public List findByFContent(Object FContent) {
		return findByProperty(_FCONTENT, FContent);
	}

	public List findAll() {
		log.debug("finding all TMessage instances");
		try {
			String queryString = "from TMessage";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TMessage merge(TMessage detachedInstance) {
		log.debug("merging TMessage instance");
		try {
			TMessage result = (TMessage) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TMessage instance) {
		log.debug("attaching dirty TMessage instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TMessage instance) {
		log.debug("attaching clean TMessage instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TMessageDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TMessageDAO) ctx.getBean("TMessageDAO");
	}
}