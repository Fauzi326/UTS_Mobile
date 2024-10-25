package id.ac.polbeng.muhammadfauzi.kalkulator

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.muhammadfauzi.kalkulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inisialisasi elemen UI
        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        val number3 = findViewById<EditText>(R.id.number3)
        val result = findViewById<TextView>(R.id.result)
        val result1 = findViewById<TextView>(R.id.result1)


        // Set onClickListener untuk tombol Tambah
        binding.buttonHasil.setOnClickListener {
            val num1 = number1.text.toString()
            val num2 = number2.text.toString()
            val num3 = number3.text.toString()

            // Cek apakah input tidak kosong
            if (num1.isNotEmpty() && num2.isNotEmpty() && num3.isNotEmpty()) {
                val n1 = num1.toInt()
                val n2 = num2.toInt()
                val n3 = num3.toInt()

                // Hitung penjumlahan
                val volume = n1 * n2 *n3
                val luas = 2*(n1*n2+n1*n3+n2*n3)

                // Tampilkan hasil di TextView
                result.text = "Hasil Volume: $volume"
                result1.text = "Hasil Luas Permukaan: $luas"

            } else {
                result.text = "Harap masukkan semua inputan."
            }
        }
    }
}
