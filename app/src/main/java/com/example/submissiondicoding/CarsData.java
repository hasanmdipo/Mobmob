package com.example.submissiondicoding;

import java.util.ArrayList;

public class CarsData {
    public static String[] carsNames = {
            "BMW 3 Series 320i",
            "BMW 4 Series 430i",
            "BMW 5 Series 520i",
            "BMW 6 Series 630",
            "BMW 7 Series 730Li",
            "BMW 8 Series 840i",
            "BMW X1 sDrive18i",
            "BMW X4 xDrive30",
            "BMW X7 xDrive40i",
            "BMW i Series i3s",
    };

    public static String[] carsPrice = {
            "Rp. 946.000.000",
            "Rp. 1.600.000.000",
            "Rp. 1.060.000.000",
            "Rp. 1.816.000.000",
            "Rp. 1.950.000.000",
            "Rp. 2.735.000.000",
            "Rp. 830.000.000",
            "Rp. 1.668.000.000",
            "Rp. 2.724.000.000",
            "Rp. 1.487.000.000",
    };

    public static String[] carsDetail = {
            "Sebagai legenda, BMW Seri 3 wakili inti dari jajaran kendaraan brand ini dengan telah terjual lebih dari 15 juta unit di seluruh dunia dan menjadi detak jantung brand BMW. Hadir dengan desain dinamis, handling terbaik, efisiensi luar biasa, dan fitur inovatif, pertahankan karakteristik khas BMW Seri 3, bahkan diangkat ke level yang lebih tinggi.",
            "BMW Seri 4 menjadi penerus spirit sedan coupe dan cabriolet dari BMW. Varian ini memancarkan aura kuat di jalanan berpadu dengan aura kedinamisan sekaligus memberikan kenikmatan berkendara yang melimpah. Sembari mengeksplorasi kemampuan BMW Seri 4 di jalanan, penumpang di dalam kabin akan disuguhkan kabin berkonsep elegan dan sporty. Layout dashboard dirancang terfokus untuk pengemudi, serta balutan material dakota leather di area kabin meningkatkan kenyamanan serta citarasa premium.",
            "BMW The New 5 Series hadir dengan kesan elegan dengan lampu LED Adaptive yang dilapisi chrome pada pinggirannya sehingga juga menambah kesan premium. Dimensi The New 5 Series bertambah panjangnya menjadi 4,9 meter, lebar 1,8 meter dan tinggi 1,4 meter. Redesain ini diciptakan agar ruang lutut penumpang terasa lebih lega dan nyaman.",
            "The All-New 6 Gran Turismo hadir sebagai sedan yang tak hanya menekankan kesan sporty namun juga memadukan desain elegan sebuah coupe namun tetap fungsional. Seri ini datang dengan panjang keseluruhan bodi 5091 mm, lebar 1902 mm, dan tinggi 1538 mm, sehingga membuat kabin dari mobil ini menjadi sangat lapang dan sangat nyaman untuk membawa keluarga berpergian jarak jauh",
            "The New 7 Series melengkapi enam model BMW di segmen kendaraan mewah. Penyegaran desain seperti lampu belakang tiga dimensi yang berukuran sekitar 35 mm lebih ramping, knalpot yang dikelilingi desain chrome yang lebih besar dan kidney grille BMW dengan singIe-piece surround membuat kesan futuristik dan sporty hadir pada mobil ini.Dimensi The New 7 Series memiliki panjang bodi keseluruhan 5,2 meter, lebar 1,9 meter, dan tinggi 1,4 meter.",
            "Berbeda dengan seri lainnya, The New 8 Series datang dengan lampu depan serta grill yang lebih pipih sehingga membuat kesan eksklusif hadir pada mobil ini. Penerangan yang nyaman di mata dengan jangkauan yang juah juga dapat dirasakan dengan adanya laserlight pada seri ini.Dimensi The New 8 Series memiliki panjang bodi keseluruhan 4,8 meter, lebar 1,9 meter dan tinggi 1,3 meter.",
            "BMW X1 menekankan konsep mobil atletis nan kompak tanpa menghilangkan unsur desain tampilan Sports Activity Vehicle (SAV) khas keluarga BMW X Series. BMW X Series ditujukan bagi masyarakat urban aktif dan gemar berpetualang.",
            "The New X4 Series yang hadir di segmen Sport Activity Coupe ini tampil dengan kesan sporty dan siluet dinamis dengan garis jendela yang panjang dan lekukan hofmeister kink di pilar C.Seri ini memiliki dimensi dengan total panjang keseluruhan bodi 4752 mm, lebar 1918 mm, dan tinggi 1621 mm.",
            "Sebagai mobil luxury Sports Activity Vehicle (SAV) X7 xDrive40i Excellence memiliki fitur komplit, sebut saja diantaranya 6 airbag (Driver and Passenger, Front Side, Front and Rear Curtain), Parking Assistant Plus incl. Surround View system, Reversing Assistant and Parking assistant for parallel and lateral parking, Harman Kardon surround sound system, 16 speakers, 464 W digital amplifier. Terdapat pengaturan Ambient light dan pilihan beberapa mode berkendara.",
            "The i3s yang hadir sebagai kendaraan listrik dan eco-friendly ini memiliki dimensi panjang 4011 mm, lebar 1755 mm, dan tinggi 1598 mm.Bagian bemper depan yang menampilkan surround berwarna hitam dan gril khas BMW menambah kesan desain yang dinamis pada mobil ini.",
    };

    private static int[] carsImages = {
            R.drawable.bmw_320i,
            R.drawable.bmw_z4,
            R.drawable.bmw_520i,
            R.drawable.bmw_630,
            R.drawable.bmw_730,
            R.drawable.bmw_840i,
            R.drawable.bmw_x1,
            R.drawable.bmw_x4,
            R.drawable.bmw_x7,
            R.drawable.bmw_i3s,
    };

    static ArrayList<Cars> getListData() {
        ArrayList<Cars> list = new ArrayList<>();
        for (int position = 0; position < carsNames.length; position++) {
            Cars cars = new Cars();
            cars.setName(carsNames[position]);
            cars.setPrice(carsPrice[position]);
            cars.setDetail(carsDetail[position]);
            cars.setPhoto(carsImages[position]);
            list.add(cars);
        }
        return list;
    }
}
