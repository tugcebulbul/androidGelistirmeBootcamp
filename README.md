#İlan Uygulaması

Bu proje, @Kasım Adalan tarafından verile Android Geliştirme Bootcamp'i sırasında örenilen XML tabanlı arayüz tasarımı bilgilerini pekiştirmek amacıyla geliştirilen ürün satışına yönelik bir ilan ekranı örneğidir. 
## Özellikler

**XML Tabanlı Tasarım**  
  Uygulama arayüzü yalnızca Android XML layout yapıları ile oluşturulmuştur.  
  Kullanılan bileşenler:
  - `ConstraintLayout` 
  - `Toolbar` 
  - `ImageView`, `TextView`, `Button` 

  **Ürün Detayları**  
  - Ürün başlığı, açıklama ve görseli  
  - Fiyat ve kargo bilgileri  
  - Ürün özellikleri  
  - “Düzenle” ve “Satıldı” butonları

  **Tema ve Görsel Özelleştirme**
  - **Renk Tanımlama**: Uygulamada özel renk paletleri `colors.xml` dosyasında tanımlanmıştır.  
  - **Özel Font Kullanımı**: Başlık için `@font/caprasimo` fontu kullanılmıştır.  
  - **Dark Mode Desteği**: Uygulama açık ve koyu modlar için destek sağlar.

  **Çoklu Dil Desteği**
  - Türkçe ve İngilizce yerelleştirme desteklenmektedir. Tüm metinler `strings.xml` dosyalarında tanımlanmıştır.

  **Çoklu Ekran Desteği**
  - Uygulama farklı ekran boyutlarında (telefon, tablet) sorunsuz çalışacak şekilde esnek `ConstraintLayout` yapısıyla tasarlanmıştır.

## Kullanılan Teknolojiler

- Android XML Layouts  
- ConstraintLayout  
- AppCompat Toolbar  
- XML String Resources (Dil desteği)
- XML Styles & Themes (Açık/Koyu Mod)  
- Custom Fonts  
- Custom Colors  
