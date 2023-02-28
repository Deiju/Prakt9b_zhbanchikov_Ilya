package exam
open class exam()
{
    open var name="undefinded"
    open var faculty="undefinded"
    var exams=0
    var teacher="undefinded"
    var place="undefinded"
    var estimation=0
    constructor(_name:String):this()
    {
        name=_name
    }
    constructor(_name:String,_faculty:String):this(_name)
    {
        faculty=_faculty
    }
    constructor(_name:String,_faculty:String,_exams:Int):this(_name)
    {
        exams=_exams
    }
    constructor(_name:String,_faculty:String,_exams:String,_teacher:String):this(_name)
    {
        teacher=_teacher
    }
    constructor(_name:String,_faculty:String,_exams:String,_teacher:String,_estimation:Int):this(_name)
    {
        estimation=_estimation
    }
    constructor(_name:String,_faculty:String,_exams:String,_teacher:String,_estimation:Int,_place:String):this(_name)
    {
        place=_place
    }
    open fun name()
    {
        println("$name собирается учится")
    }
    open fun place()
    {
        println("Учёба будет проходить в $place")
    }
    open fun faculty()
    {
        println("Факультет: $faculty")
    }
}