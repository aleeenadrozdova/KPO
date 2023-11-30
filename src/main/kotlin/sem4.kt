
open class Person(val name: String, val lastName: String) {

    open fun ToString(): String {
        return "Name: $name, Lastname: $lastName"
    }
}
interface Employee {
    var salary: Double
    fun fire()

    fun increaseSalary(amount: Double) {
        salary += amount
    }
}

class Student(name: String, lastName: String) : Person(name, lastName) {
    private var grades: MutableList<Int> = mutableListOf()
    override fun ToString(): String {
        return "Name: $name, Lastname: $lastName, grades: ${grades.joinToString(", ")}"
    }
    fun expell() {
        println("Student $name $lastName was expelled :(")
    }

    fun addGrade(grade: Int) {
        grades.add(grade)
        println("Grade $grade was added to student $name $lastName!")
    }
}

class Staff(name: String, lastName: String, val phoneNumber: String, override var salary: Double) : Person(name, lastName), Employee {
    override fun ToString(): String {
        return "Name: $name, Lastname: $lastName, Phone number: $phoneNumber"
    }

    override fun fire() {
        println("Staff $name $lastName was fired :(")
    }
}

class Professor(name: String, lastName: String, override var salary: Double, var boss: Staff) : Person(name, lastName), Employee {
    override fun ToString(): String {
        return "Name: $name, Lastname: $lastName"
    }

    override fun fire() {
        println("Professor $name $lastName was fired :(")
    }
    fun assignBoss(boss_: Staff){
        boss = boss_
    }
}

fun main() {
    val arr =  mutableListOf<Person>(Staff("Ivan", "Petrov", "+79021234567", 3000.0))
    arr.add(Professor("Petr", "Ivanov",  2000.0, arr[0] as Staff))
    arr.add(Student("Petr", "Ivanov"))
    for (i in 0..(5..10).random()) {
        (arr[2] as Student).addGrade((1..10).random())
    }
    for (i in arr) {
        println(i.ToString())
    }
    val students = mutableListOf<Student>()
    for (i in 0..(5..10).random()) {
        students.add(Student("Name$i", "Surname$i"))
        for (j in 0..(5..10).random()) {
            students[i].addGrade((1..10).random())
        }
    }
    for (i in students) {
        println(i.ToString())
    }
}