package proverka
import exam.*
open class proverka(_name:String): exam(_name)
{
    open var examnumber:Int=exams
    open var est=0
    open var facul=faculty
    open var bal=0.0
    open var sum=0
    open fun est()
    {
        if(examnumber==1)
        {
            print("Введите оценку:")
            est= readln()!!.toInt()
            bal=(est)!!.toDouble()
        }
        if(examnumber==2)
        {
            while(examnumber<3)
            {
                print("Введите оценку:")
                est= readln()!!.toInt()
                sum += est
            }
            bal=(sum/examnumber)!!.toDouble()
        }
        if(examnumber==3)
        {
            while(examnumber<4)
            {
                print("Введите оценку:")
                est= readln()!!.toInt()
                sum += est
            }
            bal=(sum/examnumber)!!.toDouble()
        }
    }
    open fun estbal(){
        print("Абитуриент набрал:$bal")
    }
    open fun bal(){
        if(bal>2.9)
        {
            print("Не допускается на учёбу")
        }
        else
        {
            print("Допускается на учёбу")
        }
    }
}