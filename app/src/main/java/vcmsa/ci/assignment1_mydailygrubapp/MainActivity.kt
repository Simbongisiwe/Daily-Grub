package vcmsa.ci.assignment1_mydailygrubapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.collection.emptyLongSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtTimeOfTheDay: EditText = findViewById(R.id.edtTimeOfTheDay)
        val btnSuggest: Button = findViewById(R.id.btnSuggest)//The user will click  this button to get a meal suggestion
        val lblMeal: TextView = findViewById(R.id.lblMeal) //To show meal suggestions
        val btnReset: Button = findViewById(R.id.btnReset) //Clears the input and the suggested meal
        val lblOutput: TextView = findViewById(R.id.lblOutput)

//The user has to click this button to get a suggestion
        btnSuggest.setOnClickListener {

            //Using Log to see what the user inputs
            Log.v("TimeOfTheDay", "${edtTimeOfTheDay.text}")

            //This is how meals will be suggested according to what time of the day the user inputs
            if (edtTimeOfTheDay.text.toString() == "Morning") {
                lblMeal.text = "Breakfast: Omelette"
            } else
                if (edtTimeOfTheDay.text.toString() == "Mid-morning") {
                    lblMeal.text = "Light snack: Crackers topped with mashed avocado seasoned with salt and pepper"
                } else
                    if (edtTimeOfTheDay.text.toString() == "Afternoon") {
                        lblMeal.text = "Lunch: Ramen with soft boiled eggs"
                    } else
                        if (edtTimeOfTheDay.text.toString() == "Afternoon snack") {
                            lblMeal.text = "Light snack: Crackers topped with mashed avocado seasoned with salt and pepper "
                        } else
                            if (edtTimeOfTheDay.text.toString() == "Dinner") {
                                lblMeal.text = "Main course: Oxtail stew with rice"
                            } else
                                if (edtTimeOfTheDay.text.toString() == "After Dinner Snack") {
                                    lblMeal.text = "Frozen ize cream with berries"
                                } else {
                                    lblOutput.text = "Please enter the time of the day"//Error handling for when the user enters something else or nothing at all
                                }
            //This is the reset button, for clearing the input field an the lblOutput
            btnReset.setOnClickListener {
                edtTimeOfTheDay.text.clear()
                lblOutput.text = ""
            }

        } // The IIE,2025. Introduction to Mobile Application and development.
    } // SheCodes
} // CodeCademy







