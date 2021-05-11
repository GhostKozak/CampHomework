package ghostkozak.hrms.business.abstracts;

import java.util.List;

import ghostkozak.hrms.entities.concretes.Jobs;

public interface JobsService {
	List<Jobs> getAll();
}
