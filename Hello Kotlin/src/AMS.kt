import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")
    println("Good ${ if (args[1].toInt() < 12) "morning" else "night"}, ${args[0]}")
    val temperature = 10
    println("You are ${ if(temperature > 50) "fried" else "safe" } fish")
    dayOfWeek()
    feedTheFish()
    for (i in 1..10) {
        val fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
        if (fortune == "Take it easy and enjoy life!") break
    }
}

fun getFortuneCookie(): String {
    val fortunes = listOf("You will have a great day!", "Things will go well for you today.",
            "Enjoy a wonderful day of success.", "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    println("Enter your birthday:")
    val birthday: Int = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
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