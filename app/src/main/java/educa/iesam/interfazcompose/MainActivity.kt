package educa.iesam.interfazcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import educa.iesam.interfazcompose.ui.theme.InterfazComposeTheme
import androidx.constraintlayout.compose.ConstraintLayout as ComposeConstraintLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            InterfazComposeTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    MiInterfaz(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MiInterfaz(modifier: Modifier = Modifier) {

    ComposeConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .border(5.dp, Color.Black, RoundedCornerShape(3.dp))
            .padding(12.dp)
    ) {

        val (casilla1, casilla2, casilla3, casilla4, casilla5) =
            createRefs()

        // CASILLA 1: VERDE
        Box(
            modifier = Modifier
                .size(width = 85.dp, height = 85.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Green)
                .constrainAs(casilla1) {
                    centerHorizontallyTo(parent, bias = 0.43f)
                    centerVerticallyTo(parent, bias = 0.35f)
                }
        )

        // CASILLA 2: AZUL TURQUESA
        Box(
            modifier = Modifier
                .size(width = 55.dp, height = 62.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Cyan)
                .constrainAs(casilla2) {
                    centerHorizontallyTo(parent, bias = 0.39f)
                    centerVerticallyTo(parent, bias = 0.27f)
                }
        )

        // CASILLA 3: NEGRA
        Box(
            modifier = Modifier
                .size(width = 140.dp, height = 125.dp)
                .clip(RoundedCornerShape(3.dp))
                .background(Color.Black)
                .constrainAs(casilla3) {
                    centerHorizontallyTo(parent, bias = 0.52f)
                    centerVerticallyTo(parent, bias = 0.49f)
                }
        )

        // CASILLA 4: ROJA
        Box(
            modifier = Modifier
                .size(width = 72.dp, height = 70.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Red)
                .constrainAs(casilla4) {
                    centerHorizontallyTo(parent, bias = 0.72f)
                    centerVerticallyTo(parent, bias = 0.44f)
                }
        )

        // CASILLA 5: MAGENTA
        Box(
            modifier = Modifier
                .size(width = 94.dp, height = 84.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Magenta)
                .constrainAs(casilla5) {
                    centerHorizontallyTo(parent, bias = 0.52f)
                    centerVerticallyTo(parent, bias = 0.81f)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InterfazComposeTheme {
        MiInterfaz()
    }
}
