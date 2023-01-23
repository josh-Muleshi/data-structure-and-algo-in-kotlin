package cd.wapupdotdev.myapplication

import cd.wapupdotdev.myapplication.linklist.LinkedList

fun main(){

    val list: MutableCollection<Int> = LinkedList()
//    list.add(3)
//    list.add(2)
//    list.add(1)
//
//    println(list)
//    list.remove(1)
//    println(list)

//    list.add(3)
//    list.add(2)
//    list.add(1)
//    list.add(4)
//    list.add(5)
//
//    println(list)
//    list.retainAll(listOf(3, 4, 5))
//    println(list)

    list.add(3)
    list.add(2)
    list.add(1)
    list.add(4)
    list.add(5)

    println(list)
    list.removeAll(listOf(3, 4, 5))
    println(list)
}
