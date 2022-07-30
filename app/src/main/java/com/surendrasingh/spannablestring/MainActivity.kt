package com.surendrasingh.spannablestring

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.*
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)

        val string = "I want to change the color of this to RED and this to GREEN."


        // starting from 0
        val startingPositionRed = 38
        val endingPositionRed = 41

        val startingPositionGreen = 54
        val endingPositionGreen = 59

        val startingPositionUnderline = 10
        val endingPositionUnderline = 25


        val spannableString = SpannableString(string)

        // create foreground color span
        val foregroundColorRed = ForegroundColorSpan(Color.RED)
        val foregroundColorGreen = ForegroundColorSpan(Color.GREEN)

        // val backgroundColorSpan

        // set span for RED on string
        spannableString.setSpan(
            foregroundColorRed,
            startingPositionRed,
            endingPositionRed,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        // set span for GREEN on string
        spannableString.setSpan(
            foregroundColorGreen,
            startingPositionGreen,
            endingPositionGreen,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        // underline span
        spannableString.setSpan(
            UnderlineSpan(),
            startingPositionUnderline,
            endingPositionUnderline,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        // Absolute size span
        val textSize = 55
        val isDeviceIndependentPixel = true
        spannableString.setSpan(
            AbsoluteSizeSpan(textSize, isDeviceIndependentPixel),
            startingPositionUnderline,
            endingPositionUnderline,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        textView.text = spannableString


        val textView2 = findViewById<TextView>(R.id.textView2)
        val stringBg = "Add bullet points\n1. Bullet point\n2. Bullet point"

        val startPointBullet = 17
        val endPointBullet = 31
        val startPointBullet2 = 32
        val endPointBullet2 = 46

        val spannableString2 = SpannableString(stringBg)

        // create span for foreground color RED
        // we use already create span

        spannableString2.setSpan(
            BulletSpan(),
            startPointBullet, endPointBullet,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        spannableString2.setSpan(
            BulletSpan(10, Color.GREEN),
            startPointBullet, endPointBullet,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

            // create span for background color GREEN
        val backgroundSpanGreen = BackgroundColorSpan(Color.GREEN)


        // set foreground color span to string
        spannableString2.setSpan(
            foregroundColorRed,
            65, 70, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        // set background color span
        spannableString2.setSpan(
            backgroundSpanGreen,
            66, 70, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        textView2.text = spannableString2

    }
}