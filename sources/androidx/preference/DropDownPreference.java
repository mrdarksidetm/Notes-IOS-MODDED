package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import u4.c;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final Context f4422f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final ArrayAdapter f4423g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Spinner f4424h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f4425i0;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String string = DropDownPreference.this.O()[i10].toString();
                if (string.equals(DropDownPreference.this.P()) || !DropDownPreference.this.a(string)) {
                    return;
                }
                DropDownPreference.this.R(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f21618c);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4425i0 = new a();
        this.f4422f0 = context;
        this.f4423g0 = S();
        T();
    }

    private void T() {
        this.f4423g0.clear();
        if (M() != null) {
            for (CharSequence charSequence : M()) {
                this.f4423g0.add(charSequence.toString());
            }
        }
    }

    protected ArrayAdapter S() {
        return new ArrayAdapter(this.f4422f0, R.layout.simple_spinner_dropdown_item);
    }

    @Override // androidx.preference.Preference
    protected void x() {
        super.x();
        ArrayAdapter arrayAdapter = this.f4423g0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void z() {
        this.f4424h0.performClick();
    }
}
