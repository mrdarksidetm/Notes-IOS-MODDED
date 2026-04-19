package com.google.android.gms.common;

import t8.h;

/* JADX INFO: loaded from: classes.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i10) {
        super(i10, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + h.f21327a + " but found " + i10 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
