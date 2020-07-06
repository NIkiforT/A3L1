package nikifor.tatarkin.a3l1

class TesKotlin {
    var str1: String?= null

    //Объявление функции - начало
    fun sum(a: Int, b: Int): Int { return a + b }
    fun sum2(a: Int, b: Int) = a + b

    //Функция, не возвращающая никакого значения. Unit может быть опущен
    fun printSum(a: Int, b: Int): Unit { print(a + b) }

    private val a: Int = 1
    val b = 1   // Тип `Int` выведен автоматически
    var c: Int = 0  // Тип обязателен, когда значение не инициализируется
    fun incrementC() { c += 1 }

    //Допустимо использование переменных внутри строк в формате $name или ${name}
    fun main(args: Array<String>) {
        if (args.size == 0) return
        print("Первый аргумент: ${args[0]}")
    }
    // просто имя переменной в шаблоне:
    val s1 = "a равно $a"

    fun max3(a: Int, b: Int): Int {
        if (a > b)
            return a
        else
            return b
    }
    //Также if может быть использовано как выражение (т. е. if ... else возвращает значение)
    fun max(a: Int, b: Int) = if (a > b) a else b

    //Ссылка должна быть явно объявлена как nullable (символ ?) когда она может принимать значение null.
    //Возвращает null если str не содержит числа:
    fun parseInt(str: String): Int? {
        return null
    }

    //Оператор is проверяет, является ли выражение экземпляром заданного типа.
    // Если неизменяемая внутренняя переменная или свойство уже проверены на определенный тип,
    // то в дальнейшем нет необходимости явно приводить к этому типу:

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // в этом блоке `obj` автоматически преобразован в `String`
            return obj.length
        }
        // `obj` имеет тип `Any` вне блока проверки типа
        return null
    }
    //ИЛИ
    fun getStringLength2(obj: Any): Int? {
        // `obj` автоматически преобразован в `String` справа от оператора `&&`
        if (obj is String && obj.length > 0)
            return obj.length
        return null
    }

    //Цикл For
    fun main2(args: Array<String>) {
        for (arg in args)
            print(arg)
    }
    //for (i in args.indices)
    //print(args[i])

    fun main3(args: Array<String>) {
        var i = 0
        while (i < args.size)
            print(args[i++])
    }
    //Выражение When
    fun cases(obj: Any) {
        when (obj) {
            1          -> print("One")
            "Hello"    -> print("Greeting")
            is Long    -> print("Long")
            !is String -> print("Not a string")
            else       -> print("Unknown")
        }
    }

    






}