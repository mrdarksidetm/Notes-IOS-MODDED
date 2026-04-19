package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import f3.j;
import u4.c;
import u4.g;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a Z;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (CheckBoxPreference.this.a(Boolean.valueOf(z10))) {
                CheckBoxPreference.this.M(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, c.f21616a, R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.Z = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f21632b, i10, i11);
        P(j.m(typedArrayObtainStyledAttributes, g.f21648h, g.f21635c));
        O(j.m(typedArrayObtainStyledAttributes, g.f21646g, g.f21638d));
        N(j.b(typedArrayObtainStyledAttributes, g.f21644f, g.f21641e, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.G);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.Z);
        }
    }

    private void S(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            R(view.findViewById(R.id.checkbox));
            Q(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    protected void E(View view) {
        super.E(view);
        S(view);
    }
}
