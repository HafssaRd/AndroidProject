package mastersidi.fste.umi.ac.ma.monpremierprojet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Client extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.client);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.client), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonpharmacie_list = findViewById(R.id.buttonpharmacie_list);
        buttonpharmacie_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Client.this, PharmacieList.class);
                startActivity(it);
            }});

        Button button_permanence = findViewById(R.id.button_permanence);
        button_permanence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Client.this, Garde.class);
                startActivity(it);
            }});

        Button button_retour = findViewById(R.id.button_retour);
        button_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                setResult(RESULT_OK, it);
                Client.this.finish();
            }});

    }
}
