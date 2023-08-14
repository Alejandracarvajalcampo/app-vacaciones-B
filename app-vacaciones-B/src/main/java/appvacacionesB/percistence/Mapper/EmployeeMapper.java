package appvacacionesB.percistence.Mapper;

import appvacacionesB.percistence.entity.EmployeeEntity;
import appvacacionesB.service.dto.EmployeeDto;

import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface EmployeeMapper {

//    @Mappings({
//            @Mapping(source = "idEmployee", target = "idEmployee"),
//            @Mapping(source = "document", target = "document"),
//            @Mapping(source = "documentType", target = "documentType"),
//            @Mapping(source = "names", target = "names"),
//            @Mapping(source = "surnames", target = "surnames"),
//            @Mapping(source = "phone", target = "phone"),
//            @Mapping(source = "charge", target = "charge"),
//            @Mapping(source = "admissionDate", target = "admissionDate"),
//            @Mapping(source = "typeContract", target = "typeContract"),
//            @Mapping(source = "state", target = "state"),
//            @Mapping(source = "supervisor", target = "supervisor"),
//
//    })


    EmployeeDto toEmployeeDto (EmployeeEntity employeeEntity);
    EmployeeEntity toEmployeeEntity (EmployeeDto employeeDto);

}
