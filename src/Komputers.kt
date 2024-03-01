abstract class Komputers {
    abstract var name : String
    abstract var takt: Int
    abstract var v: Int
    abstract var p: Int
    open fun Q()
    {
        var QQ = (100*takt)/v
        println("$QQ")
    }
    open fun InInfo() {}
    open fun OutInfo() {}
}