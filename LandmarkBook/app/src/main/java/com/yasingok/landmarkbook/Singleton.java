package com.yasingok.landmarkbook;

public class Singleton {
    // Sadece 1 nesnesi olan ve daha oluşturulamayan bir sınıftır
    // Veri gönderimini yapmaya da yardımcı olabilir intent tarzında
    // Bitmap tarzı şey gönderimlerinde intent verimsiz, bu tarz daha uygun olacaktır
    private Landmark sentLandmark;
    private static Singleton singleton;

    private Singleton() {

    }

    public Landmark getSentLandmark() {
        return sentLandmark;
    }

    public void setSentLandmark(Landmark sentLandmark) {
        this.sentLandmark = sentLandmark;
    }

    public static Singleton getInstance(){  // Bunun sayesinde her seferinde aynı obje elde edilmiş olacak
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}