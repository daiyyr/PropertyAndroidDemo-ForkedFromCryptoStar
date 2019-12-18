package ws.wolfsoft.cryptostar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Login(View v) {
        Intent intent = new Intent(this, WalletCryptoStarActivity.class);
        startActivity(intent);
    }

//    OnClickListener onClickListener = new OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            startActivity(new Intent(WalletCryptoStarActivity));
//        }
//    };
//
//    customfonts.Button_SF_Pro_Display_Semibold button =
//            (customfonts.Button_SF_Pro_Display_Semibold) findViewById("@+id/bottom_btn");
//    button.setOnClickListener(onClickListener);

}
