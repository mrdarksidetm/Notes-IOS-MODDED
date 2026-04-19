package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class b extends Exception {

    @Deprecated
    protected final Status mStatus;

    public b(Status status) {
        super(status.x() + ": " + (status.z() != null ? status.z() : ""));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.x();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.z();
    }
}
