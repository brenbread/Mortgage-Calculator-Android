package cmpe137s17.mortgagemonthlypaymentcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText homeValue;
    EditText downPayment;
    EditText taxAPR;
    EditText taxRate;

    Spinner taxTerms;

    Button calcButton;
    Button resetButton;

    TextView totalPaid;
    TextView totalInterest;
    TextView monthPayment;
    TextView payoffDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeValue = (EditText) findViewById(R.id.homeVal);
        downPayment = (EditText) findViewById(R.id.downPayment);
        taxAPR = (EditText) findViewById(R.id.taxAPR);
        taxRate = (EditText) findViewById(R.id.taxRate);

        taxTerms = (Spinner)findViewById(R.id.taxTerms);
        String[] items = new String[]{"0","15", "20", "25", "30", "40"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, items);
        taxTerms.setAdapter(adapter);

        totalPaid = (TextView) findViewById(R.id.totalPaid);
        totalInterest = (TextView) findViewById(R.id.totalInterest);
        monthPayment = (TextView) findViewById(R.id.monthPayment);
        payoffDate = (TextView) findViewById(R.id.payoffDate);

        calcButton = (Button) findViewById(R.id.calcButton);
        resetButton = (Button) findViewById(R.id.resetButton);

        calcButton.setOnClickListener(MainActivity.this);
        resetButton.setOnClickListener(MainActivity.this);



    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.calcButton:
                String homeValueIn = homeValue.getText().toString();
                break;

            case R.id.resetButton:
                totalPaid.setText("");
                totalInterest.setText("");
                monthPayment.setText("");
                payoffDate.setText("");

                homeValue.setText("");
                downPayment.setText("");
                taxAPR.setText("");
                taxRate.setText("");
                //taxTerms.setAdapter(adapter);


                break;
        }
    }
}
