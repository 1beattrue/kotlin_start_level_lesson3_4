fun main() {
    // zip функция

    val names = mutableListOf<String>()
    val phones = mutableListOf<String>()

    for (i in 0..<1000) {
        names.add("name $i")
        phones.add("+7-911-000-00-0${i % 10}")
    }
    println("$names\n$phones")

    val users =
        names.zip(phones) // val users: List<Pair<String, String>> - zip функция, функция объединения двух коллекций

    for (user in users) println("${user.first}: ${user.second}")

    val fullNames = listOf("name1 surname1", "name2 surname2", "name3 surname3", "name4 surname4")
    val first = fullNames.map { it.substring(0..<it.indexOf(' ')) }
    val second = fullNames.map { it.substring(it.indexOf(' ') + 1..it.lastIndex) }

    val fullNamesZip = first.zip(second)
    println(fullNamesZip)

    // альтернативное решение
    val fullNames2 = mutableListOf<String>()
    for (i in 0..1000) {
        fullNames2.add("Имя$i Фамилия$i")
    }
    val first2 = fullNames2.map {it.substringBefore(" ")}
    val second2 = fullNames2.map {it.substringAfter(" ")}

    val fullNamesZip2 = first2.zip(second2)
    for (fullNameZip2 in fullNamesZip2) println(fullNameZip2)
}