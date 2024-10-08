package mapper;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastName(),
                employee.getJoinedDate(),
                employee.getInstrument(),
                employee.getLevel(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getJoinedDate(),
                employeeDto.getInstrument(),
                employeeDto.getLevel(),
                employeeDto.getEmail()
        );

    }
}
