package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import f3.j;
import u4.c;
import u4.d;
import u4.g;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private CharSequence f4481a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private CharSequence f4482b0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreferenceCompat.this.a(Boolean.valueOf(z10))) {
                SwitchPreferenceCompat.this.M(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f21624i);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.Z = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.U0, i10, i11);
        P(j.m(typedArrayObtainStyledAttributes, g.f21637c1, g.V0));
        O(j.m(typedArrayObtainStyledAttributes, g.f21634b1, g.W0));
        S(j.m(typedArrayObtainStyledAttributes, g.f21643e1, g.Y0));
        R(j.m(typedArrayObtainStyledAttributes, g.f21640d1, g.Z0));
        N(j.b(typedArrayObtainStyledAttributes, g.f21631a1, g.X0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void T(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.G);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f4481a0);
            switchCompat.setTextOff(this.f4482b0);
            switchCompat.setOnCheckedChangeListener(this.Z);
        }
    }

    private void U(View view) {
        if (((AccessibilityManager) c().getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(d.f21626a));
            Q(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    protected void E(View view) {
        super.E(view);
        U(view);
    }

    public void R(CharSequence charSequence) {
        this.f4482b0 = charSequence;
        x();
    }

    public void S(CharSequence charSequence) {
        this.f4481a0 = charSequence;
        x();
    }
}
