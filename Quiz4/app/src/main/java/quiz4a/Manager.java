package quiz4a;

// 2.1
/**
 * สร้าง class Manager ที่เชื่อมกับ Employee ด้วย extends และตั้งเป็น public
 * สร้าง department แผนก เป็น String และตั้งเป็น private
 * สร้าง bonus เป็น double และตั้งเป็น private
 */
public class Manager extends Employee {
    private String department;
    private double bonus;

    // 2.2
    /**
     * สร้าง object Manager โดยมี employeeId name salary department และ bonus
     * 
     * @param employeeId ชื่อรหัสพนักงานที่ถูกเข้าถึงด้วยการใช้ super
     *                   เพื่อให้เข้าถึงข้อมูลใน class employee
     * @param name       ชื่อพนักงานที่ถูกเข้าถึงด้วยการใช้ super
     *                   เพื่อให้เข้าถึงข้อมูลใน class employee
     * @param salary     เงินเดือนพนักงานที่ถูกเข้าถึงด้วยการใช้ super
     *                   เพื่อให้เข้าถึงข้อมูลใน class employee
     * @param department แผนก
     * @param bonus      โบนัสพนักงาน
     */
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    // 2.3
    public void displayDetails() {
        String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    // 2.4
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                    "Employee ID: " + getEmployeeId(),
                    "Name: " + getName(),
                    "Salary: " + calculateSalary(),
                    "Department: " + department,
                    "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                    "Employee ID: " + getEmployeeId(),
                    "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }

    /**
     * method นี้จะคืนค่า bonus ที่เก็บไว้ใน object
     * 
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }
}
