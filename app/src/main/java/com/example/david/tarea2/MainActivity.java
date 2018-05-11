package com.example.david.tarea2;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.InputType;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.text.InputFilter;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rl;
    LinearLayout ll;
    TextView tvNombreAlumno, tvApellidos, tvNumCuenta, tvCorreo, tvGenero, tvFacultad;
    EditText etNombreAlumno, etApellidos, etNumCuenta, etCorreo;
    RadioButton etMasculino, etFemenino, etIngenieria, etCiencias, etMedicina, etDerecho, etEconomia;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl = (RelativeLayout) findViewById(R.id.rl);

        if(Build.VERSION.SDK_INT>=23)
            rl.setBackgroundColor(getApplicationContext().getColor(R.color.colorFondo));
        else
            rl.setBackgroundColor(getResources().getColor(R.color.colorFondo));

        ll = new LinearLayout(this);
        tvNombreAlumno = new TextView(this);
        etNombreAlumno = new EditText(this);
        tvApellidos = new TextView(this);
        etApellidos = new EditText(this);
        tvNumCuenta = new TextView(this);
        etNumCuenta = new EditText(this);
        tvCorreo = new TextView(this);
        etCorreo = new EditText(this);
        tvGenero = new TextView(this);
        etMasculino = new RadioButton(this);
        etFemenino = new RadioButton(this);
        tvFacultad = new TextView(this);
        etIngenieria = new RadioButton(this);
        etMedicina = new RadioButton(this);
        etDerecho = new RadioButton(this);
        etCiencias = new RadioButton(this);
        etEconomia = new RadioButton(this);
        btnGuardar = new Button(this);

        ll.setLayoutParams(new LinearLayout.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT,LinearLayoutCompat.LayoutParams.MATCH_PARENT));
        ll.setOrientation(LinearLayout.VERTICAL);

        rl.addView(ll);

        tvNombreAlumno.setText(R.string.nombre);
        tvNombreAlumno.setTextSize(TypedValue.COMPLEX_UNIT_SP,26);
        tvNombreAlumno.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        ll.addView(tvNombreAlumno);

        etNombreAlumno.setHint(R.string.nombreInstruccion);
        etNombreAlumno.setTextColor(getResources().getColor(R.color.colorPrimary));
        etNombreAlumno.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        ll.addView(etNombreAlumno);

        tvApellidos.setText(R.string.apellidos);
        tvApellidos.setTextSize(TypedValue.COMPLEX_UNIT_SP,26);
        tvApellidos.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        ll.addView(tvApellidos);

        etApellidos.setHint(R.string.apellidosInstruccion);
        etApellidos.setTextColor(getResources().getColor(R.color.colorPrimary));
        etApellidos.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        ll.addView(etApellidos);

        tvNumCuenta.setText(R.string.num_cuenta);
        tvNumCuenta.setTextSize(TypedValue.COMPLEX_UNIT_SP,26);
        tvNumCuenta.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        ll.addView(tvNumCuenta);

        etNumCuenta.setHint(R.string.cuentaInstruccion);
        etNumCuenta.setTextColor(getResources().getColor(R.color.colorPrimary));
        etNumCuenta.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
        etNumCuenta.setInputType(InputType.TYPE_CLASS_NUMBER);
        etNumCuenta.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});

        ll.addView(etNumCuenta);

        tvCorreo.setText(R.string.correo);
        tvCorreo.setTextSize(TypedValue.COMPLEX_UNIT_SP,26);
        tvCorreo.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        ll.addView(tvCorreo);

        etCorreo.setHint(R.string.correoInstruccion);
        etCorreo.setTextColor(getResources().getColor(R.color.colorPrimary));
        etCorreo.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        ll.addView(etCorreo);

        tvGenero.setText(R.string.genero);
        tvGenero.setTextSize(TypedValue.COMPLEX_UNIT_SP,26);
        tvGenero.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        ll.addView(tvGenero);

        etMasculino.setText(R.string.masculino);
        etMasculino.setChecked(false);
        etMasculino.setTextColor(getResources().getColor(R.color.colorPrimary));
        etMasculino.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        ll.addView(etMasculino);

        etFemenino.setText(R.string.femenino);
        etFemenino.setChecked(false);
        etFemenino.setTextColor(getResources().getColor(R.color.colorPrimary));
        etFemenino.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        ll.addView(etFemenino);

        tvFacultad.setText(R.string.facultad);
        tvFacultad.setTextSize(TypedValue.COMPLEX_UNIT_SP,26);
        tvFacultad.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        ll.addView(tvFacultad);

        etIngenieria.setText(R.string.ingenieria);
        etIngenieria.setChecked(false);
        etIngenieria.setTextColor(getResources().getColor(R.color.colorPrimary));
        etIngenieria.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        ll.addView(etIngenieria);

        etCiencias.setText(R.string.ciencias);
        etCiencias.setChecked(false);
        etCiencias.setTextColor(getResources().getColor(R.color.colorPrimary));
        etCiencias.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        ll.addView(etCiencias);

        etMedicina.setText(R.string.medicina);
        etMedicina.setChecked(false);
        etMedicina.setTextColor(getResources().getColor(R.color.colorPrimary));
        etMedicina.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        ll.addView(etMedicina);

        etDerecho.setText(R.string.derecho);
        etDerecho.setChecked(false);
        etDerecho.setTextColor(getResources().getColor(R.color.colorPrimary));
        etDerecho.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        ll.addView(etDerecho);

        etEconomia.setText(R.string.economia);
        etEconomia.setChecked(false);
        etEconomia.setTextColor(getResources().getColor(R.color.colorPrimary));
        etEconomia.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        ll.addView(etEconomia);

        btnGuardar.setText(R.string.enviar);

        ll.addView(btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Alumno guardado", Toast.LENGTH_LONG).show();
            }
        });

    }
}
