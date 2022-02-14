package ma.cigma.formation.domaine;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.cigma.formation.presentation.validator.SalaryRule;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeVo {
    @NotNull(message = "ID must not be empty")
    private Long id;
    @NotEmpty(message = "First name must not be empty")
    @Size(min = 10, max = 30, message = "message size must be between 10 et 30")
    private String firstName;
    @NotEmpty(message = "Last name must not be empty")
    private String lastName;
    @NotNull(message = "Salary must not be empty")
    @SalaryRule(message = "Le salaire doit  tre entre 1000 MAD et 10 000 MAD")
    private Double salary;
    @NotNull(message = "email must not be empty")
    @Email(message = "email should be a valid email")
    private String email;
}