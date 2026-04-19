package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import f3.j;
import u4.c;
import u4.g;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private CharSequence f4478a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private CharSequence f4479b0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreference.this.a(Boolean.valueOf(z10))) {
                SwitchPreference.this.M(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, c.f21625j, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.Z = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.J0, i10, i11);
        P(j.m(typedArrayObtainStyledAttributes, g.R0, g.K0));
        O(j.m(typedArrayObtainStyledAttributes, g.Q0, g.L0));
        S(j.m(typedArrayObtainStyledAttributes, g.T0, g.N0));
        R(j.m(typedArrayObtainStyledAttributes, g.S0, g.O0));
        N(j.b(typedArrayObtainStyledAttributes, g.P0, g.M0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void T(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.G);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f4478a0);
            r42.setTextOff(this.f4479b0);
            r42.setOnCheckedChangeListener(this.Z);
        }
    }

    private void U(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(R.id.switch_widget));
            Q(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    protected void E(View view) {
        super.E(view);
        U(view);
    }

    public void R(CharSequence charSequence) {
        this.f4479b0 = charSequence;
        x();
    }

    public void S(CharSequence charSequence) {
        this.f4478a0 = charSequence;
        x();
    }
}
