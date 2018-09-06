import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")
    println("Good ${ if (args[1].toInt() < 12) "morning" else "night"}, ${args[0]}")
    val temperature = 10
    println("You are ${ if(temperature > 50) "fried" else "safe" } fish")
    dayOfWeek()
    feedTheFish()
    val canAddMoreFish = fitMoreFish(10.0, listOf(), 7, true)
    println("Can add more fish: $canAddMoreFish")

    var fortune = ""
    while (fortune != "Take it easy and enjoy life!") {
        fortune = getFortuneCookie(getBirthday())
        println("Your fortune is: $fortune")
    }
}

fun fitMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    val length = currentFish.sum() + fishSize
    val limit = if (hasDecorations) tankSize.times(0.8) else tankSize
    return length <= limit
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    return when (birthday) {
        28, 31 -> "this is end of month"
        in 1..7 -> "this is first week"
        else -> fortunes[birthday.rem(fortunes.size)]
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun fishFood(day: String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
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

fun getBirthday() : Int {
    println("Enter your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}