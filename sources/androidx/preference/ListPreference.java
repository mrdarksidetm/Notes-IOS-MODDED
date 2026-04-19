package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import f3.j;
import u4.c;
import u4.f;
import u4.g;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private CharSequence[] f4429a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private CharSequence[] f4430b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f4431c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private String f4432d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f4433e0;

    public static final class a implements Preference.e<ListPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f4434a;

        private a() {
        }

        public static a b() {
            if (f4434a == null) {
                f4434a = new a();
            }
            return f4434a;
        }

        @Override // androidx.preference.Preference.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.N()) ? listPreference.c().getString(f.f21628a) : listPreference.N();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, c.f21617b, R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f21680x, i10, i11);
        this.f4429a0 = j.o(typedArrayObtainStyledAttributes, g.A, g.f21682y);
        this.f4430b0 = j.o(typedArrayObtainStyledAttributes, g.B, g.f21684z);
        int i12 = g.C;
        if (j.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            I(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.I, i10, i11);
        this.f4432d0 = j.m(typedArrayObtainStyledAttributes2, g.f21667q0, g.Q);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int Q() {
        return L(this.f4431c0);
    }

    @Override // androidx.preference.Preference
    protected Object B(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public int L(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f4430b0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f4430b0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] M() {
        return this.f4429a0;
    }

    public CharSequence N() {
        CharSequence[] charSequenceArr;
        int iQ = Q();
        if (iQ < 0 || (charSequenceArr = this.f4429a0) == null) {
            return null;
        }
        return charSequenceArr[iQ];
    }

    public CharSequence[] O() {
        return this.f4430b0;
    }

    public String P() {
        return this.f4431c0;
    }

    public void R(String str) {
        boolean z10 = !TextUtils.equals(this.f4431c0, str);
        if (z10 || !this.f4433e0) {
            this.f4431c0 = str;
            this.f4433e0 = true;
            H(str);
            if (z10) {
                x();
            }
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence r() {
        if (s() != null) {
            return s().a(this);
        }
        CharSequence charSequenceN = N();
        CharSequence charSequenceR = super.r();
        String str = this.f4432d0;
        if (str == null) {
            return charSequenceR;
        }
        Object[] objArr = new Object[1];
        if (charSequenceN == null) {
            charSequenceN = "";
        }
        objArr[0] = charSequenceN;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceR)) {
            return charSequenceR;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }
}
