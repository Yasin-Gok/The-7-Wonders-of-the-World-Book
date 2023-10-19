package com.yasingok.landmarkbook;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.yasingok.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();
        // Data
        Landmark artemis = new Landmark("Artemis Tapınağı", "Türkiye",
                "Efes'teki Artemis Tapınağı, milattan önce 7. yüzyıla kadar uzanan köklere" +
                        " sahip ve tanrıça Artemis'e adanan antik bir tapınaktır. Tamamen mermerden" +
                        " inşa edilen tapınak, Lidya kralı Croesus tarafından yaptırılmış ve ünlü" +
                        " Yunan mimar Chersiphron tarafından tasarlanmıştır. Dönemin ünlü heykeltıraşları" +
                        " Pheidias, Polycleitus, Kresilas ve Phradmon tarafından yapılan bronz heykellerle" +
                        " süslenmiştir. Tapınak, pazar yeri ve dini bir kurum olarak kullanılmıştır." +
                        " Ancak, M.Ö. 21 Temmuz 356'da bir Yunan olan Herostratus tarafından yakılmıştır," +
                        " aynı gece Büyük İskender doğmuştur. Büyük İskender, Artemis Tapınağı'nın yeniden" +
                        " yapılması için yardım teklif etmiş, ancak teklif reddedilmiştir.", R.drawable.artemis);

        Landmark babil = new Landmark("Babil'in Asma Bahçeleri", "Irak",
                "Babil'in Asma Bahçeleri, antik Mezopotamya'da yer alan çok katlı bir bahçeydi." +
                        " Babil kralı Nebukadnezar tarafından M.Ö. 7. yüzyılda inşa ettirilen bu bahçeler," +
                        " kubbeler, sütunlar, taraçalar ve sulama sistemleri içeriyordu. Bahçeler Fırat" +
                        " Nehri'nden gelen suyla sulanıyordu. İnşa nedeni olarak Nebukadnezar'ın karısı" +
                        " Semiramis'in özlemi olduğu söylenir. Ancak günümüze bu bahçelerin kesin izleri" +
                        " ulaşmamıştır, sadece bazı kalıntılar bulunmuştur.", R.drawable.babil);

        Landmark halikarnas = new Landmark("Halikarnas", "Türkiye", "Mausoleum, " +
                "M.Ö. 350'de inşa edilen büyük bir mezar anıtıdır. Bodrum yakınlarında bulunur, altınla" +
                " süslenmiş bir su mermeri lahit ve mezar odası içerir. İyonya tarzı kolonlar ve sıra" +
                " sütunlarla çevrilidir, üzerinde savaş arabası heykeli bulunur. Mausoleum, 45 metre" +
                " yüksekliğindeydi. 16. yüzyıla kadar iyi durumdaydı, ancak 15. yüzyılda Bodrum Kalesi" +
                " inşa edilirken taşları kullanıldı.", R.drawable.halikarnas);

        Landmark iskenderiye = new Landmark("İskenderiye Feneri", "Mısır", "Faros Feneri," +
                " İskenderiye'de M.Ö. 290'larda başlayan bir projenin ardından inşa edilen devasa bir fenerdi." +
                " 166 metre yüksekliğiyle o dönemin en yükseği ve etkileyicisiydi. Gündüzleri güneş ışığını" +
                " denize yansıtan cilalı bronz aynalar kullanıyor, geceleri ise ateşlerle 50 km uzaktan" +
                " görülebiliyordu. Maalesef, depremler ve doğal etkenler sonucu zamanla zarar gördü. Üst kısmı" +
                " 955'te kayboldu, gövde kısmı 1302'de yıkıldı. En sonunda, 1480'de Memluk Sultanı Kait-bay" +
                " tarafından tamamen yıkıldı.", R.drawable.iskenderiye);

        Landmark piramitler = new Landmark("Mısır Piramitleri", "Mısır",
                "Mısır Piramitleri, Mısır'ın Giza şehrinde yer alır ve eski Mısır medeniyetinin bir" +
                        " parçası olarak inşa edilmiş büyük piramitlerdir. " +
                        "Bu piramitler arasında Keops Piramidi en ünlüsüdür. Antik Mısırlılar, ölülerin" +
                        " ölümden sonraki yaşama hazırlandığı yerler olarak inşa ettiler.", R.drawable.piramit);

        Landmark rodos = new Landmark("Rodos Heykeli", "Yunanistan",
                "Rodos Heykeli, Rodos adasında antik dönemde inşa edilmiş olan büyük bir heykeldir. " +
                        "Helios, Güneş Tanrısı'nın heykeli olarak bilinir ve eski dönemlerde denizcileri" +
                        " karşılayan bir anıt olarak hizmet vermiştir.", R.drawable.rodos);

        Landmark zeus = new Landmark("Zeus Heykeli", "Yunanistan",
                "Zeus Heykeli, Antik Yunan döneminde Olimpia'da bulunan Zeus Tapınağı için" +
                        " yapılmış büyük bir heykeldir. " +
                        "Heykel, Antik Yunan döneminin önemli bir sanat eseri olarak kabul edilir ve" +
                        " Zeus'un tahtında otururken tasvir edilir.", R.drawable.zeus);

        landmarkArrayList.add(artemis);
        landmarkArrayList.add(babil);
        landmarkArrayList.add(halikarnas);
        landmarkArrayList.add(iskenderiye);
        landmarkArrayList.add(piramitler);
        landmarkArrayList.add(rodos);
        landmarkArrayList.add(zeus);

        /*
        // Adapter
        // List view
        // Tüm veriler için yer oluştururken recycler view gerektiğinde oluşturduğu için daha verimlidir
        // Burada layout. kısmından sonra format belirleniyor, mesela biz sadece text seçmiş olduk

        //ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, landmarkArrayList);
        //binding.listView.setAdapter(arrayAdapter);

        // Mapping
        // Üstte listelerin kayıtlı olduğu yerler görünüyor, veri görünmüyor
        // Bu yöntem ile bunu çözüyoruz

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);

        // Tıklanma
        // Farklı türlerde click eventleri var, isteğimize göre seçmemiz gerek
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this, landmarkArrayList.get(i).name, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Details.class);
                intent.putExtra("Veri", landmarkArrayList.get(i));

                startActivity(intent);
            }
        });
         */

        // Recycler View daha verimli fakat bunu kullanmak için bir sınıf oluşturmamız gerek
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Alt alta mı  yan yana mı sıralanmasını sağlar
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
    }
}