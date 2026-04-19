package w8;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f22620a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t8.h f22621b;

    public d0(t8.h hVar) {
        m.k(hVar);
        this.f22621b = hVar;
    }

    public final int a(Context context, int i10) {
        return this.f22620a.get(i10, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int b(Context context, a.f fVar) {
        m.k(context);
        m.k(fVar);
        int i10 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int iA = a(context, minApkVersion);
        if (iA == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f22620a.size()) {
                    i10 = -1;
                    break;
                }
                int iKeyAt = this.f22620a.keyAt(i11);
                if (iKeyAt > minApkVersion && this.f22620a.get(iKeyAt) == 0) {
                    break;
                }
                i11++;
            }
            iA = i10 == -1 ? this.f22621b.h(context, minApkVersion) : i10;
            this.f22620a.put(minApkVersion, iA);
        }
        return iA;
    }

    public final void c() {
        this.f22620a.clear();
    }
}
