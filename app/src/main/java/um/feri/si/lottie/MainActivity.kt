package um.feri.si.lottie

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.SeekBar
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationView = findViewById<LottieAnimationView>(R.id.animation_view)
        val playButton = findViewById<Button>(R.id.play_button)
        val pauseButton = findViewById<Button>(R.id.pause_button)
        val resumeButton = findViewById<Button>(R.id.resume_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)
        val speedSlider = findViewById<SeekBar>(R.id.speed_slider)

        playButton.setOnClickListener {
            animationView.playAnimation()
        }

        pauseButton.setOnClickListener {
            animationView.pauseAnimation()
        }

        resumeButton.setOnClickListener {
            animationView.resumeAnimation()
        }

        cancelButton.setOnClickListener {
            animationView.cancelAnimation()
        }

        speedSlider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val speed = progress / 100.0f
                animationView.speed = speed
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Do nothing
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Do nothing
            }
        })

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

    }
}