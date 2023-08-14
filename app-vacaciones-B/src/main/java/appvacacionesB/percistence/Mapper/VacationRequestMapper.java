package appvacacionesB.percistence.Mapper;

import appvacacionesB.percistence.entity.VacationRequestEntity;
import appvacacionesB.service.dto.VacationRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VacationRequestMapper {

    List<VacationRequestDto> toVacationRequest (List<VacationRequestEntity> vacationRequestEntities);
    VacationRequestDto toVacationRequest (VacationRequestEntity vacationRequestEntity);

    VacationRequestEntity toVacationRequestEntity (VacationRequestDto vacationRequest);
}
