package cn.ju.cv

import android.content.Intent
import android.os.Bundle
import cn.ju.comm.BaseFragment
import cn.ju.cv.barChart.BarChartActivity
import cn.ju.sc.R
import kotlinx.android.synthetic.main.fragment_cv.*

class CVFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_cv
    }

    override fun initView(savedInstanceState: Bundle?) {
        // barChart
        barChart.setOnClickListener {
            startActivity(Intent(activity,BarChartActivity::class.java))
        }


    }

}