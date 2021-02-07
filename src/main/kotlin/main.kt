package ru.netology

fun main() {
    val timeInSecondsUser0 = 50
    val timeInSecondsUser1 = 660
    val timeInSecondsUser2 = 3240
    val timeInSecondsUser3 = 400000
    val timeInSecondsUser4 = 170000
    val timeInSecondsUser5 = 190000
    sinceLastVisit(timeInSecondsUser0)
    sinceLastVisit(timeInSecondsUser1)
    sinceLastVisit(timeInSecondsUser2)
    sinceLastVisit(timeInSecondsUser3)
    sinceLastVisit(timeInSecondsUser4)
    sinceLastVisit(timeInSecondsUser5)
}

fun sinceLastVisit(timeInSeconds: Int) {
    val timeInMinutes = minutes(timeInSeconds)
    val timeInHours = hours(timeInMinutes)
    val timeInDays = days(timeInHours)
    var commentMinutes: String
    val minutesLastDigits = timeInMinutes%10

    when (minutesLastDigits) {
        1 -> {
            commentMinutes = "минуту"
            if (timeInMinutes == 11) commentMinutes = "минут"
        }
        2,3,4 -> commentMinutes = "минуты"
        else ->commentMinutes = "минут"
    }

    when (timeInMinutes) {
        0 -> println("юзер был только что")
        else -> {
            when (timeInHours) {
                0 -> println("юзер был $timeInMinutes $commentMinutes назад")
                else -> {
                    when (timeInDays) {
                        0, 1 -> println("юзер был сегодня")
                        2 -> println("юзер был вчера")
                        else -> println("юзер был давно")
                    }
                }
            }
        }
    }
}


fun minutes(timeInSeconds: Int): Int {
    return timeInSeconds / 60
}

fun hours(timeInMinutes: Int): Int {
        return timeInMinutes / 60
   }

fun days(timeInHours: Int): Int {
    return timeInHours / 24
   }
