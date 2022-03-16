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
    when (seconds) {
        in 121..300, in 1321..1500, in 1921..2100, in 2521..2700, in 3121..3300
        -> println("Был (а) в сети " + seconds / 60 + " минуты назад")
        in 301..1260, in 1501..1860, in 2101..2460, in 2701..3060, in 3300..3600
        -> println("Был (а) в сети " + seconds / 60 + " минут назад")
        in 61..120, in 1261..1320, in 1861..1920, in 2461..2520, in 3061..3120
        -> println("Был (а) в сети " + seconds / 60 + " минуту назад")
    }
}

fun countHours(seconds: Int) {
    when (seconds) {
        in 7201..18000, in 79201..86400
        -> println("Был(а) в сети " + seconds / 3600 + " часа назад")
        in 18001..75600
        -> println("Был(а) в сети " + seconds / 3600 + " часов назад")
        in 3601..7200, in 75601..79200
        -> println("Был(а) в сети " + seconds / 3600 + " час назад")
    }
}