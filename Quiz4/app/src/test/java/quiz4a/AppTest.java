/*
 * This source file was generated by the Gradle 'init' task
 */
package quiz4a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // ตัวอย่าง 1 ให้สร้าง Employee Employee(1, "John Doe", 50000)
    // และตรวจสอบว่าเงินเดือน เป็น 50000
    @Test
    void createEmployee() {
        Employee a = new Employee(1, "John Doe", 50000);
        assertEquals(50000, a.calculateSalary(), "เงินเดือนควรเป็น 50000");
    }

    // ข้อ 2 ตรวจสอบว่า Salary ตั้งให้ติดลบไม่ได้
    @Test
    void SalaryCannotBeNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(1, "John Doe", -1000);
        });

        assertEquals("Salary cannot be negative", exception.getMessage());
    }

    // ข้อ 3 ตรวจสอบว่า Bonus เป็น 20% ของ เงินเดือน(Salary)
    // ต้องมีการแก้ไข code ใน Manager.java ให้ถูกต้อง
    @Test
    void Bonus20() {
        Manager manager = new Manager(1, "John Doe", 50000, null, 0.20);

        double expectedBonus = 50000 * 0.20;

        assertEquals(expectedBonus, manager.getBonus(), 0.01, "Bonus เป็น 20% ของเงินเดือน(Salary)");
    }
}