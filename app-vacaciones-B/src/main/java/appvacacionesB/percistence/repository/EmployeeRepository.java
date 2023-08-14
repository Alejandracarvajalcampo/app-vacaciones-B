package appvacacionesB.percistence.repository;

import appvacacionesB.percistence.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    //busca en la base de datos en la entidad empleado si existe el documento si no devuelve un
    // optional vacion el optinal se usa para buscar datos que pueder o no estar presentes en la
    // base de datos es decir pueden ser nulos o no
    Optional<EmployeeEntity> findByDocument(Integer document);
    boolean existsByDocument(Integer document);
}

