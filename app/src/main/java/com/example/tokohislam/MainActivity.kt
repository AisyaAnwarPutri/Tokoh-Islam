package com.example.tokohislam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Daftar Tokoh Islam"

        val imageList = listOf<Image>(
            Image(
                R.drawable.abu_1,
                "Abu Bakar As sidiq",
                "Abu Bakar lahir di kota Makkah sekitar tahun 573 , dari keluarga kaya dalam Bani Taim dari suku Quraisy. Ayah Abu Bakar bernama Abu Quhafah Utsman dan ibunya bernama Salma binti Sakhar . Abu Bakar menghabiskan masa kecilnya seperti anak Arab pada zaman itu di antara suku Badui yang menyebut diri mereka dengan nama AhliBaeer atau rakyat unta. Pada masa kecilnya, Abu Bakar sering sekali bermain dengan dengan unta dan kambing, dan kecintaannya terhadap unta inilah yang memberinya nama Abu Bakar yang berarti, bapaknya unta. Perjalanan bisnis membawanya ke Yaman, Suriah dan beberapa tempat lainnya. Perjalanan bisnis inilah yang membuatnya semakin kaya dan semakin berpengalaman dalam berdagang. Bisnisnya semakin berkembang, mempengaruhi status sosial Abu Bakar. Meskipun ayahnya Abu Quhafah Utsman masih hidup, Abu Bakar diakui sebagai kepala sukunya. Seperti anakanak lain dari keluarga pedagang Makkah yang kaya, Abu Bakar adalah orang terpelajar dan dia menyukai puisi. Setelah itu ayahnya pergi untuk mengurus urusan bisnis lainnya, meninggalkan Abu Bakar sendirian dengan berhalaberhala tersebut."
            ),
            Image(
                R.drawable.umar_2,
                "Umar bin Khattab",
                "Selama pemerintahan Umar, kekuasaan Islam tumbuh dengan sangat pesat. Islam mengambil alih Mesopotamia dan sebagian Persia dari tangan dinasti Sassanid dari Persia yang mengakhiri masa Kekaisaran Sassanid serta mengambil alih Mesir, Palestina, Syria, Afrika Utara dan Armenia dari kekaisaran Romawi Byzantium. Saat itu ada dua negara adi daya yaitu Persia dan Romawi. Namun keduanya telah ditaklukkan oleh kekhalifahan Islam dibawah pimpinan Umar. Sejarah mencatat banyak pertempuran besar yang menjadi awal penaklukan ini."
            ),
            Image(
                R.drawable.usman_3,
                "Utsman bin Affan",
                "Utsman dilahirkan dari seorang ayah yang bernama Affan bin Abi alAs , dari suku bani Umayyah, dan ibu yang bernama Arwa binti Kurayz , dari Abdshams , kedua suku kaya dan terpandang Quraish di Mekah . Utsman memiliki satu saudara perempuan, Amina. Utsman terlahir di Taif. Ia tercatat sebagai salah satu dari 22 orang Mekah yang tahu cara menulis. Ayahnya, Affan, meninggal di usia muda saat bepergian ke luar negeri, meninggalkan Utsman dengan warisan besar. Ia menjadi pedagang seperti ayahnya, dan bisnisnya berkembang, membuatnya menjadi salah satu orang terkaya di antara orang Quraiys. Utsman bin Affan adalah sahabat nabi dan juga khalifah ketiga dalam Khulafaur Rasyidin. Beliau dikenal sebagai pedagang yang kaya raya dan handal dalam bidang ekonomi namun sangat dermawan. Banyak bantuan ekonomi yang diberikannya kepada umat Islam di awal dakwah Islam. Ia mendapat julukan Dzun Nurain yang berarti yang memiliki dua cahaya. Julukan ini didapat karena Utsman telah menikahi puteri kedua dan ketiga dari Rasullah yaitu Ruqayyah dan Ummu Kultsum.\n"
            ),
            Image(
                R.drawable.ali_4,
                "Ali bin Abi Thalib",
                "Ali dilahirkan di Mekkah, daerah Hejaz, Jazirah Arab, pada tanggal 13 Rajab. Menurut sejarawan, Ali dilahirkan 10 tahun sebelum dimulainya kenabian Muhammad, sekitar tahun 599 Masehi atau 600 perkiraan. Muslim Syiah percaya bahwa Ali dilahirkan di dalam Kabah. Usia Ali terhadap Nabi Muhammad masih diperselisihkan hingga kini, sebagian riwayat menyebut berbeda 25 tahun, ada yang berbeda 27 tahun, ada yang 30 tahun bahkan 32 tahun. Dia bernama asli Assad bin Abu Thalib, bapaknya Assad adalah salah seorang paman dari Muhammad. Assad yang berarti Singa adalah harapan keluarga Abu Thalib untuk mempunyai penerus yang dapat menjadi tokoh pemberani dan disegani di antara kalangan Quraisy Mekkah. Setelah mengetahui anaknya yang baru lahir diberi nama Assad,butuh rujukan Ayahnya memanggil dengan Ali yang berarti Tinggi derajat di sisi Allah.\n"
            ),
            Image(
                R.drawable.hamzah_5,
                "Hamzah bin Abdul Muththalib",
                "Sejak memeluk islam, Hamzah telah berniat untuk membaktikan segala keperwiraan, keperkasaan, dan juga jiwa raganya untuk kepentingan dawah islam. Karena itu tidaklah mengherankan jika Nabi Muhammad menjulukinya dengan sebutan Asadullah yang berarti singa Allah. Sementara itu, Abu jahal yang telah mengetahui bahwa Hamzah telah berdiri dalam barisan kaum muslimin berpikir bahwa perang antara kaum Quraisy dengan kaum muslimin sudah tidak dapat dielakkan lagi. Oleh karena itu, ia mulai menghasut dan memprovokasi orangorang Quraisy untuk melakukan tindak kekerasan terhadap Muhammad dan pengikutnya. Bagaimanapun, Hamzah tidak dapat membendung kekerasan yang dilakukan kaum Quraisy terhadap para sahabat yang lemah. Akan tetapi harus diakui, bahwa keislamannya telah menjadi perisai dan benteng pelindung bagi kaum muslimin lainnya. Lebih dari itu, dia menjadi daya tarik tersendiri bagi kabilahkabilah Arab yang ada di sekitar jazirah Arab untuk lebih mendalam mengetahui Agama Islam.\n"
            ),
            Image(
                R.drawable.mushab_6,
                "Mush ab bin Umair",
                "Awalnya Mushab merahasiakan keimanannya, karena dia takut akan kemarahan ibunya. Namun, suatu hari seorang musuh Muhammad, Utsman bin Thalhah, melihatnya memasuki rumah AlArqam dan mengerjakan sholat bersama Muslim yang lain. Berita itu menyebar dan akhirnya terdengar sampai ke ibunya, yang kemudian mengikat Mushab di rumahnya dengan maksud agar Mushab kembali kekeyakinan lamanya. Mushab yakin akan keyakinannya dan tidak akan meninggalkan keyakinannya. Muhammad menyarankan dia agar bergabung dengan para sahabat yang hijrah ke Abisinia agar dia tidak diganggu lagi.\n"
            ),
            Image(
                R.drawable.zaid_7,
                "Zaid bin Haritsah",
                "Nama lengkapnya adalah Zaid bin Haritsah bin Syarahil atau Syurahbil bin Kaab bin AbdilUzza bin Yazid bin Imri’ilQais bin Amir bin anNuman. Zaid bin Haritsah berasal dari Banu Kalb yang menghuni sebelah utara jazirah Arab. Pada masa kecilnya, ia ditangkap oleh sekelompok penjahat yang kemudian menjualnya sebagai seorang budak. Kemudian ia dibeli oleh Hukaim bin Hisyam keponakan dari Khadijah. Oleh Khadijah, ia diberikan kepada Nabi Muhammad yang kemudian memerdekakan Zaid bin Haritsah. Ia adalah salah satu orang yang pertama dalam memeluk agama Islam.\n",
            ),
            Image(
                R.drawable.husain_8,
                "Husain bin Ali",
                "Selama kekhalifahan ayahnya, Husain menemaninya dan mengambil bagian dalam perangnya. Dalam pertempuran Safin, Husain memberikan pidato kepada orangorang untuk mendorong mereka berperang. Husain termasuk di antara mereka yang dikutuk oleh Muawiyah Ali dan mereka. Haj Manouchehri mengatakan tentang perilaku Husain dengan Hasan bahwa pada saat kesetiaan rakyat kepada Hasan, sekelompok pergi ke Husain dan menuntut kesetiaan kepadanya; Tapi Husain menyatakan dirinya patuh pada kakak lakilakinya. Dengan dimulainya suksesi Hasan bin Ali, Husain menurutinya, karena menurut Haj Manouchehri dalam kisah pembalasan Abdurrahman bin Muljam, Pembunuhan Ali, di luar kehendaknya, menerima permintaan saudaranya dengan cara pembalasan. Karena dia menganggapnya sebagai Imam pada masanya. Setelah orangorang menerima kesetiaan kepadanya, Hasan pergi ke mimbar dan memberikan pidato yang dianggap beberapa orang sebagai upaya untuk berdamai dengan Muawiyah.",
            ),
            Image(
                R.drawable.ammar_9,
                "Ammar bin Yasir",
                "Ammar bin Yasir adalah anak dari Sumayyah binti Khayyat dan Yasir bin Amir yang merupakan salah satu dari orang yang terawal dalam memeluk agama Islam atau disebut dengan Assabiqunal Awwalun. Keluarganya berasal dari Tihanah, suatu daerah di Yaman yag kemudian datang ke Mekkah untuk mencari saudaranya yang hilang dan kemudian menetap di sana. setelah Ammar bin Yasir dan keluarga memeluk Islam, kemudian mereka disiksa oleh Abu Jahal untuk melepaskan Islam. Dalam siksaan itu orang tua Ammar bin Yasir tewas oleh kekejaman kaum Quraisy. Sementara Ammar selamat setelah diperlihatkan mukjizat oleh Rasulullah yang mengubah api menjadi dingin. Ia ikut dalam hijrah ke Habasyah saat ini Ethiopia dan kemudian hijrah ke Madinah.\n",
            ),
            Image(
                R.drawable.khalid_10,
                "Khalid bin Walid",
                "Khalid bin Walid  Syaifullah Al  Maslul  dilahirkan kirakira 17 tahun sebelum masa pembangunan Islam. Dia anggota suku Bani Makhzum. Ayahnya bernama Walid bin alMughirah yang memiliki jabatan sebagai kepala suku Bani Makhzum, suatu klan bagian dari suku Quraisy yang menetap di Mekkah. Sedangkan ibu Khalid bernama Lubabah binti alHarith. Setelah kelahirannya, sesuai dengan tradisi kaum Quraisy pada zaman itu, Khalid dikirim ke sebuah suku Badui di gurun, dimana ibu angkat akan merawatnya. Saat Khalid berumur 5 atau 6, dia dikembalikan ke orang tuanya di Mekkah. Pada masa kanakkanaknya, Khalid pernah mengalami serangan cacar ringan, cacar tersebut hilang walaupun meninggalkan beberapa bekas luka di pipi kirinya. Khalid termasuk di antara keluarga Nabi yang sangat dekat. Maimunah, bibi dari Khalid, adalah isteri Nabi. Dengan Umar sendiri pun Khalid ada hubungan keluarga, yakni saudara sepupunya. Suatu hari pada masa kanakkanaknya kedua saudara sepupu ini main adu gulat. Khalid dapat mematahkan kaki Umar. Untunglah dengan melalui suatu perawatan kaki Umar dapat diluruskan kembali dengan baik.",
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_profil -> {
                val profilIntent = Intent(this@MainActivity, Profil::class.java)
                startActivity(profilIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}