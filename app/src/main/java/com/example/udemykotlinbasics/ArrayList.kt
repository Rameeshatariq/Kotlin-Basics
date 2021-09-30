
fun main(){
    var list : ArrayList<Double> = ArrayList()
    list.add(56.0)
    list.add(92.0)
    list.add(56.2)
    list.add(76.4)
    list.add(76.9)

    var sum=0.0
    for(i in list){
        sum += i
    }
    var avg = 0.0
    avg = sum % list.size

    System.out.println(avg)
}