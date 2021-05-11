package ghostkozak.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ghostkozak.hrms.business.abstracts.JobsService;
import ghostkozak.hrms.dataAccess.abstracts.JobsDao;
import ghostkozak.hrms.entities.concretes.Jobs;

@Service
public class JobsManager implements JobsService {
	private JobsDao jobsDao;
	
	@Autowired
	public JobsManager(JobsDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}

	@Override
	public List<Jobs> getAll() {
		return this.jobsDao.findAll();
	}
}
