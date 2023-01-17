package cd.wapupdotdev.myapplication.linklist

class LinkList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    var size = 0

    fun isEmpty(): Boolean = size == 0

    fun push(value: T): LinkList<T>{
        head = Node(value = value, next = head)
        if (tail == null){
            tail = head
        }
        size ++
        return this
    }

    fun append(value: T): LinkList<T>{
        if (isEmpty())
            push(value)
        tail?.next = Node(value = value)

        tail = tail?.next
        size++
        return this
    }

    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index){
            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T> {

        if (tail == afterNode) {
            append(value)
            return tail!!
        }

        val newNode = Node(value = value, next = afterNode.next)

        afterNode.next = newNode
        size++
        return newNode
    }

    override fun toString(): String = if (isEmpty()) "Empty list" else head.toString()
}