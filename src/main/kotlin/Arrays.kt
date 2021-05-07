
// პირველი დავალება, აბრუნებს განსხვაებულ ელემენტს
fun listsEqual(list1: List<Int>, list2: List<Int>): Set<Int> {

    val difference = list2.toSet().minus(list1.toSet())

    return difference
}

// მეორე დავალება, აბრუნებს თანაკვეთას
fun listsCommon(list1: List<Int>, list2: List<Int>): List<Int> {

    val common = list2.filter {list1.contains(it)}
    return common
}

// მესამე დავალება აბრუნებს გაერთიანებას
fun join(first: Array<Int>, second: Array<Int>): Array<Int> {
    return first + second
}





fun main() {

    val first = arrayOf(6, 7, 9, 12, 3)
    val second = arrayOf(1, 5, 2)

    val list1 = listOf(1, 2, 3, 5, 6)
    val list2 = listOf(2, 5, 6, 7, 2, 4)

    println(listsCommon(list1, list2))
    println(listsEqual(list1, list2))
    val result = join(first, second)
    println(result.contentToString())
}