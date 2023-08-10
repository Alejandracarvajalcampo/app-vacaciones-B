package appvacacionesB.percistence.repository;

import appvacacionesB.percistence.entity.VacationRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRequestRepository extends JpaRepository <VacationRequestEntity , Long> {

}
