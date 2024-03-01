public open class Komputer(override var name: String,
    override var takt:Int, override var v: Int,override var p: Int):Komputers() {
        override fun InInfo(){
            try{
                print("введите наименование процессора: ")
                name=readLine()!!.toString()
                print("введите тактовую частоту процессора(МГц): ")
                takt=readLine()!!.toInt()
                if (takt<0){println("неверно введено значение")}
                else { print("введите объем оперативной памяти процессора(Мб): ")
                    v=readLine()!!.toInt()
                    if (v<0){println("неверно введено значение")}
                        else{print("введите объем винчестера процессора(Гб): ")
                        p=readLine()!!.toInt()
                        if(p<0)println("неверно введено значение")}
                    }
            }catch(e:Exception){
                println("error")
            }
        }
    override fun OutInfo(){
        print("Процессор: $name\nТактовая частота процессора(МГц): $takt\nОбъем оперативной памяти(Мб): $v\nОбъем винчестера(Гб): $p\n")
    }
    override fun Q(){
        var QQ=0.0
        var Q=(100*takt)/v
        QQ=Q+0.5*p
        println("Q: $Q\nQp: $QQ")
    }

}