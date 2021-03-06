package org.openmrs.module.hr.api.db.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.openmrs.module.hr.HrTraining;
import org.openmrs.module.hr.HrTrainingClass;
import org.openmrs.module.hr.api.db.HRTrainingDAO;

import java.util.ArrayList;
import java.util.List;

public class HibernateHRTrainingDAO implements HRTrainingDAO{

    protected Log log = LogFactory.getLog(this.getClass());

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public HrTraining saveTraining(HrTraining training) {
        log.debug("saving HrTraining instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(training);
            log.debug("save successful");
            return training;
        }
        catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    public void deleteTraining(HrTraining training) {
        log.debug("deleting HrTraining instance");
        try {
            sessionFactory.getCurrentSession().delete(training);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    public List<HrTraining> findTrainingByExample(HrTraining training) {
        log.debug("finding Training by example");
        try {
            List<HrTraining> results = sessionFactory.getCurrentSession().createCriteria(HrTraining.class).add(Example.create(training)).list();
            if(results!=null)
                log.debug("find by example successful, result size: " + results.size());
            else
                results=new ArrayList<HrTraining>();
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }
    public HrTraining getTrainingById( int id) {
        log.debug("getting HrTraining instance with id: " + id);
        try {
            HrTraining instance = (HrTraining) sessionFactory.getCurrentSession().get(HrTraining.class, id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    public List<HrTraining> getTrainings(Boolean includeRetired) {
        log.debug("getting all HrTrainings");
        try {
            Criteria criteria = sessionFactory.getCurrentSession().createCriteria(HrTraining.class);
            if(!includeRetired)
                criteria.add(Restrictions.ne("retired", true));
            List<HrTraining> trainingList = (List<HrTraining>) criteria.list();
            if (trainingList==null) {
                trainingList=new ArrayList<HrTraining>();
                log.debug("get successful, no trainings found");
            }
            else {
                log.debug("get successful, returning trainings found");
            }
            return trainingList;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    @Override
    public HrTraining getTrainingByUniqueId(String uuid) {
        return (HrTraining) sessionFactory.getCurrentSession().createQuery("from HrTraining where uuid = :uuid")
                .setString("uuid", uuid).uniqueResult();
    }

    @Override
    public List<HrTraining> getTrainings(Boolean includeRetired, Integer start, Integer length) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(HrTraining.class);
        if (!includeRetired)
            criteria.add(Restrictions.ne("retired", true));

        criteria.addOrder(Order.asc("trainingId"));

        if (start != null)
            criteria.setFirstResult(start);
        if (length != null && length > 0)
            criteria.setMaxResults(length);

        List<HrTraining> list = (List<HrTraining>) criteria.list();
        return list;
    }



    @Override
    public List<HrTraining> getTrainingsByCategory(String category, Integer start, Integer length) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(HrTraining.class);

        criteria.addOrder(Order.asc("trainingId"));
        criteria.add(Restrictions.eq("category",category));

        if (start != null)
            criteria.setFirstResult(start);
        if (length != null && length > 0)
            criteria.setMaxResults(length);

        List<HrTraining> list = (List<HrTraining>) criteria.list();
        return list;
    }
}
