package com.amazon.device.iap.model;

/* JADX INFO: loaded from: classes.dex */
public class UserDataRequest {
    private boolean fetchLWAConsentStatus;

    public static class Builder {
        private boolean fetchLWAConsentStatus;

        private Builder() {
        }

        public UserDataRequest build() {
            return new UserDataRequest(this);
        }

        public Builder setFetchLWAConsentStatus(boolean z10) {
            this.fetchLWAConsentStatus = z10;
            return this;
        }
    }

    public UserDataRequest(Builder builder) {
        this.fetchLWAConsentStatus = builder.fetchLWAConsentStatus;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean getFetchLWAConsentStatus() {
        return this.fetchLWAConsentStatus;
    }
}
