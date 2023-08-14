package appvacacionesB.service.dto;

import appvacacionesB.service.Security.Constanst;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Valid
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VacationRequestDto {
    private Long id;
    @NotEmpty(message = Constanst.ERROR_MESSAGE_REQUEST_TYPE)
    private String requestType;
    @NotNull(message = Constanst.ERROR_MESSAGE_START_DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @NotNull(message = Constanst.ERROR_MESSAGE_END_DATE)
    private LocalDate endDate;
    private LocalDate hireDate;
    private Integer days;
    private Integer daystotal;
    private LocalDate date;
    private String comment;
    @NotNull(message = "el numero de documento solo puede ser entero no ser nulo ni estar vacio")
    private Integer document;
    @NotNull(message = "el estado no puede ser nulo ni estar vacio")
    private String state;
}
