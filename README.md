# Uporaba Lottie knjižnice v Android projektu

## Uporabljena knjižnica

Ta Android aplikacija uporablja knižnico [Lottie](https://github.com/airbnb/lottie-android) podjetja Airbnb .

## Zakaj Lottie?

Lottie je knjižnica za Android in iOS, ki parsa animacije Adobe After Effects, izvožene kot JSON z Bodymovin, in jih renderira nativno na mobilnih napravah. Lottie animacija je JSON animacija z vektorsko strukturo.

### Prednosti

- Lottie animacije so veliko manjše kot GIF ali MP4, zaradi česar se posledično nalagajo dosti hitreje
- Animacije so skalabilne, saj temeljijo na vektorski strukturi, torej so zelo uporabne za aplikacije, ki se prikazujejo na zaslonih različnih velikosti
- So interakivne kar pomeni da lahko razvijalci manipulirajo z elementi animacije in ustvarijo interaktivne animacije, ki se odzivajo uporabniku(klikanje, scrollanje, lebdenje)
- Na spletu lahko najdemo veliko zastonj animacij, kot na primer [LottieFiles](https://lottiefiles.com/)

### Slabosti

- Lottie animacije so kompatibilne samoe z Adobe After Effect, kar pomeni, da smo glede ustvarjanje animacij omejeni
- Animacije se ne prenašajo med ekrani, torej ne moremo ustvariti animacij za tranzicijo

## Licenca

Lottie je licenciran pod Apache License 2.0

## Število uporabnikov

Do decembra 2023 je Lottie na GitHubu označilo več kot 30.000 uporabnikov. Podjetja, ki uporabljajo Lottie v svojih aplikacijah so med drugimi Nike, Netflix in Spotify.

## Vzdrževanje projekta

Lottie aktivno vzdržuje Airbnb, zadnji commit je bil narejen 15.12.2023.

## Primer uporabe

### Vključitev v projekt

```  dependencies {
  implementation 'com.airbnb.android:lottie:$lottieVersion'
} ```

## Avtor

Jakob Krajnc

