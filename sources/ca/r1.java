package ca;

import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 {
    public static zzahr a(ba.h hVar, String str) {
        w8.m.k(hVar);
        if (ba.f0.class.isAssignableFrom(hVar.getClass())) {
            return ba.f0.A((ba.f0) hVar, str);
        }
        if (ba.l.class.isAssignableFrom(hVar.getClass())) {
            return ba.l.A((ba.l) hVar, str);
        }
        if (ba.z0.class.isAssignableFrom(hVar.getClass())) {
            return ba.z0.A((ba.z0) hVar, str);
        }
        if (ba.d0.class.isAssignableFrom(hVar.getClass())) {
            return ba.d0.A((ba.d0) hVar, str);
        }
        if (ba.s0.class.isAssignableFrom(hVar.getClass())) {
            return ba.s0.A((ba.s0) hVar, str);
        }
        if (ba.x1.class.isAssignableFrom(hVar.getClass())) {
            return ba.x1.G((ba.x1) hVar, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
