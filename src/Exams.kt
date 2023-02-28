package Exams
import proverka.*
open class Exams(_name:String): proverka(_name) {
    open var facult=facul
    open var ball=bal
    open var cost=0
    open var agree=false
    open fun Agree(){
        if(ball>2.9)
        {
            print("Принят на факультет:$facult")
            agree=true
        }
        else
        {
            print("Не принят на факультет:$facult")
            agree=false
        }
    }
    open fun cena(){
        print("Укажите цену обучения в $facult")
        cost= readln()!!.toInt()
    }
    open fun cost(){
        if(agree==true)
        {
            println("Абитуриент на факультете:$facult должен платить:$cost")
        }
    }
}