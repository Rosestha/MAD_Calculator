package com.rojeshna.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;
    EditText numOne,numTwo;
    TextView Res;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numOne=findViewById(R.id.numberOne);
        numTwo=findViewById(R.id.numberTwo);
        Res=findViewById(R.id.Result);
        btn1=findViewById(R.id.Add);
        btn2=findViewById(R.id.Sub);
        btn3=findViewById(R.id.Mul);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum= convertString(numOne.getText().toString());
                int secondNum= convertString(numTwo.getText().toString());
                int c = AddNum(firstNum,secondNum);
                Res.setText(Integer.toString(c));

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstNum=convertString(numOne.getText().toString());
                int secondNum=convertString(numTwo.getText().toString());
                int c =MulNum(firstNum, secondNum);
                Res.setText(Integer.toString(c));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum=convertString(numOne.getText().toString());
                int secondNum=convertString(numTwo.getText().toString());
                int c = subNum(firstNum,secondNum);
                Res.setText(Integer.toString(c));
            }
        });
    }
      int AddNum(int a,int b)

        {
            int c=a+b;
            return c;


        }

        int MulNum( int a, int b)
        {
            int c=a*b;
            return c;
        }
        int subNum(int bigNum,int smallNum)

        {
            int a=0,b=0 ,c;
            if (bigNum>smallNum)
            {
                c= bigNum-smallNum;

            }
            else
            {
                b=bigNum;
                a=smallNum;
                c=a-b;

            }
            return c;

        }

    int convertString(String value)
    {
        return Integer.parseInt(value);
    }
}