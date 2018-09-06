import java.util.*

fun main(args: Array<String>) {
    val mood = getMood()!!


    println(whatShouldIDoToday(mood = mood))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isNice(mood, weather, temperature) -> "go for a walk"
        isBad(mood, weather, temperature) -> "stay in bed"
        isHot(temperature) -> "go swimming"
        isCold(weather, temperature) -> "go skiing"
        else -> "Stay home and read."
    }
}

fun getMood(): String? {
    println("What mood are you now?")
    return readLine()
}

fun isNice(mood: String, weather: String, temperature: Int) = mood == "happy" && weather == "sunny" && temperature > 10

fun isBad(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0

fun isHot(temperature: Int) = temperature > 35

fun isCold(weather: String, temperature: Int) = weather == "sunny" && temperature < -10