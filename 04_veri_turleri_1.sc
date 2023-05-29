/*
Scala veri türlerini basit olarak özetleyelim:

1- En tepede Any veri türü bulunur. Çatı veri türü olarak düşünebiliriz.
2- Any altında AnyVal ve AnyRef bulunur.
3- AnyVal, değer türleri... Double, Float, Long, Int, Short, Byte, Char, Unit ve Boolean olarak dallanır.
4- AnyRef, referans türleri... List,Iterable, Seq, Strings...

Burada "value types" ve "reference types" konusu önemli. Verinin tutulma şekliyle ilgili konular... Ayrıntı için "Ram ve veri tutma" konusu araştırılabilir

Örneklerle devam edelim
*/

//Any, çatı veri türü olarak kabul edilebilir

var benAnyVeriTuruyum: Any = "Scala öğreniyoruz:)" //String oldum
println(benAnyVeriTuruyum)

benAnyVeriTuruyum = 'ğ' //Char oldum
println(benAnyVeriTuruyum)

benAnyVeriTuruyum = 24 //Int oldum
println(benAnyVeriTuruyum)

benAnyVeriTuruyum = 3.14 //Float oldum
println(benAnyVeriTuruyum)

benAnyVeriTuruyum = false //boolean oldum
println(benAnyVeriTuruyum)

/*
Scala öğreniyoruz:)
ğ
24
3.14
false
*/
