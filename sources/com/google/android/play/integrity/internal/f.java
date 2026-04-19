package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import q9.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends e implements s {
    public f() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.e
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) q9.l.a(parcel, Bundle.CREATOR);
            q9.l.b(parcel);
            e(bundle);
            return true;
        }
        if (i10 == 3) {
            Bundle bundle2 = (Bundle) q9.l.a(parcel, Bundle.CREATOR);
            q9.l.b(parcel);
            c(bundle2);
            return true;
        }
        if (i10 == 4) {
            Bundle bundle3 = (Bundle) q9.l.a(parcel, Bundle.CREATOR);
            q9.l.b(parcel);
            d(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) q9.l.a(parcel, Bundle.CREATOR);
        q9.l.b(parcel);
        b(bundle4);
        return true;
    }
}
