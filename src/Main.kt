import exam.exam

fun main(){
    println("Абитуриент:")
    var student=exam()
    print("Введите фамилию:")
    student.name= readln()
    print("Введите факультет:")
    student.faculty= readln()
    print("Введите место:")
    student.place= readln()
    print("Введите кол-во вступительные экзамены:")
    student.exams= readln()!!.toInt()
    print("Введите кол-во вступительные экзамены:")
    student.teacher= readln()
}