package cd.wapupdotdev.myapplication

import cd.wapupdotdev.myapplication.linklist.LinkList

fun main(){
    val list = LinkList<Int>()

    println(list.isEmpty())

    list.push(2).push(4).push(6)

    list.append(5)

    println("$list \n${list.size}")

    var middleNode = list.nodeAt(1)!!
    for (i in 1..4){
        middleNode = list.insert(-1 * i, middleNode)
    }

    println(list)
}
