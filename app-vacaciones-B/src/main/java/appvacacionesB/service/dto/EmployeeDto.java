package appvacacionesB.service.dto;

import appvacacionesB.service.Security.Constanst;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Valid
public class EmployeeDto {
    private Long idEmployee;

    @NotNull(message = Constanst.ERROR_MESSAGE_DOCUMENT)
    private Integer document;
    @NotEmpty(message = Constanst.ERROR_MESSAGE_TYPE_DOCUMENT)
    private String documentType;
    @NotEmpty(message = Constanst.ERROR_MESSAGE_NAMES)
    private String names;
    @NotEmpty(message = Constanst.ERROR_MESSAGE_SURNAMES)
    private String surnames;
    @NotEmpty(message = Constanst.ERROR_MESSAGE_PHONE)
    @Size(min = 6, max = 13, message = Constanst.ERROR_MESSAGE_MINIMUM_PHONE)
    @Pattern(regexp = "^\\+\\d{1,2}\\d{6,13}$", message = Constanst.ERROR_MESSAGE_CHARACTERS_PHONE)
    private String phone;
    @NotEmpty(message = Constanst.ERROR_MESSAGE_CHARGE)
    private String charge;
    @NotNull(message = Constanst.ERROR_MESSAGE_ADMISSION_DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate admissionDate;
    @NotEmpty(message = Constanst.ERROR_MESSAGE_TYPE_CONTRACT)
    private String typeContract;
    @NotEmpty(message = Constanst.ERROR_MESSAGE_STATE)
    private String state;
    @NotEmpty(message = Constanst.ERROR_MESSAGE_SUPERVISOR)
    private String supervisor;

}
