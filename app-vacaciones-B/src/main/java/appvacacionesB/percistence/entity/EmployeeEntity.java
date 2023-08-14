package appvacacionesB.percistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee", nullable = false)
    private Long idEmployee;
    @Column(name = "documento", length = 20)
    private Integer document;
    @Column(name = "tipo_documento", nullable = false,length = 50)
    private String documentType;
    @Column(name = "nombres", nullable = false)
    private String names;
    @Column(name = "apellidos",nullable = false)
    private String surnames;
    @Column(name = "telefono", nullable = false, length = 13)
    private String phone;
    @Column(name = "cargo")
    private String charge;
    @Column(name = "fecha_ingreso",columnDefinition = "DATETIME")
    private LocalDate admissionDate;
    @Column(name = "tipo_contrato",nullable = false)
    private String typeContract;
    @Column(name = "estado",columnDefinition = "TINYINT", nullable = false)
    private Boolean state;
    @Column(nullable = false)
    private String supervisor;

    //El atributo mappedBy especifica el nombre del campo en la entidad VacationRequestEntity que mapea la relación inversa, es decir, el campo que se refiere a la entidad actual (EmployeeEntity).
    //cascade = CascadeType.REMOVE, indica que cuando se elimine una instancia de la entidad principal (por ejemplo, un EmployeeEntity), todas las instancias relacionadas de VacationRequestEntity también se eliminarán automáticamente.
    @OneToMany(mappedBy = "employee",cascade = CascadeType.REMOVE)
    @JsonBackReference
    private List<VacationRequestEntity> vacation;

}


