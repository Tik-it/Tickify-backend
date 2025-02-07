package org.tickify

fun main() { // W kotlinei mozna wszedzie miec maina
    //Przyklady:
    val numer: Int = 1  //w kotlinie nie ma prymitywow w kodzie, kompilator sam decyduje czy to bedzie w bytecodzie prymityw czy obiekt
    val lista = listOf<Int>(1, 2, 3, 4) // Lista typu INT ktora jest immutowalna (nie mozna dodawac elementow)
    val lista2 = mutableListOf<Int>(1, 2, 3, 4) // Lista typu INT ktora jest mutowalna (mozna dodawac elementy)
    lista2.add(1)

    val lista3 = listOf(1, 2, 3, 4) // Nie musisz podawac typu jesli dodajesz te same rzeczy

    lista3.forEach { // Jesl lambda przyjmuje jeden element to z automatu mozna go zastapic "it"
        println(it)
    }

    lista3
        .map { numer -> numer + 1 }// mozna "it" zastapic wlasna nazwa, albo podac nazwy jesli elementow jest wiecej
        .forEach { println(it) }

    // W kotlinie nie ma Streamow , kazda kolekcja ma implementacje metod typu map, filter, reduce itp

    lista3.forEach(
        action = (::println)
    )
    lista3.forEach {
        println(it)
    }
    //TO jest to samo, ze wzgledu na to ze ostatnim (i jedynym) argumentem forEach jest funkcja mozna skipnac nawiasy i od razu zrobic brackety do lambdy zamiast przekazywac funckje
    //Jest to tzw "Trailing lambda"

    val klasa1 = Test("Jan", "Kowalski")
    val klasa2 = Test(surname = "Kowalski", name = "Jan")
    //To jest to samo, mozna podac nazwy argumentow, wtedy nie trzeba pamietac kolejnosci argumentow
    klasa2.rozszerzenie() //wywolanie metody rozszerzajacej

    val exception = testException()
    when (exception) { // When to switch case z dodatkowymi mozliwosciami
        is MyException.Exception1 -> println("Exception1")
        is MyException.Exception2 -> println("Exception2 ${exception.numer}")
    }
    //Sealed pozwala na when bez else casea, bo kompilator wie ze wszystkie mozliwosci sa obsluzone

    val chlop = if(true) "Jan" else "Kasia"
    val chlop2 = when(true) {
        true -> "Jan"
        false -> "Kasia"
    }
    // if, when i try mozna przypisywac do zmiennej i returna

    val nullableNumber : Int? = null
    val number = nullableNumber ?: 0 // Operator elvisa, jesli nullableNumber jest nullem to przypisz 0

}


class Test(
    var name: String,
    var surname: String
)

fun Test.rozszerzenie() { //Funkcja rozszerzajaca, dodaje nowa metode do klasy Test bez wchodzenia w jej cialo i bez potrzeby wrappera
    println("Rozszerzenie")
}


sealed interface MyException {
    data object Exception1 : MyException // Obiekt bez pol
    data class Exception2(val numer: Int) : MyException // obiekt z polami
}

fun testException(): MyException { //Funkcja zwracajaca interfejs MyException
    return MyException.Exception2(1)
}