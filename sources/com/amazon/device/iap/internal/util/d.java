package com.amazon.device.iap.internal.util;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    LEGACY(0),
    V1(1),
    V2(2),
    V3(3);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7906e;

    d(int i10) {
        this.f7906e = i10;
    }

    int a() {
        return this.f7906e;
    }

    public boolean a(d dVar) {
        return dVar != null && this.f7906e < dVar.f7906e;
    }
}
