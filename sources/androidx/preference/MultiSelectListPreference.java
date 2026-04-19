package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import f3.j;
import java.util.HashSet;
import java.util.Set;
import u4.c;
import u4.g;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private CharSequence[] f4435a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private CharSequence[] f4436b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Set<String> f4437c0;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, c.f21617b, R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4437c0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.D, i10, i11);
        this.f4435a0 = j.o(typedArrayObtainStyledAttributes, g.G, g.E);
        this.f4436b0 = j.o(typedArrayObtainStyledAttributes, g.H, g.F);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected Object B(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
