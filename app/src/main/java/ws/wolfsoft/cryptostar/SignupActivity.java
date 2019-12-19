package ws.wolfsoft.cryptostar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ImageView arrow = findViewById(R.id.nextarrow);

        arrow.setVisibility(View.INVISIBLE);
    }

    public void NavigateToLogin(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void CreateAccount(View v) {
        Intent intent = new Intent(this, WalletCryptoStarActivity.class);
        startActivity(intent);
    }

}
