package com.laychv.module_open_projects

import android.content.Intent
import com.laychv.module_base.comm.onClick
import com.laychv.module_base.ui.BaseFragment
import com.laychv.module_open_projects.dagger2.Dagger2Activity
import com.laychv.module_open_projects.dagger2Android.Dagger2AndroidActivity
import com.laychv.module_open_projects.eventBus.EventBusActivity
import com.laychv.module_open_projects.glide.GlideActivity
import com.laychv.module_open_projects.kotlin.KotlinActivity
import com.laychv.module_open_projects.okHttp.OkHttpActivity
import com.laychv.module_open_projects.picasso.PicassoActivity
import com.laychv.module_open_projects.retrofit.RetrofitActivity
import com.laychv.module_open_projects.rx.rxbinding.ActivityRxBinding
import com.laychv.module_open_projects.rx.rxjava2.RxJava2Activity
import kotlinx.android.synthetic.main.fragment_open_projects.*
import org.jetbrains.anko.startActivity

class OpenProjectsFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_open_projects
    }

    override fun initView() {
//        Glide
        glide.setOnClickListener {
            activity?.startActivity<GlideActivity>()
        }
//         Picasso
        picasso.setOnClickListener {
            startActivity(Intent(activity, PicassoActivity::class.java))
        }
        // eventBus
        eventBus.setOnClickListener {
            startActivity(Intent(activity, EventBusActivity::class.java))
        }
        // okHttp
        okHttp.setOnClickListener {
            startActivity(Intent(activity, OkHttpActivity::class.java))
        }
        // Retrofit
        retrofit.setOnClickListener {
            startActivity(Intent(activity, RetrofitActivity::class.java))
        }
        //RxJava
        rxjava2.onClick {
            startActivity(Intent(activity, RxJava2Activity::class.java))
        }
        // rxbinding
        rxbinding.onClick {
            activity?.startActivity<ActivityRxBinding>()
        }
        // Dagger2
        dagger2.setOnClickListener {
            activity?.startActivity(Intent(activity, Dagger2Activity::class.java))
        }
        dagger2Android.onClick {
            startActivity(Intent(activity, Dagger2AndroidActivity::class.java))
        }
        kotlin
        kotlin.onClick {
            activity?.startActivity<KotlinActivity>()
        }
    }

}