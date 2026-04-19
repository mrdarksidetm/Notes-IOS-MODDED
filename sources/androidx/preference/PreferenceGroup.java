package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.common.api.a;
import f3.j;
import java.util.ArrayList;
import java.util.List;
import u4.g;
import z.c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    final c0<String, Long> G;
    private final Handler H;
    private final List<Preference> I;
    private boolean X;
    private int Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f4465a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private b f4466b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final Runnable f4467c0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.G.clear();
            }
        }
    }

    public interface b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.G = new c0<>();
        this.H = new Handler(Looper.getMainLooper());
        this.X = true;
        this.Y = 0;
        this.Z = false;
        this.f4465a0 = a.e.API_PRIORITY_OTHER;
        this.f4466b0 = null;
        this.f4467c0 = new a();
        this.I = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f21677v0, i10, i11);
        int i12 = g.f21681x0;
        this.X = j.b(typedArrayObtainStyledAttributes, i12, i12, true);
        int i13 = g.f21679w0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            N(j.d(typedArrayObtainStyledAttributes, i13, i13, a.e.API_PRIORITY_OTHER));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public Preference L(int i10) {
        return this.I.get(i10);
    }

    public int M() {
        return this.I.size();
    }

    public void N(int i10) {
        if (i10 != Integer.MAX_VALUE && !u()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f4465a0 = i10;
    }

    @Override // androidx.preference.Preference
    public void y(boolean z10) {
        super.y(z10);
        int iM = M();
        for (int i10 = 0; i10 < iM; i10++) {
            L(i10).C(this, z10);
        }
    }
}
