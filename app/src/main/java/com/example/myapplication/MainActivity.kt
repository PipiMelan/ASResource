package com.example.myapplication

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
          Activity is used to manage the interface,lifecycle and interaction(交互)
          you need to design the concrete interface by yourself
                res -> layout -> .xml
           Associate Layout layout files and Java/Kotlin codes with 'setContentView'
           All the resource files own the corresponding ID with themselves to make it accessible
           R.layout.activity_main
           R.drawable.1.png
        */

        setContentView(R.layout.activity_main)

        //Listen for the event when the button is clicked
        //mLoginBtn.setOnClickListener(this)

       /* mLoginBtn.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                println("2.Btn Clicked")
            }

        })*/

        /*mLoginBtn.setOnClickListener({view:View? ->
            println("3.Btn Clicked")
        })*/

        /*mLoginBtn.setOnClickListener{view:View? ->
            println("4.Btn Clicked")
        }*/

        mLoginBtn.setOnClickListener{
            // apply, also, with, run

            // apply
            // Use blocks of code directly inside object which can access the attributes and methods of this object
            ObjectAnimator.ofFloat(mHeader,"rotation",0f,360f).apply {
                duration = 10
                repeatCount = 20
                start()
                addListener(object : MyAnimatorListener(){
                    override fun onAnimationEnd(animation: Animator?) {
                        startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                    }
                })
            }


            // also
            /*ObjectAnimator.ofFloat(mHeader,"rotation",0f,360f).also {
                it.duration = 100
                it.repeatCount = 20
                it.start()
                it.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationRepeat(animation: Animator?) {
                        TODO("Not yet implemented")
                    }

                    override fun onAnimationEnd(animation: Animator?) {
                        // interface jump
                        startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                    }

                    override fun onAnimationCancel(animation: Animator?) {
                        TODO("Not yet implemented")
                    }

                    override fun onAnimationStart(animation: Animator?) {
                        TODO("Not yet implemented")
                    }

                })
            }*/

            /*// Add rotation animation and skip to the next screen when this finished
            // rotation translation(平移) scale(缩放) transparency(透明度)
            val anim = ObjectAnimator.ofFloat(mHeader,"rotation",0f,360f)
            anim.duration = 10
            anim.repeatCount = 20
            anim.start()

            // Listen the event when the animation finished
            anim.addListener(object : Animator.AnimatorListener {
                override fun onAnimationRepeat(animation: Animator?) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationEnd(animation: Animator?) {
                    // interface jump
                    startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                }

                override fun onAnimationCancel(animation: Animator?) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationStart(animation: Animator?) {
                    TODO("Not yet implemented")
                }

            })
*/


           //interface jump
            startActivity(Intent(this,DetailActivity::class.java))
        }

    }

    override fun onClick(v: View?) {
        println("1.Btn Clicked")
    }
}