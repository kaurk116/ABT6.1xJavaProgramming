package ex_may_25_wapperclass;

import javax.print.DocFlavor;

public class lab0136 {

    class person{
        Integer age;
        Long salary;
        String rollno;

        public person(Integer age, Long salary, String rollno) {
            this.age = age;
            this.salary = salary;
            this.rollno = rollno;
        }

        public Long getSalary() {
            return salary;
        }

        public Integer getAge() {
            return age;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public void setRollno(String rollno) {
            this.rollno = rollno;
        }

        public String getRollno() {
            return rollno;


        }
    }
}
