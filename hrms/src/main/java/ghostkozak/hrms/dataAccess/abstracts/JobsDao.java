package ghostkozak.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ghostkozak.hrms.entities.concretes.Jobs;

public interface JobsDao extends JpaRepository<Jobs, Integer> {

}
