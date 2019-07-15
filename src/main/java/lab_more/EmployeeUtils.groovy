package lab_more

/**
 * @author Evgeny Borisov
 */
class EmployeeUtils {

    static int totalSalary2(List<Employee> employees) {
        employees.collect { it.salary }.inject(0) { a, b -> a + b }
    }


    static Map<Integer, List<Employee>> getNameToSalaryMap(List<Employee> employees) {
        return employees.groupBy{it.salary}
    }

    static double totalSalary(List<Employee> employees) {

        employees.collect { it.salary }.sum() as Double


    }
}
