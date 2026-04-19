package com.google.android.gms.common.api.internal;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v8.b f8548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t8.d f8549b;

    /* synthetic */ w(v8.b bVar, t8.d dVar, v8.q qVar) {
        this.f8548a = bVar;
        this.f8549b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof w)) {
            w wVar = (w) obj;
            if (w8.k.b(this.f8548a, wVar.f8548a) && w8.k.b(this.f8549b, wVar.f8549b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return w8.k.c(this.f8548a, this.f8549b);
    }

    public final String toString() {
        return w8.k.d(this).a(SubscriberAttributeKt.JSON_NAME_KEY, this.f8548a).a("feature", this.f8549b).toString();
    }
}
