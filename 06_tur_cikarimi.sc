//kullanıcı tarafından bir değişkenin türü belirtilmemişse, Scala tarafından değişkenin türünün belirlenebilmesi

val benimAdim: String = "Mustafa"

var seninAdinNe = "Senin adın nedir?"

//veri türlerini kontrol edelim mi?

println(benimAdim.isInstanceOf[String]) //true döndü

println(benimAdim.getClass) //class java.lang.String döndü

println(seninAdinNe.isInstanceOf[String]) //true döndü

println(seninAdinNe.getClass) //class java.lang.String döndü
