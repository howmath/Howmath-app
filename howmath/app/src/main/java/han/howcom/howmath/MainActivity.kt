package han.howcom.howmath

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView




class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.main_drawer_layout)
        navigationView = findViewById(R.id.navigation_view)

        navigationView.setNavigationItemSelectedListener(this)
    }
        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            when(item.itemId){
                R.id.account-> Toast.makeText(this,"account clicked",Toast.LENGTH_SHORT).show()
                R.id.item2-> Toast.makeText(this,"item2 clicked",Toast.LENGTH_SHORT).show()
                R.id.item3-> Toast.makeText(this,"item3 clicked",Toast.LENGTH_SHORT).show()
            }
            return false
        }

        override fun onBackPressed() { //뒤로가기 처리
            if(drawerLayout.isDrawerOpen(GravityCompat.START)){
                drawerLayout.closeDrawers()
                // 테스트를 위해 뒤로가기 버튼시 Toast 메시지
                Toast.makeText(this,"back btn clicked",Toast.LENGTH_SHORT).show()
            } else{
                super.onBackPressed()
            }
        }
}