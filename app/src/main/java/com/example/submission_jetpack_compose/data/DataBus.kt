package com.example.submission_jetpack_compose.data

import androidx.compose.runtime.mutableStateListOf

object DataBus {
    data class HomeListItemData(
        val headlineText: String,
        val imageUrl: String,
        val supportingText: String,
        val description: String
    )

    var data = mutableStateListOf(
        HomeListItemData(
            "PO Lorena Karina",
            "https://th.bing.com/th/id/OIP.NciiC-hDIhoIk6iAbAvRQgHaE8?w=237&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7",
            "Jakarta Pusat, DKI Jakarta",
            "Kini, perusahaan yang bermarkas di Jl. K.H. Hasyim Ashari Dalam No. 15 C.2, Gambir, Jakarta Pusat ini telah menjangkau lebih dari 60 kota di Jawa, Bali, dan Sumatra. Untuk memaksimalkan pelayanannya, Lorena menyediakan armada bus dengan pilihan kelas eksekutif, VIP, dan bisnis. Bus kelas eksekutif hanya melayani trayek Jawa bagian timur dan Bali. Selain memiliki kapasitas 32 kursi dengan format 2 - 2 dan kursi yang dapat disandarkan (reclining seat), setiap penumpang juga bisa menikmati perjalanan dengan nyaman berkat adanya fasilitas AC, fasilitas hiburan audio video, toilet, smoking area, bantal, dan selimut."
        ),
        HomeListItemData(
            "PO Hiba Group",
            "https://th.bing.com/th/id/OIP.-QRx-OVgVj4xhvQ5mzeslgHaE8?rs=1&pid=ImgDetMain",
            "Jakarta Timur, DKI Jakarta",
            "Berawal dari penyediaan bus pariwisata di tahun 1949, kini Hiba Group telah menjadi salah satu perusahaan transportasi terbesar di Indonesia yang melayani masyarakat luas dan juga perusahaan-perusahaan. Perkembangan bisnis Hiba Group telah mencakup penyewaan Bus Pariwisata, Antar Jemput Karyawan, AKAP (Antar Kota Antar Propinsi), Pemadu Moda Bandara, Rental Mobil untuk Korporasi, Logistik dan Dealer Hino."
        ),
        HomeListItemData(
            "PO Rosalia Indah",
            "https://th.bing.com/th/id/OIF.942R9ngocspOu4LoAug3TA?w=323&h=182&c=7&r=0&o=5&dpr=1.5&pid=1.7",
            "Sragen, Jawa Tengah",
            "PT Rosalia Indah Transport adalah sebuah perusahaan yang sedang berkembang pesat dan merupakan perusahaan pribumi yang diperhitungkan dalam percaturan bisnis jasa angkutan darat di Indonesia. Ketatnya kondisi persaingan bisnis transportasi darat sejak era 1990-an sampai saat ini bukan menjadi kendala bagi PT Rosalia Indah Transport, bahkan pada masa itu dijadikan titik tolak dari yang semula berorientasi pada pelayanan transportasi AKDP menjadi AKAP (Antar Kota Antar Propinsi) yang lebih memiliki daya jangkau luas, lebih handal dan lebih mantap hingga saat ini, dengan sumber daya manusia lebih dari 1.000 personil dan lebih dari 140 kantor perwakilan dan agen Rosalia Indah tersebar di Jawa - Sumatera. Bahkan PT Rosalia Indah Transport juga telah siap melayani pangsa pasar pariwisata ataupun carter bis pariwisata dengan armada khusus."
        ),
        HomeListItemData(
            "PO Primajasa",
            "https://th.bing.com/th/id/OIP.uEIwkaW6Bmtez1FvcfBV2wAAAA?rs=1&pid=ImgDetMain",
            "Jakarta Timur, DKI Jakarta",
            "Berdiri pada 1991, PT Primajasa Perdanaraya Utama mengawali operasinya sebagai layanan bus pariwisata. Bermodalkan 25 armada bus, Primajasa menyediakan rute pulang pergi Bogor – Tangerang via Jakarta. Setelah bisnisnya berkembang, Primajasa melakukan perluasan layanan dengan menghadirkan rute Antar Kota Antar Provinsi (AKAP) pada 2001 dan membuat beragam terobosan dalam layanan publik di bidang transportasi darat. Beberapa terobosan tersebut adalah dengan membuka rute yang belum atau jarang diminati oleh kompetitor. Primajasa juga tak hanya melayani penumpang antarterminal, tetapi juga membuka pul bus di sejumlah pusat keramaian, seperti bandara, pelabuhan, pusat perbelanjaan, hingga perumahan. Sebagai contoh, Primajasa membuka trayek AKAP Tanjung Priok – Merak dan Bandara Internasional Soekarno-Hatta – Bandung untuk melayani kebutuhan penggunanya."
        ),
        HomeListItemData(
            "PO MGI (Maya Gapura Intan)",
            "https://th.bing.com/th/id/OIP.MS9cVZ7bvQ_ryFPCoy_YYAHaEK?rs=1&pid=ImgDetMain",
            "Bandung, Jawa Barat",
            "Suka berpergian ke Bandung? Cek jadwal bus MGI di sini! Jika Anda menginginkan perjalanan nyaman dengan harga terjangkau, bus MGI jawabannya. Hingga saat ini jadwal MGI sudah menaungi kota-kota popular, seperti Jakarta, Bandung, Depok, Sukabumi, Cimahi, dan Bogor. Selain itu bus MGI juga mempunyai rute teratas, seperti Jakarta ke Cimahi, Bandung ke Depok, Depok ke Bandung, Bandung ke Sukabumi, dan Sukabumi ke Bandung. Anda bisa cek jadwal MGI Bandung Bogor di pusat layanan bus MGI terletak di Soekarno-Hatta St No. 768, Cipadung Kidul, Panyileukan, Kota Bandung, Jawa Barat."
        ),
        HomeListItemData(
            "PO Doa Ibu",
            "https://i0.wp.com/terminalbus.id/wp-content/uploads/2021/08/jadwaltarifbusdoaibu.jpg?resize=768%2C768&ssl=1",
            "Tasikmalaya, Jawa Barat",
            "Bus AKAP yang satu ini melayani perjalanan dari Kota Jakarta ke beberapa kota lainnya seperti Tasikmalaya, Banjar hingga Cilacap. Untuk titik keberangkatannya sendiri biasanya ada di Terminal Kampung Rambutan, Depok, Cikarang dan Tasikmalaya."
        ),
        HomeListItemData(
            "PO Haryanto",
            "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgTSXV6lRItYWHy_jyMRqBi1z_s9KGd4OwtWDumLRitU63mXmrYGPfxBpBdpLEiL_N3fXWP09wQJVVQ9U8O1BAxwryUAvhAAjb66jQA9iO18rIZjrT7XoyZIm7T_gCRisllc3OF1pQSem7pZNC1T-uwSoSyEk_VVAwn3ujBg3eowNgAP287bf95I-U/w640-h640/319742410_538299364832590_7403315080607952093_n.webp=w348-rw-h348-c",
            "Tangerang, Banten",
            "PO. Haryanto berdiri sejak tahun 2002 dengan pemilik Bapak Haji Haryanto yang sebelumnya adalah anggota ABRI yang bertugas di Batalyon Artileri Pertahanan Udara Ringan 1/Kostrad TNI Angkatan Darat di Tangerang. Sebelumnya Bapak H. Haryanto memiliki bisnis sampingan dengan membuka agen tiket bus selain pekerjaan utamanya sebagai tentara. Berawal dengan 6 unit bus dari pinjaman Bank dengan rute Cikarang - Cimone namun tidak berjalanan lancar sehingga mengganti armadanya dengan bus Antar Kota Antar Propinsi dengan rute Jakarta - Kudus, Jakarta Pati dan Jakarta - Jepara."
        ),
        HomeListItemData(
            "PO Karunia Bakti",
            "https://gobus.id/wp-content/uploads/2022/12/bus-karunia-bakti-580-x-533.jpg",
            "Garut, Jawa Barat",
            "Bus yang tergabung dalam perusahaan otobus Mayasari ini melayani trayek dalam kota Garut saja dengan tarif yang ramah di kantong. Fasilitas yang diberikan kepada Anda sebagai penumpang juga memadai untuk membuat nyaman selama perjalanan."
        ),
        HomeListItemData(
            "PO Redwhite Star",
            "https://primajasa.info/wp-content/uploads/2021/04/shutle.jpg",
            "Bandung, Jawa Barat",
            "Shuttle Antar Jemput Jakarta - Bandung yang terpercaya"
        ),
        HomeListItemData(
            "PO City Trans Utama",
            "https://ibistrans.com/wp-content/uploads/2019/11/Bus-Pariwisata-City-Trans-Utama.jpg",
            "Sukabumi, Jawa Barat",
            "Bus Pariwisata City Trans Utama (CTU) merupakan operator bus pariwisata yang telah berdiri sejak pertengahan 2008 silam. PO Bus Pariwisata ini beroperasi dan memiliki garasi di kota Bandung, Sukabumi serta Jakarta, eksistensi dan popularitas Bus pariwisata city trans utama kian menanjak berkat layanan prima dan armada bus dengan predikat amat baik dikalangan travelers."
        ),
    )
}