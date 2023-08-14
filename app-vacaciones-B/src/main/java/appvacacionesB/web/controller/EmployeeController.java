package appvacacionesB.web.controller;

import appvacacionesB.service.EmployeeService;
import appvacacionesB.service.dto.EmployeeDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static appvacacionesB.service.Security.Constanst.ERROR_EMPLOYEE;

@RestController
@RequestMapping("employee/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("create")
    public ResponseEntity<EmployeeDto> createEmployee(@Validated @RequestBody EmployeeDto employeeDto) throws Exception {
        return new ResponseEntity<>(employeeService.createEmploye(employeeDto), HttpStatus.CREATED);
    }
    @GetMapping("list")
    public List<EmployeeDto> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("search/{document}")
    public ResponseEntity<EmployeeDto> getEmployedByDocument(@Valid @PathVariable Integer document) throws Exception {
        EmployeeDto employee = employeeService.findEmployeeByDocument(document).orElseThrow(() -> new
                Exception(ERROR_EMPLOYEE + document));
        return ResponseEntity.ok(employee);
    }
    @PutMapping("update")
    public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employee) {

        EmployeeDto employeeUpdated = employeeService.updateEmployee(employee);

        if (employeeUpdated != null) {
            return ResponseEntity.ok(employeeUpdated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@Valid @PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
