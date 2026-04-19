package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean G;
    private CharSequence H;
    private CharSequence I;
    private boolean X;
    private boolean Y;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    protected Object B(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    @Override // androidx.preference.Preference
    public boolean J() {
        return (this.Y ? this.G : !this.G) || super.J();
    }

    public boolean L() {
        return this.G;
    }

    public void M(boolean z10) {
        boolean z11 = this.G != z10;
        if (z11 || !this.X) {
            this.G = z10;
            this.X = true;
            F(z10);
            if (z11) {
                y(J());
                x();
            }
        }
    }

    public void N(boolean z10) {
        this.Y = z10;
    }

    public void O(CharSequence charSequence) {
        this.I = charSequence;
        if (L()) {
            return;
        }
        x();
    }

    public void P(CharSequence charSequence) {
        this.H = charSequence;
        if (L()) {
            x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void Q(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.G
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.H
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.H
        L17:
            r5.setText(r0)
            r0 = r2
            goto L2b
        L1c:
            boolean r1 = r4.G
            if (r1 != 0) goto L2b
            java.lang.CharSequence r1 = r4.I
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2b
            java.lang.CharSequence r0 = r4.I
            goto L17
        L2b:
            if (r0 == 0) goto L3b
            java.lang.CharSequence r1 = r4.r()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3b
            r5.setText(r1)
            r0 = r2
        L3b:
            r1 = 8
            if (r0 != 0) goto L40
            goto L41
        L40:
            r2 = r1
        L41:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4a
            r5.setVisibility(r2)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.Q(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    protected void z() {
        super.z();
        boolean z10 = !L();
        if (a(Boolean.valueOf(z10))) {
            M(z10);
        }
    }
}
