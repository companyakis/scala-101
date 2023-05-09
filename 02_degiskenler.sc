//degişken tanımlama

//anahtarSozcuk degiskenAdi: degiskenTuru = baslangicDegeri

val ilkDegisken: Int = 21

//eğer değişken değeri değişmeyecekse (immutable) val kullanıyoruz

//değeri değişebilecek değişkenler (mutable) ile var kullanıyoruz

val ulusalMars: String = "İstiklal Marşı"
val kurucuOnder: String = "Mustafa Kemal Atatürk"
var yas: Int = 22

//------------örnek yapalım--------------

var yasadigimMahalle: String = "Yurt Mahallesi"
println("On yıl önce yaşadığım mahalle: " + yasadigimMahalle)

yasadigimMahalle = "Pınar Mahallesi"
println("Yeni mahallem: " + yasadigimMahalle)

//On yıl önce yaşadığım mahalle: Yurt Mahallesi
//Yeni mahallem: Pınar Mahallesi
