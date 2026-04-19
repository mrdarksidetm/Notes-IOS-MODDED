package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import f3.j;
import u4.c;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f4469d0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, j.a(context, c.f21621f, R.attr.preferenceScreenStyle));
        this.f4469d0 = true;
    }

    @Override // androidx.preference.Preference
    protected void z() {
        if (l() == null && j() == null && M() != 0) {
            q();
            throw null;
        }
    }
}
