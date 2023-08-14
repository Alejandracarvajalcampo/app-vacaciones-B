package appvacacionesB.service;

import appvacacionesB.percistence.Mapper.EmployeeMapper;
import appvacacionesB.percistence.Mapper.VacationRequestMapper;
import appvacacionesB.percistence.entity.EmployeeEntity;
import appvacacionesB.percistence.repository.EmployeeRepository;
import appvacacionesB.service.dto.EmployeeDto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static appvacacionesB.service.Security.Constanst.EXISTS_EMPLOYEE;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private VacationRequestMapper vacationRequestMapper;

    // crear un empleado
    public EmployeeDto createEmploye(EmployeeDto employee) throws Exception {
        if (employeeRepository.existsByDocument(employee.getDocument())) {
            throw new Exception(EXISTS_EMPLOYEE);
        } else {
            EmployeeEntity employeeEntity = employeeRepository.save(employeeMapper.toEmployeeEntity(employee));
            return employeeMapper.toEmployeeDto(employeeEntity);
        }
    }

    public List<EmployeeDto> getAllEmployees() {
        // Obtiene todas las entidades EmployeeEntity de la base de datos.
        List<EmployeeEntity> employeeEntities = (List<EmployeeEntity>) employeeRepository.findAll();
        // Inicializa una lista para almacenar los DTO de los empleados.
        List<EmployeeDto> employees = new ArrayList<>();
        // Itera a través de cada EmployeeEntity para convertirlo en un EmployeeDto y agregarlo a la lista.
        for (EmployeeEntity employeeEntity : employeeEntities) {
            EmployeeDto employee = employeeMapper.toEmployeeDto(employeeEntity);
            employees.add(employee);
        }
        // Devuelve la lista de DTO de empleados.
        return employees;
    }

    public Optional<EmployeeDto> findEmployeeByDocument(Integer document) {
        // Se busca una entidad EmployeeEntity por el número de documento en el repositorio.
        Optional<EmployeeEntity> employeeEntityOptional = employeeRepository.findByDocument(document);
        // Se verifica si se encontró una entidad EmployeeEntity.
        if (employeeEntityOptional.isPresent()) {
            // Si se encontró la entidad, se obtiene y luego se convierte en un DTO EmployeeDto.
            EmployeeEntity employeeEntity = employeeEntityOptional.get();
            EmployeeDto employee = employeeMapper.toEmployeeDto(employeeEntity);
            // Se devuelve un Optional que contiene el DTO EmployeeDto
            return Optional.of(employee);
        }
        // Si no se encontró la entidad, se devuelve un Optional vacío.
        return Optional.empty();
    }

    public EmployeeDto updateEmployee(EmployeeDto employee) {
        // Se busca al empleado existente en la base de datos por su ID
        Optional<EmployeeEntity> employeeOptional = employeeRepository.findById(employee.getIdEmployee());
       // Si se encuentra al empleado
        if (employeeOptional.isPresent()) {
            // Se obtiene la entidad del empleado existente
            EmployeeEntity existingEmployeeEntity = employeeOptional.get();
            // Se actualiza la información del empleado existente con la información del empleado actualizada
            EmployeeEntity updatedEmployeeEntity = employeeRepository.save(employeeMapper.toEmployeeEntity(employee));
            // Se convierte la entidad del empleado actualizada a un DTO (Objeto de Transferencia de Datos) y se devuelve
            return employeeMapper.toEmployeeDto(updatedEmployeeEntity);
        }
        // Si no se encuentra al empleado, se devuelve null
        return null;
    }
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}


