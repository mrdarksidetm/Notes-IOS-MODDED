package com.amazon.device.drm.a.c;

import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RequestId f7742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LicenseResponse.RequestStatus f7743b;

    public a a(LicenseResponse.RequestStatus requestStatus) {
        this.f7743b = requestStatus;
        return this;
    }

    public a a(RequestId requestId) {
        this.f7742a = requestId;
        return this;
    }

    public LicenseResponse a() {
        return new LicenseResponse(this);
    }

    public RequestId b() {
        return this.f7742a;
    }

    public LicenseResponse.RequestStatus c() {
        return this.f7743b;
    }
}
