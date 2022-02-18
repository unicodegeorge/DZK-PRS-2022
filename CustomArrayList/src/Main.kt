    fun main() {
        val arrayList = ArrayListX(intArrayOf(43,34,23,32,100))
        println(arrayList.size())
        println(arrayList.isEmpty())
        println(arrayList.indexOf(2))
        println(arrayList.toArray())
        println(arrayList.get(4))
        arrayList.add(6)
        arrayList.set(0,2)
        println(arrayList.toArray().contentToString())
        println(arrayList.contains(5))
        println(arrayList.lastIndexOf(2))
    }
