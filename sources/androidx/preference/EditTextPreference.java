package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import f3.j;
import u4.c;
import u4.f;
import u4.g;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f4427a0;

    public static final class a implements Preference.e<EditTextPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f4428a;

        private a() {
        }

        public static a b() {
            if (f4428a == null) {
                f4428a = new a();
            }
            return f4428a;
        }

        @Override // androidx.preference.Preference.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.L()) ? editTextPreference.c().getString(f.f21628a) : editTextPreference.L();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, c.f21619d, R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f21676v, i10, i11);
        int i12 = g.f21678w;
        if (j.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            I(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected Object B(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    @Override // androidx.preference.Preference
    public boolean J() {
        return TextUtils.isEmpty(this.f4427a0) || super.J();
    }

    public String L() {
        return this.f4427a0;
    }
}
