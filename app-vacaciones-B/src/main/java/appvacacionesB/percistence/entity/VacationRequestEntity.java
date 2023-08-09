package appvacacionesB.percistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name = "solicitud_vacaciones")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VacationRequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vacation_request", nullable = false)
    private Long idVacationRequest;
    @Column(name = "tipo_solicitud",nullable = false)
    private String requestType;
    @Column(name = "fecha_inicio",columnDefinition = "DATETIME")
    private LocalDateTime startDate;
    @Column(name = "fecha_fin",columnDefinition = "DATETIME")
    private LocalDateTime endDate;
    @Column(name = "dias", nullable = false)
    private Integer days;
    @Column(name = "fecha_solicitud",columnDefinition = "DATETIME")
    private LocalDateTime date;
    @Column(name = "comentario", nullable = true)
    private String comment;
    @Column(name = "estado_solicitud",columnDefinition = "TINYINT", nullable = false )
    private Boolean state;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "empleado_id")
    private EmployeeEntity employee;
}
