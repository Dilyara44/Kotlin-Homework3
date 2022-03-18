package ru.netology

fun main() {
    val seconds = (0..79200).random()

    println(seconds)
    agoToText(seconds)

    val seconds1 = 2
    val seconds2 = 2457
    val seconds3 = 85234
    val seconds4 = 99999
    val seconds5 = 177543
    val seconds6 = 274533

    println(" ")
    agoToText(seconds1)
    agoToText(seconds2)
    agoToText(seconds3)
    agoToText(seconds4)
    agoToText(seconds5)
    agoToText(seconds6)


}

fun agoToText(seconds: Int) {
    when (seconds) {
        in 0..60
        -> println("Был(а) в сети только что")
        in 61..3600
        -> countMinutes(seconds)
        in 3601..86400
        -> countHours(seconds)
        in 86401..172800
        -> println("Был(а) в сети сегодня")
        in 172801..259200
        -> println("Был(а) в сети вчера")
        else -> {
            println("Был(а) в сети давно")
        }

    }
}

fun countMinutes(seconds: Int) {
    val minutes = seconds / 60
    when (minutes) {
        in 2..4, in 22..24, in 32..34, in 42..44, in 52..54
        -> println("Был (а) в сети $minutes минуты назад")
        in 5..20, in 25..30, in 35..40, in 45..50, in 55..60
        -> println("Был (а) в сети $minutes минут назад")
        1, 21, 31, 41, 51
        -> println("Был (а) в сети $minutes минуту назад")
    }
}

fun countHours(seconds: Int) {
    val hours = seconds / 3600
    when (hours) {
        in 2..4, in 22..24
        -> println("Был(а) в сети $hours часа назад")
        in 5..20
        -> println("Был(а) в сети $hours часов назад")
        1, 21
        -> println("Был(а) в сети $hours час назад")
    }
}
