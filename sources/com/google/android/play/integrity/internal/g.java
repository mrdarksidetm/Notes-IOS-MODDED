package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import q9.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends e implements w {
    public g() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.e
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) q9.l.a(parcel, Bundle.CREATOR);
        q9.l.b(parcel);
        b(bundle);
        return true;
    }
}
