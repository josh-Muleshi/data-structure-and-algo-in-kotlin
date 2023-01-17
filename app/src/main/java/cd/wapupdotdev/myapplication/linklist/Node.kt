package cd.wapupdotdev.myapplication.linklist

data class Node<T>(var value: T, var next: Node<T>? = null){
    override fun toString(): String =
        if (next != null) "$value -> $next" else "$value"
}
