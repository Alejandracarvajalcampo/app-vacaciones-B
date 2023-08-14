package appvacacionesB.percistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Table(name = "vacation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class VacationRequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vacation", nullable = false)
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
    @JoinColumn(name = "id_employee")
    private EmployeeEntity employee;


}
