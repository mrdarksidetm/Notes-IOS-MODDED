package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import f3.j;
import u4.c;
import u4.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence G;
    private CharSequence H;
    private Drawable I;
    private CharSequence X;
    private CharSequence Y;
    private int Z;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, c.f21617b, R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f21650i, i10, i11);
        String strM = j.m(typedArrayObtainStyledAttributes, g.f21670s, g.f21652j);
        this.G = strM;
        if (strM == null) {
            this.G = t();
        }
        this.H = j.m(typedArrayObtainStyledAttributes, g.f21668r, g.f21654k);
        this.I = j.c(typedArrayObtainStyledAttributes, g.f21664p, g.f21656l);
        this.X = j.m(typedArrayObtainStyledAttributes, g.f21674u, g.f21658m);
        this.Y = j.m(typedArrayObtainStyledAttributes, g.f21672t, g.f21660n);
        this.Z = j.l(typedArrayObtainStyledAttributes, g.f21666q, g.f21662o, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void z() {
        q();
        throw null;
    }
}
