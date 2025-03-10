package quiz4a;

// (1.1) เขียน Java Docs
/**
 * สร้าง class Employee และตั้งเป็น public
 * สร้าง employeeId รหัสพนักงาน เป็น int และตั้งเป็น private
 * สร้าง name ชื่อพนักงาน เป็น String และตั้งเป็น private
 * สร้าง salary เงินเดือนพนักงาน เป็น double และตั้งเป็น private
 */
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // (1.2)
    /**
     * สร้าง object Employee โดยมี employeeId name และ salary
     * @param employeeId หรือ รหัสพนักงานที่ไม่ซ้ำกัน
     * @param name ชื่อของพนักงาน
     * @param salary เงินเดือน หากเงินเดือนมีค่าน้อยกว่า 0 จะถูกตั้งค่าเป็น 0
     */
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    // (1.3)
    /**
     * method นี้จะคืนค่าเงินเดือนของพนักงานที่เก็บไว้ใน object
     * @return เงินเดือนของพนักงาน
     */
    public double calculateSalary() {
        return salary;
    }

    // (1.4)
    /**
     * method นี้จะคืนค่ารหัสพนักงานที่เก็บไว้ใน object
     * @return รหัสพนักงาน
     */
    public int getEmployeeId() {
        return employeeId;
    }

    // (1.5)
    /**
     * metohd นี้จะคืนค่าชื่อพนักงานที่เก็บไว้ใน object
     * @return ชื่อพนักงาน
     */
    public String getName() {
        return name;
    }
}