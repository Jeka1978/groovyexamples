package lab_more

/**
 * @author Evgeny Borisov
 */
class EmployeeUtils {
    static double totalSalary(List<Employee> employees) {

        employees.collect { it.salary }.sum() as Double


    }
}
