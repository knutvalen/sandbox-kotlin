import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")
    val temperature = 10
    println("You are ${ if(temperature > 50) "fried" else "safe" } fish")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (day) {
        Calendar.MONDAY -> println("Monday")
        Calendar.TUESDAY -> println("Tuesday")
        Calendar.WEDNESDAY -> println("Wednesday")
        Calendar.THURSDAY -> println("Thursday")
        Calendar.FRIDAY -> println("Friday")
        Calendar.SATURDAY -> println("Saturday")
        Calendar.SUNDAY -> println("Sunday")
        else -> println("( ͡° ͜ʖ ͡°)")
    }
}