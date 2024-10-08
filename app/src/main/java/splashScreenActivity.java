public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logo = findViewById(R.id.logo);

        Animation translate = AnimationUtils.loadAnimation(this, R.anim.translate);
        Animation scale = AnimationUtils.loadAnimation(this, R.anim.scale);

        // Start animations
        logo.startAnimation(translate);
        logo.startAnimation(scale);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivityForResult(intent, 1);
            finish();
        }, 2000);
    }
}
