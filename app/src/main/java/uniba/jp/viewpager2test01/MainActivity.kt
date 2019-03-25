package uniba.jp.viewpager2test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager2.widget.ViewPager2
import uniba.jp.viewpager2test01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        binding.viewModel = viewModel

        lifecycle.addObserver(viewModel)
        binding.lifecycleOwner = this

        val listItem = arrayListOf("TEST0", "TEST1", "TEST2", "TEST3", "TEST4", "TEST5")
        binding.viewpager2.adapter = ViewPager2Adapter(listItem)

        binding.button1.setOnClickListener {
            binding.viewpager2.orientation = ViewPager2.ORIENTATION_VERTICAL
        }

        binding.button2.setOnClickListener {
            binding.viewpager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        }
    }
}
