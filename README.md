# Uporaba Lottie knjižnice v Android projektu

## Uporabljena knjižnica

Ta Android aplikacija uporablja knižnico [Lottie](https://github.com/airbnb/lottie-android) podjetja Airbnb .

## Zakaj Lottie?

Lottie je knjižnica za Android in iOS, ki parsa animacije Adobe After Effects, izvožene kot JSON z Bodymovin, in jih renderira nativno na mobilnih napravah. Lottie animacija je JSON animacija z vektorsko strukturo.

### Prednosti

- Lottie animacije so veliko manjše kot GIF ali MP4, zaradi česar se posledično nalagajo dosti hitreje
- Animacije so skalabilne, saj temeljijo na vektorski strukturi, torej so zelo uporabne za aplikacije, ki se prikazujejo na zaslonih različnih velikosti
- So interakivne kar pomeni da lahko razvijalci manipulirajo z elementi animacije in ustvarijo interaktivne animacije, ki se odzivajo uporabniku(klikanje, scrollanje, lebdenje)
- Dinamična hitrost predvajanje in spreminjanje barv dela animacije
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

```
dependencies {
  implementation 'com.airbnb.android:lottie:$lottieVersion'
}
```

### Nalaganje animacije

- Animacije lahko nalagamo iz direktorijev res/raw ali assets/
- Nalaganje iz res/raw
  ``` app:lottie_rawRes="@raw/hello_world" ```
- Nalaganje iz assets/
  ``` app:lottie_fileName="hello_world.json" ```

![image](https://github.com/JakobKrajnc/PoraLottie/assets/117294464/996bfb85-89ef-4af4-8302-eb53d69a645c)

### Predvajanje animacije

- Animacijo lahko predvajamo z nastavljanjem atributa autoPlay
``` app:lottie_autoPlay="true" ```
- Ali pa programatično
```
val animationView = findViewById<LottieAnimationView>(R.id.animation_view)
animationView.playAnimation()
```

-Animacijo lahko tudi pavziramo, nadaljujemo ali resetiramo
```
animationView.pauseAnimation()
animationView.resumeAnimation()
animationView.cancelAnimation()
```

![lottie_animation](https://github.com/JakobKrajnc/PoraLottie/assets/117294464/aefccb67-af75-4e43-948e-98feddd664a7)

### Spreminjanje hitrosti

-Lottie animacije podpirajo spreminjanje hitrosti predvajanja. To lahko storimo preko atributa ali programatično
``` app:lottie_speed="100" ```

ali

``` animationView.speed = 100 ```

![lottie_speed](https://github.com/JakobKrajnc/PoraLottie/assets/117294464/56cb0bc0-fdb5-4b0b-a5d0-5ad64d1a863b)


### Ostali atributi

Lottie ima še veliko drugih atributov, kot npr:
- loop: Animacija se predvaja v nedogled
- scale: Kontrolira velikost animacije
- progress: Nastavi točko, kjer se animacija začne predvajati (med 0 in 1)
- colorFilter: Nastavi barvni filter celotni animaciji, podano v hex formatu

### Poslušalci dogodkov

- Lottie animacije lahko sprožijo dogodke, ki jih lahko v aplikaciji ujamemo. To nam omogoča, da lahko v aplikaciji ujamemo stanje animacije in se nanj odzovemo oz. v aplikaicji nekaj storimo.
- Nekaj dogodkov, ki jih lahko ujamemo: load, error, play, pause, stop, loop, complete, frame

- Primer v kodi
``` 
animationView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
                Log.d("Lottie", "Animation started")
            }

            override fun onAnimationEnd(animation: Animator) {
                Log.d("Lottie", "Animation ended")
            }

            override fun onAnimationCancel(animation: Animator) {
                Log.d("Lottie", "Animation cancelled")
            }

            override fun onAnimationRepeat(animation: Animator) {
                Log.d("Lottie", "Animation repeated")
            }
        })
```
## Avtor

Jakob Krajnc

